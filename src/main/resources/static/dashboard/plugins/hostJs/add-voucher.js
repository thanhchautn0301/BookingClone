$(function () {
    bsCustomFileInput.init();
  
  });
  $('.select2').select2()

  //Initialize Select2 Elements
  $('.select2bs4').select2({
    theme: 'bootstrap4'
  })

  $('#datemask').inputmask('dd/mm/yyyy', { 'placeholder': 'dd/mm/yyyy' })

  $('[data-mask]').inputmask()


  $('#reservationdatetime').datetimepicker({
    format:'DD/MM/YYYY',
    minDate: new Date()
    });


  $('#voucherAddForm').validate({
    rules:{
        priceDiscount: {
        required: true,
        number: true,
        min: 0
      },
      expDate:{
        required: true
      },
      name:{
        required: true
      }
    }
    ,messages:{
        priceDiscount: {
        required: 'Vui lòng nhập giá trị voucher',
        number: 'Vui lòng nhập đúng định giá',
        min: 'Giá trị không được nhỏ hơn 0'
      },
      expDate:{
        required: 'Vui lòng chọn thời gian kết thúc'
      },
      name:{
        required: 'Vui lòng nhập tên'
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