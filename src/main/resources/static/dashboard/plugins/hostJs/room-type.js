$(function () {
    bsCustomFileInput.init();
    $("#infoTable").DataTable({
      language:{    
          "decimal":        "",
          "emptyTable":     "Không có kiểu phòng nào",
          "info":           "Hiển thị _START_ đến _END_ của _TOTAL_ kiểu phòng",
          "infoEmpty":      "Hiển thị 0 đến 0 của 0 kiểu phòng",
          "infoFiltered":   "(filtered from _MAX_ total entries)",
          "infoPostFix":    "",
          "thousands":      ",",
          "lengthMenu":     "Hiển thị _MENU_ kiểu phòng",
          "loadingRecords": "Loading...",
          "processing":     "",
          "search":         "Tìm kiếm:",
          "zeroRecords":    "Không tìm thấy kiểu phòng này",
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
      pageLength: 7,
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

  $('#datemask').inputmask('dd/mm/yyyy', { 'placeholder': 'dd/mm/yyyy' })

  $('[data-mask]').inputmask()


  $('select[name="quantityAdult"]').on('change',function(){
    let adultQuantity = $('select[name="quantityAdult"] option:selected').val();
    let childQuantity = $('select[name="quantityChildren"] option:selected').val();
    let result = (+adultQuantity)+(+childQuantity);
    $('input[name="capacity"]').val(result);
  })

  $('select[name="quantityChildren"]').on('change',function(){
    let adultQuantity = $('select[name="quantityAdult"] option:selected').val();
    let childQuantity = $('select[name="quantityChildren"] option:selected').val();
    let result = (+adultQuantity)+(+childQuantity);
    $('input[name="capacity"]').val(result);
  })
  

  

  $('#reservationdatetime').datetimepicker({
    format: 'L',
    minDate: new Date()
    });


  $('#roomAddForm').validate({
    rules:{
      name: {
        required: true
      }
    }
    ,messages:{
      name: {
        required: 'Vui lòng nhập tên kiểu phòng'
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

  $('#infoTable').on('click','a',function(e){   
    var currentRow = $(this).closest('tr');
    $('#modal-info #editForm input').removeClass('is-invalid');
    $('#modal-info #editForm input').attr('aria-invalid',"false");
  
    var id = currentRow.find("input[type='hidden'][name='id']").val(); 
    var name = currentRow.find("td:eq(1)").text(); 
    var capacity = currentRow.find("td:eq(2)").text(); 
    var adults = currentRow.find("td:eq(3)").text(); 
    var childs = currentRow.find("td:eq(4)").text(); 
    var desc = currentRow.find("td:eq(5)").text(); 
  
    $('#modal-info #editForm input[name="name"]').val(name.trim());
    $('#modal-info #editForm input[name="id"]').val(id);
    $('#modal-info #editForm input[name="capacity"]').val(capacity);
    $('#modal-info #editForm select[name="quantityAdult"]').val(adults);
    $('#modal-info #editForm select[name="quantityChildren"]').val(childs);
    $('#modal-info #editForm textarea[name="description"]').val(desc);

    $('#modal-info #editForm select[name="quantityAdult"]').on('change',function(){
      let adultQuantity = $('#modal-info #editForm select[name="quantityAdult"] option:selected').val();
      let childQuantity = $('#modal-info #editForm select[name="quantityChildren"] option:selected').val();
      let result = (+adultQuantity)+(+childQuantity);
      $('#modal-info #editForm input[name="capacity"]').val(result);
    })
  
    $('#modal-info #editForm select[name="quantityChildren"]').on('change',function(){
      let adultQuantity = $('#modal-info #editForm select[name="quantityAdult"] option:selected').val();
      let childQuantity = $('#modal-info #editForm select[name="quantityChildren"] option:selected').val();
      let result = (+adultQuantity)+(+childQuantity);
      $('#modal-info #editForm input[name="capacity"]').val(result);
    })
  }) 