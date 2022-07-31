$(function () {
    bsCustomFileInput.init();
    $("#voucherTable").DataTable({
      language:{    
          "decimal":        "",
          "emptyTable":     "Không có Voucher nào",
          "info":           "Hiển thị _START_ đến _END_ của _TOTAL_ Voucher",
          "infoEmpty":      "Hiển thị 0 đến 0 của 0 Voucher",
          "infoFiltered":   "",
          "infoPostFix":    "",
          "thousands":      ",",
          "lengthMenu":     "Hiển thị _MENU_ Voucher",
          "loadingRecords": "Loading...",
          "processing":     "",
          "search":         "Tìm kiếm:",
          "zeroRecords":    "Không tìm thấy Voucher này",
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
    var rowLength = $('#voucherTable tbody').find('tr').length;
    for(let i = 0 ; i < rowLength;i++){
      $('#voucherTable tbody tr:eq('+i+') td:eq(0)').html(i+1);
    }
  });
  $('.select2').select2()

  //Initialize Select2 Elements
  $('.select2bs4').select2({
    theme: 'bootstrap4'
  })

  $('[data-mask]').inputmask()

  $('.select2').select2()

  //Initialize Select2 Elements
  $('.select2bs4').select2({
    theme: 'bootstrap4'
  })

  $('[data-mask]').inputmask()

  $('#expDate').datetimepicker({
    format:'DD/MM/YYYY',
    minDate: new Date()
    });


    $('#editForm').validate({
      rules:{
          expDate:{
            required: true
          },
          priceDiscount:{
            required: true,
            number: true,
            min: 0
          }
      }
      ,messages:{
        expDate:{
          required: 'Vui lòng chọn ngày hết hạn'
        },
        priceDiscount:{
          required: 'Vui lòng nhập giá trị voucher',
          number: 'Vui lòng nhập đúng định giá',
          min: 'Giá trị không được nhỏ hơn 0'
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
    $('#voucherTable').on('click','a',function(e){   
      var currentRow = $(this).closest('tr');
      $('#modal-info #editForm input').removeClass('is-invalid');
      $('#modal-info #editForm input').attr('aria-invalid',"false");
      
      var id =currentRow.find("input[type='hidden'][name='id']").val(); 
      var accommodation = currentRow.find("td:eq(1)").data('id');
      var priceDiscount =currentRow.find("td:eq(2)").text().trim(); 
      var expDate =currentRow.find("td:eq(3)").text().trim();

      $('#modal-info #editForm select[name="accomodation_id"]').val(accommodation).trigger('change');
      $('#modal-info #editForm input[name="priceDiscount"]').val(priceDiscount);
      $('#modal-info #editForm input[name="expDate"]').val(expDate);
      $('#modal-info #editForm input[name="id"]').val(id);
    })