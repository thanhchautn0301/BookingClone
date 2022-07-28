
  $(function () {
    bsCustomFileInput.init();
    $('#summernote').summernote();
  });
  $('.select2').select2()

  //Initialize Select2 Elements
  $('.select2bs4').select2({
    theme: 'bootstrap4'
  })

  $('#roomAddForm').validate({
    rules:{
        accomodationType: {
        	required: true
      },
      	service:{
			required: true,
			minlength: 5
	  },
	  	price:{
			min:0,
			required: true,
			number: true
		}
    }
    ,messages:{
        accomodationType: {
        required: 'Vui lòng thêm ít nhất 1 dịch vụ'
      },
      	service:{
			required: 'Please enter service name',
			minlenth: 'Minimum length of name must be greater than 4'
	  },
	  	price:{
			min: 'Your service price cannot be less than 0',
			required: 'Please enter your service price',
			number: 'Service price cannot contain characters'
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