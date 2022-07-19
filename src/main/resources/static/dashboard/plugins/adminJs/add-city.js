$(function () {
    bsCustomFileInput.init();
	   $("#infoTable").DataTable({
	      language:{    
	          "decimal":        "",
	          "emptyTable":     "Không có thành phố nào",
	          "info":           "Hiển thị _START_ đến _END_ của _TOTAL_ thành phố",
	          "infoEmpty":      "Hiển thị 0 đến 0 của 0 thành phố",
	          "infoFiltered":   "(filtered from _MAX_ total entries)",
	          "infoPostFix":    "",
	          "thousands":      ",",
	          "lengthMenu":     "Hiển thị _MENU_ thành phố",
	          "loadingRecords": "Loading...",
	          "processing":     "",
	          "search":         "Tìm kiếm:",
	          "zeroRecords":    "Không tìm thấy thành phố này",
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

  $('#dob').datetimepicker({
    format: 'L'
    });


  $('#addForm').validate({
    rules:{
        name: {
          required: true,
          minlength: 5
        }
    }
    ,messages:{
      name: {
        required: 'Vui lòng nhập tên thành phố',
        minlength: 'Tên thành phố phải có ít nhất 5 chữ cái'
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
  
  var Toast = Swal.mixin({
      toast: true,
      position: 'top-end',
      showConfirmButton: false,
      timer: 3000
    });
  

  $('#modal-info #editForm').validate({
    rules:{
        name: {
          required: true,
          minlength: 5
        }
    }
    ,messages:{
      name: {
        required: 'Vui lòng nhập tên thành phố',
        minlength: 'Tên thành phố phải có ít nhất 5 chữ cái'
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

  var id = currentRow.find('input[type="hidden"][name="id"]').val();
  var name =currentRow.find("td:eq(1)").text().trim(); 


  $('#modal-info #editForm input[name="name"]').val(name);
  $('#modal-info #editForm input[name="id"]').val(id);
}) 

