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
  });
  $('.select2').select2()

  //Initialize Select2 Elements
  $('.select2bs4').select2({
    theme: 'bootstrap4'
  })

  $('#accomodationAddForm').validate({
    rules:{
        name: {
            required: true,
            minlength: 5
      },
      	city_id:{
			required: true
		},
		category_id:{
			required: true
		},
        photos:{
            required: true,
            accept: "image/jpeg, image/pjpeg, image/png"
        }
    }
    ,messages:{
        name: {
            required: 'Vui lòng nhập tên chỗ nghỉ',
            minlength: 'Tên chỗ nghỉ phải có ít nhất 5 chữ cái'
      	},
      	city_id:{
			required: 'Vui lòng chọn thành phố'
		},
		category_id:{
			required: 'Vui lòng chọn danh mục'
		},
        photos:{
            required: 'Vui lòng thêm ít nhất 1 hình cho chỗ nghỉ',
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