$(function () {
    bsCustomFileInput.init();
    $("#infoTable").DataTable({
      language:{    
          "decimal":        "",
          "emptyTable":     "Không có chỗ nghỉ nào",
          "info":           "Hiển thị _START_ đến _END_ của _TOTAL_ chỗ nghỉ",
          "infoEmpty":      "Hiển thị 0 đến 0 của 0 chỗ nghỉ",
          "infoFiltered":   "",
          "infoPostFix":    "",
          "thousands":      ",",
          "lengthMenu":     "Hiển thị _MENU_ chỗ nghỉ",
          "loadingRecords": "Loading...",
          "processing":     "",
          "search":         "Tìm kiếm:",
          "zeroRecords":    "Không tìm thấy chỗ nghỉ này",
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
        photos:{
          accept: "image/jpeg, image/pjpeg, image/png"
        }
    }
    ,messages:{
      name: {
        required: 'Vui lòng nhập tên chỗ nghỉ',
        minlength: 'Tên chỗ nghỉ phải có ít nhất 5 chữ cái'
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
  var city = currentRow.find("td:eq(2)").data('id'); 
  var category = currentRow.find("td:eq(3)").data('id');
  var desc = $('.card-body').find("textarea[name='description'][data-id='"+id+"']").val();

  $('#modal-info #editForm input[name="name"]').val(name.trim());
  $('#modal-info #editForm input[name="id"]').val(id);
  $('#modal-info #editForm select[name="city_id"]').val(city).trigger('change');
  $('#modal-info #editForm select[name="category_id"]').val(category).trigger('change');
  $('#modal-info #editForm textarea[name="description"]').val(desc);
}) 