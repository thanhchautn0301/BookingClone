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

  $('#roomAddForm').validate({
    rules:{
      name: {
        required: true,
        minlength: 5
      },
      price:{
        required: true,
        min: 0
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
      price:{
        required: 'Vui lòng nhập giá phòng',
        min: 'Giá không được nhỏ hơn 0',
        number: 'Giá không được chứa chữ'
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