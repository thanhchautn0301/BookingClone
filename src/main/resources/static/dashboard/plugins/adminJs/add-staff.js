$(function () {
    bsCustomFileInput.init();
  });
  $('.select2').select2()

  //Initialize Select2 Elements
  $('.select2bs4').select2({
    theme: 'bootstrap4'
  })

  $('[data-mask]').inputmask()

  $('#dob').datetimepicker({
    format: 'DD/MM/yyyy'
    });


  $('#staffAddForm').validate({
    rules:{
        name: {
          required: true
          ,minlength: 5
        },
        dob:{
          required: true
        },
        phone:{
          required: true
        },
        email:{
          required: true,
          email: true
        },
        address:{
	      required: true
		}
        ,
        civilIdentity:{
          required: true
        },
        role_id:{ 
		  required: true
		}
    }
    ,messages:{
      name: {
        required: 'Vui lòng nhập tên Staff',
        minlength: 'Tên Staff phải có ít nhất 5 chữ'
      },
      dob:{
        required: 'Vui lòng chọn ngày sinh'
      },
      phone:{
        required: 'Vui lòng nhập số điện thoại'
      },
      email:{
        required: 'Vui lòng nhập email',
        email: 'Vui lòng nhập đúng định dạng Email'
      },
      address:{
	      required: 'Vui lòng nhập địa chỉ'
		},
      civilIdentity:{
        required: 'Vui lòng nhập CCCD-CMND'
      },
      role_id:{
		required: 'Vui lòng cấp quyền cho tài khoản'
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