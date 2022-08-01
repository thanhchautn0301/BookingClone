$(function () {
    bsCustomFileInput.init();
    $('#summernote').summernote({
      toolbar: [
       // [groupName, [list of button]]
       ['style', ['bold', 'italic', 'underline', 'clear']],
       ['font', ['strikethrough']],
       ['fontsize', ['fontsize']],
       ['color', ['color']],
       ['para', ['ul', 'ol', 'paragraph']],
       ['height', ['height']]
       ]
     });
    $("#infoTable").DataTable({
      language:{    
          "decimal":        "",
          "emptyTable":     "Không có phòng nào",
          "info":           "Hiển thị _START_ đến _END_ của _TOTAL_ phòng",
          "infoEmpty":      "Hiển thị 0 đến 0 của 0 phòng",
          "infoFiltered":   "",
          "infoPostFix":    "",
          "thousands":      ",",
          "lengthMenu":     "Hiển thị _MENU_ phòng",
          "loadingRecords": "Loading...",
          "processing":     "",
          "search":         "Tìm kiếm:",
          "zeroRecords":    "Không tìm thấy phòng này",
          "paginate": {
              "first":      "First",
              "last":       "Last",
              "next":       "Tiếp",
              "previous":   "Trước"
          },
          "aria": {
              "sortAscending":  ": activate to sort column ascending",
              "sortDescending": ": activate to sort column descending"
          }
      },
      pageLength: 5,
      "responsive": true, "lengthChange": true, "autoWidth": false, "ordering": false
    }).buttons().container().appendTo('#roomTypeTable_wrapper .col-md-6:eq(0)');
    var t = $('#infoTable').DataTable({
		retrieve: true,
      	paging: false,
        columnDefs: [
            {
                searchable: false,
                orderable: false,
                targets: 0,
            },
        ],
        order: [[1, 'asc']],
    });
 
    t.on('order.dt search.dt', function () {
        let i = 1;
 
        t.cells(null, 0, { search: 'applied', order: 'applied' }).every(function (cell) {
            this.data(i++);
        });
    }).draw();
  });
  $('.select2').select2()

  //Initialize Select2 Elements
  $('.select2bs4').select2({
    theme: 'bootstrap4'
  })

  $('[data-mask]').inputmask()

  $('#modal-info #editForm').validate({
    rules:{
        name: {
          required: true,
          minlength: 5
        },
        roomType_id:{
		  required: true
		},
		accomodation_id:{
		  required: true
		},
        price:{
          required: true,
          min: 0,
          maxlength: 13
        },
        photos:{
          accept: "image/jpeg, image/pjpeg, image/png"
        }
    }
    ,messages:{
      name: {
        required: 'Vui lòng nhập tên phòng',
        minlength: 'Tên phòng phải có ít nhất 5 chữ cái'
      },
      roomType_id:{
		required: 'Vui lòng chọn kiểu phòng'
	  }
      ,
      accomodation_id:{
		required : 'Vui lòng chọn chỗ nghỉ'
	  },
      price:{
        required: 'Vui lòng nhập giá phòng',
        min: 'Giá không được nhỏ hơn 0',
        number: 'Giá không được chứa chữ',
        maxlength: 'Giá không được vượt quá 12 chữ số'
      },
      photos:{
        accept: 'Vui lòng thêm đúng định dạng ảnh jpg,jpeg,png'
      }
    },
    errorElement: 'span',
    errorPlacement: function (error, element) {
      error.addClass('invalid-feedback');
      element.closest('.form-group').append(error);
    },
    highlight: function (element, errorClass, validClass) {
      $(element).addClass('is-invalid');
    },
    unhighlight: function (element, errorClass, validClass) {
      $(element).removeClass('is-invalid');
    }
  })

 // --------------------------------------
 $('#infoTable').on('click','a',function(e){   
  var currentRow = $(this).closest('tr');
  $('#modal-info #editForm input').removeClass('is-invalid');
  $('#modal-info #editForm input').attr('aria-invalid',"false");

  var id = currentRow.find("input[type='hidden'][name='id']").val(); 
  var name = currentRow.find("td:eq(1)").text(); 
  var roomType = currentRow.find("td:eq(2)").data('id'); 
  var accommodation = currentRow.find("td:eq(3)").data('id'); 
  var price = currentRow.find("td:eq(4)").text(); 
  var desc = $('.card-body').find("textarea[name='description'][data-id='"+id+"']").val();


  $('#modal-info #editForm input[name="name"]').val(name.trim());
  $('#modal-info #editForm input[name="id"]').val(id);
  $('#modal-info #editForm select[name="accomodation_id"]').val(accommodation).trigger('change');
  $('#modal-info #editForm select[name="roomType_id"]').val(roomType).trigger('change');
  $('#modal-info #editForm input[name="price"]').val(price);

  $('#modal-info #editForm #summernote[name="description"]').summernote('code',desc); 
  

}) 

$('#infoTable').on('click','.btn-delete',function(ev){
	var currentRow = $(this).closest('tr');
	var deleteBtn = currentRow.find('.btn-delete');
	ev.preventDefault();	
	Swal.fire({
	  title: 'Are you sure?',
	  text: "You won't be able to revert this!",
	  icon: 'warning',
	  showCancelButton: true,
	  confirmButtonColor: '#3085d6',
	  cancelButtonColor: '#d33',
	  confirmButtonText: 'Yes, delete it!'
		}).then((result) => {
		  if (result.isConfirmed) {
		    Swal.fire(
				{
					showConfirmButton: false,
					title:'Deleted!',
		      		text:'Your file has been deleted.',
		      		icon:'success'
				}
		      
		    )
		   setTimeout(function(){
			window.location.href= deleteBtn.attr("href");
			},1500); 
		  }
		})
});



var resultValue = $('#show-msg-result').val().split("-");


if(resultValue[1] == 'success'){
		setTimeout(function(){
			Swal.fire(
			  resultValue[0]+' Room Success',
			  '',
			  'success'
		)
		},300);
}