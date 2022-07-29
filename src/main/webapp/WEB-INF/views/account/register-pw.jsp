<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==
    " crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/style.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/loginSuccess.css">
</head>
<body>

    <header class="bg-primary">
        <div class="container">
          <div class="row bg-primary">
            <div class="col-sm-12">
                <nav class="navbar navbar-expand-md bg-primary py-3">
                  <div class="container-fluid px-0">
                    <div class="navbar-brand">
                      <a href="index.html" class="text-decoration-none">
                        <svg xmlns="http://www.w3.org/2000/svg" class="" xmlns:xlink="http://www.w3.org/1999/xlink" width="97" height="18" viewBox="0 0 523 99">
                            <image width="523" height="99" xlink:href="data:img/png;base64,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"/>
                        </svg>
                      </a>
                    </div>
                    <div class="d-sm-block d-md-none flex-fill text-end me-2">
                      <a href="" class="p-2 btn-primary bd-r-2">
                        <i class="fa-regular fa-circle-user text-white fs-20"></i>
                      </a>
                    </div>
                    <button class="navbar-toggler btn-primary shadow-none" type="button" data-bs-toggle="collapse"
                      data-bs-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false"
                      aria-label="Toggle navigation">
                      <svg xmlns="http://www.w3.org/2000/svg" class="icon-size toggle-icon-mb" fill="none"
                        viewBox="0 0 24 24" stroke="currentColor" stroke-width="2">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M4 6h16M4 12h16M4 18h16" />
                      </svg>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarContent">
                      <ul class="navbar-nav ms-auto mb-2 mb-md-0 align-items-md-center d-md-flex d-sm-none">
                        <li class="nav-item me-2">
                          <button class="btn btn-primary btn-icon-nav" data-bs-toggle="tooltip" data-bs-placement="bottom"
                            title="Chọn ngôn ngữ của bạn">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" class="img-circle icon-size" alt="" />
                          </button>
                        </li>
    
                        <li class="nav-item me-2">
                          <button class="btn btn-primary btn-icon-nav" data-bs-toggle="tooltip" data-bs-placement="bottom"
                            title="Liên hệ dịch vụ khách hàng">
                            <svg class="icon-size" xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none"
                              viewBox="0 0 24 24" stroke="currentColor" stroke-width="2">
                              <path stroke-linecap="round" stroke-linejoin="round"
                                d="M8.228 9c.549-1.165 2.03-2 3.772-2 2.21 0 4 1.343 4 3 0 1.4-1.278 2.575-3.006 2.907-.542.104-.994.54-.994 1.093m0 3h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z" />
                            </svg>
                          </button>
                        </li>
                      </ul>
                      <!-- Mobile navbar -->
                      <ul
                        class="navbar-nav position-fixed top-0 bg-primary end-0 z-index-9999 start-0 bottom-0 d-md-none d-sm-block">
                        <li class="position-fixed top-0 end-0">
                          <button class="navbar-toggler shadow-none btn-primary p-3" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false"
                            aria-label="Toggle navigation">
                            <i class="fa-solid fa-x"></i>
                          </button>
                        </li>
                        <li>
                          <h4 class="text-white fw-bolder p-3">Khác</h4>
                        </li>
                        <li class="nav-item nav-item-hv p-3">
                          <a href="" class="text-decoration-none text-white fw-500">
                            <i class="fa-solid fa-circle-info me-2"></i>
                            Về TLTC.com
                          </a>
                        </li>
                        <li class="nav-item nav-item-hv p-3">
                          <a href="" class="text-decoration-none text-white fw-500">
                            <i class="fa-solid fa-scale-balanced me-2"></i>
                            Pháp lý
                          </a>
                        </li>
                      </ul>
                    </div>
                  </div>
                </nav>
            </div>
          </div>
        </div>
    </header>

    <div class="login-wrapper">
        <div class="container py-5 login-form overflow-hidden">
            <div class="login-fill-password">
                <h4 class="fw-bold">Tạo mật khẩu</h4>
                <p class="fs-14 text-dark">Dùng ít nhất 8 ký tự, trong đó có chữ hoa, chữ thường và số.</p>
                <form action="index.html" class="mb-3" id="login-hotel-form" autocomplete="off">
                    <div class="mb-3">
                        <label for="user-password-input" class="form-label fs-14 mb-1 fw-500">Mật khẩu</label>
                        <div class="input-group">
                            <input type="password" class="form-control shadow-none bd-r-2
                             border-end-0
                             br-r-0"
                            id="user-password-input" aria-describedby="passwordInput">
                            <span class="input-group-text bg-white border-start-0" id="show-hide-password" type="button">
                                <i class="fa-regular fa-eye-slash"></i>
                            </span>
                        </div>
                        <div class="invalid-feedback invalid-password-feedback"></div>
                    </div>

                    <div class="mb-3">
                        <label for="user-password-input-cf" class="form-label fs-14 mb-1 fw-500">Xác nhận mật khẩu</label>
                        <div class="input-group">
                            <input type="password" class="form-control shadow-none bd-r-2 border-end-0
                            br-r-0"
                            id="user-password-input-cf" aria-describedby="passwordInputConfirm">
                            <span class="input-group-text bg-white border-start-0" id="show-hide-cf-password" type="button">
                                <i class="fa-regular fa-eye-slash"></i>
                            </span>
                        </div>
                        <div class="invalid-feedback invalid-password-cf-feedback"></div>
                    </div>
                     <button class="btn btn-primary2 text-white bd-r-2 fw-500 w-100 py-2 mt-3" type="submit">Tạo tài khoản</button>
                </form>
                <div class="border border-start-0 border-end-0 py-3">
                    <p class="fs-12 mb-0 text-center">
                        Qua việc đăng nhập hoặc tạo tài khoản, bạn đồng ý với các 
                        <span class="text-blue">Điều khoản và Điều kiện</span> cũng như <span class="text-blue">Chính sách An toàn và Bảo mật</span> của chúng tôi
                    </p>
                </div>
            </div>      
        </div>
    </div>

    <div class="success-popup d-none" id="success-popup-msg">
      <div class="success-popup-wrapper h-100 d-flex align-items-center justify-content-center">
        <label for="" class="success-popup-overlay"></label>
        <div class="success-popup-content bd-r-4 bg-white text-center shadow-fade-cmt p-4">
          <div class="rounded-circle d-inline-block p-3 border border-success">
            <i class="fa-solid fa-check text-success fs-1"></i>
          </div>
          <div class="mt-3">
            <h3>Đăng ký thành công!</h3>
            <p class="my-3 text-dark">Đã gửi tin nhắn xác nhận đến email của bạn, vui lòng kiểm tra.</p>
          </div>
          <div>
            <a href="index.html" class="btn-primary2 text-white p-3 text-decoration-none fw-500 bd-r-4 d-inline-block">Về trang chủ</a>
          </div>
        </div>
      </div>
    </div>

    <script src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.6.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/toolTip.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/custom/bsValidation.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/custom/validatePw.js"></script>
</body>
</html>