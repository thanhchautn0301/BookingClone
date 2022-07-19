<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Details</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/splide.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/flatpickr.min.css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==
    " crossorigin="anonymous" referrerpolicy="no-referrer" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/style.css" />
</head>

<body>
  <!-- Header  -->
  <header class="bg-primary">
    <div class="container-fluid">
      <div class="row bg-primary">
        <div class="col-sm-12">
          <div class="container">
            <nav class="navbar navbar-expand-md bg-primary">
              <div class="container-fluid px-0">
                <div class="navbar-brand">
                  <a href="index.html" class="text-decoration-none">
                    <svg class="bg-primary" height="24" width="144" viewBox="0 0 180 30" role="presentation"
                      aria-hidden="true" focusable="false">
                      <path fill="#fff"
                        d="M70.6 2.73999C70.602 2.19808 70.7646 1.66892 71.0673 1.21943C71.3701 0.769947 71.7993 0.420321 72.3007 0.214768C72.8021 0.00921437 73.3532 -0.0430342 73.8843 0.064629C74.4155 0.172292 74.9027 0.435032 75.2845 0.819622C75.6663 1.20421 75.9255 1.69338 76.0293 2.22527C76.133 2.75716 76.0768 3.30788 75.8676 3.80779C75.6584 4.3077 75.3056 4.73434 74.8539 5.03377C74.4022 5.3332 73.8719 5.49197 73.33 5.48999C72.9702 5.48868 72.6141 5.41651 72.2822 5.2776C71.9503 5.13869 71.649 4.93576 71.3955 4.6804C71.1419 4.42504 70.9412 4.12225 70.8047 3.78931C70.6683 3.45637 70.5987 3.09982 70.6 2.73999V2.73999ZM116.5 23.77C117.044 23.772 117.577 23.6124 118.031 23.3114C118.484 23.0104 118.838 22.5816 119.048 22.0793C119.257 21.577 119.313 21.0238 119.208 20.4897C119.103 19.9555 118.842 19.4646 118.458 19.079C118.074 18.6934 117.584 18.4305 117.05 18.3236C116.516 18.2167 115.963 18.2705 115.46 18.4784C114.957 18.6862 114.527 19.0387 114.224 19.4911C113.922 19.9436 113.76 20.4757 113.76 21.02C113.76 21.7476 114.048 22.4456 114.562 22.961C115.075 23.4764 115.772 23.7673 116.5 23.77V23.77ZM25.7 6.72999C24.0129 6.74775 22.3688 7.26426 20.9746 8.21447C19.5805 9.16469 18.4986 10.5061 17.8653 12.0699C17.2319 13.6337 17.0754 15.3499 17.4154 17.0025C17.7554 18.6551 18.5767 20.1701 19.776 21.3569C20.9752 22.5436 22.4988 23.349 24.1548 23.6717C25.8108 23.9944 27.5253 23.8199 29.0824 23.1702C30.6395 22.5205 31.9695 21.4247 32.9051 20.0206C33.8406 18.6166 34.3399 16.9672 34.34 15.28C34.3768 14.1396 34.1778 13.0038 33.7555 11.9438C33.3331 10.8839 32.6965 9.92248 31.8855 9.11989C31.0744 8.3173 30.1064 7.69078 29.0421 7.27955C27.9778 6.86831 26.84 6.68122 25.7 6.72999V6.72999ZM25.7 19.83C23.35 19.83 21.7 17.96 21.7 15.28C21.7 12.6 23.34 10.73 25.7 10.73C28.06 10.73 29.7 12.6 29.7 15.28C29.7 17.96 28.11 19.83 25.7 19.83ZM65.3 15.71C65.1321 15.3716 64.9128 15.0613 64.65 14.79L64.5 14.63L64.66 14.48C64.9116 14.2078 65.1423 13.917 65.35 13.61L69.74 7.05999H64.41L61.1 12.19C60.9586 12.3442 60.782 12.4621 60.5852 12.5334C60.3885 12.6048 60.1774 12.6277 59.97 12.6H59.22V2.90999C59.22 0.979993 58.01 0.709993 56.71 0.709993H54.48V23.58H59.21V16.72H59.65C60.19 16.72 60.56 16.78 60.73 17.08L63.35 21.97C63.5773 22.5089 63.9785 22.9563 64.4895 23.2408C65.0006 23.5253 65.5922 23.6306 66.17 23.54H69.8L67.09 19.07L65.3 15.71ZM88.27 6.68999C87.3747 6.67014 86.4851 6.83782 85.6584 7.18226C84.8318 7.5267 84.0863 8.04028 83.47 8.68999L83.18 8.97999L83.08 8.57999C82.9261 8.08803 82.6021 7.66692 82.166 7.39207C81.7299 7.11723 81.2102 7.0066 80.7 7.07999H78.57V23.57H83.29V15.97C83.275 15.2919 83.373 14.6159 83.58 13.97C83.7979 13.1302 84.2923 12.3883 84.9836 11.8639C85.6748 11.3396 86.5225 11.0634 87.39 11.08C88.85 11.08 89.39 11.85 89.39 13.86V21.05C89.335 21.3921 89.3619 21.7424 89.4686 22.072C89.5753 22.4017 89.7586 22.7013 90.0036 22.9463C90.2487 23.1914 90.5483 23.3747 90.878 23.4814C91.2076 23.5881 91.5579 23.615 91.9 23.56H94.12V13.07C94.15 8.89999 92.12 6.68999 88.27 6.68999V6.68999ZM73.39 7.05999H71.17V23.58H75.87V9.57999C75.9234 9.24041 75.8964 8.89304 75.7913 8.56576C75.6862 8.23848 75.5058 7.94038 75.2647 7.69537C75.0236 7.45037 74.7284 7.26527 74.4028 7.15493C74.0773 7.04459 73.7304 7.01208 73.39 7.05999V7.05999ZM44.16 6.72999C42.4729 6.74775 40.8288 7.26426 39.4346 8.21447C38.0405 9.16469 36.9586 10.5061 36.3253 12.0699C35.6919 13.6337 35.5354 15.3499 35.8754 17.0025C36.2154 18.6551 37.0367 20.1701 38.236 21.3569C39.4352 22.5436 40.9588 23.349 42.6148 23.6717C44.2708 23.9944 45.9853 23.8199 47.5424 23.1702C49.0995 22.5205 50.4295 21.4247 51.3651 20.0206C52.3006 18.6166 52.7999 16.9672 52.8 15.28C52.8368 14.1396 52.6378 13.0038 52.2155 11.9438C51.7931 10.8839 51.1565 9.92248 50.3455 9.11989C49.5344 8.3173 48.5664 7.69078 47.5021 7.27955C46.4378 6.86831 45.3 6.68122 44.16 6.72999V6.72999ZM44.16 19.83C41.81 19.83 40.16 17.96 40.16 15.28C40.16 12.6 41.8 10.73 44.16 10.73C46.52 10.73 48.16 12.6 48.16 15.28C48.16 17.96 46.57 19.83 44.16 19.83ZM144.89 6.72999C143.203 6.74775 141.559 7.26426 140.165 8.21447C138.77 9.16469 137.689 10.5061 137.055 12.0699C136.422 13.6337 136.265 15.3499 136.605 17.0025C136.945 18.6551 137.767 20.1701 138.966 21.3569C140.165 22.5436 141.689 23.349 143.345 23.6717C145.001 23.9944 146.715 23.8199 148.272 23.1702C149.829 22.5205 151.16 21.4247 152.095 20.0206C153.031 18.6166 153.53 16.9672 153.53 15.28C153.567 14.1396 153.368 13.0038 152.945 11.9438C152.523 10.8839 151.887 9.92248 151.075 9.11989C150.264 8.3173 149.296 7.69078 148.232 7.27955C147.168 6.86831 146.03 6.68122 144.89 6.72999V6.72999ZM144.89 19.83C142.54 19.83 140.89 17.96 140.89 15.28C140.89 12.6 142.53 10.73 144.89 10.73C147.25 10.73 148.89 12.6 148.89 15.28C148.89 17.96 147.3 19.83 144.89 19.83ZM109.74 7.01999C109.356 6.98285 108.97 7.05749 108.627 7.23491C108.285 7.41233 108.001 7.68497 107.81 8.01999L107.69 8.26999L107.47 8.07999C106.253 7.08344 104.711 6.57072 103.14 6.63999C98.75 6.63999 95.78 9.94999 95.78 14.87C95.78 19.79 98.85 23.22 103.23 23.22C104.521 23.2791 105.795 22.9061 106.85 22.16L107.21 21.88V22.34C107.21 24.55 105.78 25.77 103.21 25.77C102.131 25.755 101.062 25.5555 100.05 25.18C99.8562 25.0813 99.6419 25.0295 99.4244 25.0287C99.2069 25.0279 98.9923 25.0782 98.7977 25.1754C98.6032 25.2727 98.4342 25.4143 98.3043 25.5887C98.1745 25.7632 98.0874 25.9657 98.05 26.18L97.14 28.46L97.47 28.63C99.2593 29.5195 101.232 29.9783 103.23 29.97C107.23 29.97 111.9 27.91 111.9 22.14V7.01999H109.74ZM104.06 19.11C101.5 19.11 100.58 16.86 100.58 14.76C100.58 13.83 100.81 10.76 103.81 10.76C105.3 10.76 107.3 11.18 107.3 14.86C107.3 18.38 105.54 19.11 104.06 19.11ZM13.09 11.85L12.4 11.47L13 10.97C13.6103 10.4334 14.0951 9.76919 14.42 9.02435C14.7449 8.27951 14.9019 7.47231 14.88 6.65999C14.88 3.05999 12.09 0.739993 7.79 0.739993H2.31C1.69606 0.762953 1.11431 1.02048 0.684566 1.45953C0.254821 1.89857 0.00981021 2.48571 0 3.09999L0 23.5H7.88C12.67 23.5 15.77 20.89 15.77 16.84C15.8104 15.8446 15.583 14.8566 15.1116 13.9789C14.6403 13.1012 13.9421 12.3661 13.09 11.85V11.85ZM4.37 6.07999C4.37 5.01999 4.82 4.51999 5.8 4.45999H7.8C8.16093 4.42761 8.52456 4.47504 8.8651 4.59892C9.20565 4.7228 9.51476 4.9201 9.77052 5.17681C10.0263 5.43353 10.2224 5.74338 10.345 6.08438C10.4676 6.42538 10.5137 6.78919 10.48 7.14999C10.5194 7.51629 10.4791 7.88679 10.3616 8.23598C10.2442 8.58517 10.0524 8.90477 9.79964 9.17277C9.54684 9.44077 9.23898 9.65082 8.89723 9.78844C8.55549 9.92606 8.18798 9.988 7.82 9.96999H4.37V6.07999ZM8.2 19.64H4.37V15.06C4.37 14.06 4.76 13.57 5.59 13.45H8.2C8.99043 13.4949 9.7337 13.8406 10.2774 14.4161C10.8211 14.9916 11.124 15.7533 11.124 16.545C11.124 17.3367 10.8211 18.0984 10.2774 18.6739C9.7337 19.2494 8.99043 19.595 8.2 19.64ZM174.53 6.73999C173.558 6.74366 172.6 6.96575 171.726 7.38984C170.852 7.81393 170.084 8.42915 169.48 9.18999L169.14 9.62999L168.87 9.13999C168.437 8.355 167.787 7.71128 166.998 7.2857C166.209 6.86012 165.314 6.67067 164.42 6.73999C163.604 6.75328 162.798 6.93308 162.054 7.26838C161.309 7.60368 160.641 8.08742 160.09 8.68999L159.65 9.16999L159.48 8.53999C159.323 8.07152 159.008 7.67282 158.587 7.41334C158.167 7.15386 157.669 7.05005 157.18 7.11999H155.18V23.57H159.64V16.31C159.646 15.6629 159.727 15.0187 159.88 14.39C160.31 12.63 161.49 10.74 163.47 10.93C164.69 11.05 165.29 11.99 165.29 13.82V23.57H169.81V16.31C169.791 15.6345 169.875 14.9601 170.06 14.31C170.42 12.64 171.65 10.92 173.56 10.92C174.94 10.92 175.45 11.7 175.45 13.81V21.17C175.45 22.83 176.19 23.57 177.85 23.57H180V13.07C180 8.86999 178.15 6.73999 174.53 6.73999ZM133.69 17.86C132.51 19.095 130.913 19.8471 129.21 19.97C128.593 20.0073 127.974 19.914 127.395 19.6962C126.816 19.4784 126.29 19.141 125.85 18.706C125.41 18.271 125.067 17.7482 124.843 17.1716C124.619 16.5951 124.519 15.9778 124.55 15.36C124.498 14.7504 124.575 14.1365 124.776 13.5588C124.978 12.981 125.299 12.4524 125.719 12.0076C126.14 11.5629 126.649 11.212 127.215 10.978C127.78 10.744 128.388 10.6322 129 10.65C129.84 10.65 130.8 10.95 130.95 11.46V11.55C131.048 11.8986 131.258 12.2056 131.547 12.424C131.835 12.6425 132.188 12.7605 132.55 12.76H135V10.61C135 7.76999 131.39 6.73999 129 6.73999C123.81 6.73999 120 10.37 120 15.35C120 20.33 123.73 23.97 128.86 23.97C130.178 23.9562 131.479 23.6722 132.683 23.1355C133.887 22.5989 134.969 21.821 135.86 20.85L134 17.58L133.69 17.86Z">
                      </path>
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
                    <li class="nav-item me-2" data-bs-toggle="tooltip" data-bs-placement="bottom"
                      title="Chọn loại tiền tệ của bạn">
                      <button class="btn btn-primary fw-500 btn-icon-nav">
                        VND
                      </button>
                    </li>
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

                    <li class="nav-item me-2">
                      <a href="login.html" class="btn btn-sm btn-primary fw-500 btn-sm text-white border">
                        Đăng chỗ nghỉ của quí vị
                      </a>
                    </li>
                    <li class="nav-item me-2">
                      <a href="login.html" class="btn btn-sm bg-white text-blue fw-500">Đăng ký</a>
                    </li>
                    <li class="nav-item">
                      <a href="login.html" class="btn btn-sm bg-white text-blue fw-500">Đăng nhập</a>
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
    </div>
    <div class="container">
      <div class="row">
        <div class="col-sm-12 py-sm-0 py-lg-2 pb-lg-3">
          <ul class="nav mt-md-1 mb-lg-0 mb-sm-2 mt-lg-0">
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999 active">
                <i class="fa-solid fa-bed"></i>
                Lưu trú
              </a>
            </li>
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999">
                <i class="fa-solid fa-plane"></i>
                Chuyến bay
              </a>
            </li>
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999">
                <i class="fa-solid fa-earth-oceania"></i>
                Chuyến bay + Khách sạn
              </a>
            </li>
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999">
                <i class="fa-solid fa-car"></i>
                Thuê xe
              </a>
            </li>
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999">
                <i class="fa-solid fa-map-location"></i>
                Địa điểm tham quan
              </a>
            </li>
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999">
                <i class="fa-solid fa-taxi"></i>
                Taxi sân bay
              </a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </header>
  <!--End Of Header-->
  <nav>
    <div class="container">
      <div class="row">
        <div class="col">
          <nav aria-label="breadcrumb">
            <ol class="breadcrumb my-2">
              <li class="breadcrumb-item fs-12">
                <a href="#" class="text-decoration-none text-blue">Trang chủ</a>
              </li>
              <li class="breadcrumb-item fs-12">
                <a href="#" class="text-decoration-none text-blue">Việt Nam</a>
              </li>
              <li class="breadcrumb-item fs-12 active" aria-current="page">
                Chi tiết khách sạn
              </li>
            </ol>
          </nav>
        </div>
      </div>
    </div>
  </nav>

  <!-- Content -->
  <div class="content">
    <div class="container">
      <div class="row">
        <div class="col-sm-4 col-md-3 mb-5">
          <aside>
            <div class="hover-cs text-center bg-blue2 bd-r-2 mb-2">
              <p class="fw-500 fs-14 text-dark mb-0">
                <i class="fa-solid fa-clipboard-check primary-text fs-6"></i>
                Chúng Tôi Luôn Khớp Giá!
              </p>
              <div class="hover-cs-info text-start">
                <span class="text-success fs-14 fw-bold">Chúng Tôi Luôn Khớp Giá!</span>
                <p class="d-flex mb-0">
                  <span class="p-3"><i class="fa-solid fa-clipboard-check text-success fs-2"></i></span>
                  <span class="fs-14">
                    Giá phòng thấp • Không tính phí đặt phòng • Tìm được giá
                  thấp hơn? Chúng tôi sẽ hoàn lại số tiền chênh lệch!
                  </span>    
                </p>
              </div>
            </div>
            <!-- Filter-Form -->
            <form action="" class="row py-3 px-2 bg-orange bd-r-2 needs-validation mx-0" novalidate>
              <h4 class="h4">Tìm</h4>
              <div class="col-sm-12">
                <label for="province-filter" class="form-label mb-0 fs-12">Tên chỗ nghỉ / điểm đến:</label>
                <div class="input-group bd-r-2">
                  <span class="input-group-text border-0 bg-white">
                    <i class="fa-solid fa-magnifying-glass"></i>
                  </span>
                  <input type="text" class="form-control ps-0 fs-14 py-2 shadow-none border-0 bd-r-2 bg-white"
                    value="Vũng Tàu" aria-label="province" id="province-filter" autocomplete="off" required />
                  <div class="invalid-feedback mb-1">
                    <span style="background-color: #fff0f0" class="d-block p-2 bd-r-2 d-flex align-items-center">
                      <i class="fa-solid fa-circle-info fs-20 me-2"></i>
                      <span class="text-dark">Vui lòng nhập điểm đến để bắt đầu tìm kiếm.</span>
                    </span>
                  </div>
                </div>
              </div>
              <div class="col-sm-12">
                <label for="" class="form-label mb-0 fs-12">Ngày nhận phòng</label>
                <div class="input-group bd-r-2">
                  <span class="input-group-text border-0 bg-white">
                    <i class="fa-solid fa-calendar-day"></i>
                  </span>
                  <input type="text" class="form-control p-c ps-0 fs-14 py-2 shadow-none border-0 bd-r-2 bg-white"
                    id="checkin-date-filter" value="Ngày nhận phòng" data-date-value="" />
                  <span class="input-group-text border-0 bg-white">
                    <i class="fa-solid fa-angle-down fs-12"></i>
                  </span>
                </div>
              </div>
              <div class="col-sm-12">
                <label for="" class="form-label mb-0 fs-12">Ngày trả phòng</label>
                <div class="input-group bd-r-2">
                  <span class="input-group-text border-0 bg-white">
                    <i class="fa-solid fa-calendar-day"></i>
                  </span>
                  <input type="text" class="form-control p-c ps-0 fs-14 py-2 shadow-none border-0 bd-r-2 bg-white"
                    id="checkout-date-filter" value="Ngày trả phòng" data-date-value="" />
                  <span class="input-group-text border-0 bg-white">
                    <i class="fa-solid fa-angle-down fs-12"></i>
                  </span>
                </div>
              </div>
              <div class="col-sm-12">
                <label for="" class="form-label mb-0 fs-12">Nghỉ 1 đêm</label>
                <div class="input-group bd-r-2 position-relative">
                  <input type="text"
                    class="form-control fs-14 py-2 shadow-none border-0 bd-r-2 bg-white input-drop-select p-c"
                    aria-label="filterRoom" id="input-filter-room" value="2 người lớn - 0 trẻ em - 1 phòng" readonly />
                  <span class="input-group-text border-0 bg-white">
                    <i class="fa-solid fa-angle-down fs-12"></i>
                  </span>
                  <div class="input-list-dropdown bg-white p-3" id="filter-room-form">
                    <div class="d-flex align-items-center justify-content-between my-1">
                      <span class="text-dark fw-500 fs-14">Người lớn</span>
                      <div class="filter-room__action2 d-flex align-items-center me-2 border">
                        <button class="btn btn-action border-0 br-0 shadow-none" data-type="minus" data-field="adults"
                          type="button">
                          <i class="fa-solid fa-minus"></i>
                        </button>
                        <span
                          class="text-dark fw-500 w-40 h-40 d-flex align-items-center justify-content-center amount-result"
                          data-field="adults">2</span>
                        <button class="btn btn-action border-0 br-0 shadow-none" data-type="plus" data-field="adults"
                          type="button">
                          <i class="fa-solid fa-plus"></i>
                        </button>
                      </div>
                    </div>
                    <div class="d-flex align-items-center justify-content-between my-1">
                      <span class="text-dark fw-500 fs-14">Trẻ em</span>
                      <div class="filter-room__action2 d-flex align-items-center me-2 border">
                        <button class="btn btn-action border-0 br-0 shadow-none disable" data-type="minus"
                          data-field="childs" type="button">
                          <i class="fa-solid fa-minus"></i>
                        </button>
                        <span
                          class="text-dark fw-500 w-40 h-40 d-flex align-items-center justify-content-center amount-result"
                          data-field="childs">0</span>
                        <button class="btn btn-action border-0 br-0 shadow-none" data-type="plus" data-field="childs"
                          type="button">
                          <i class="fa-solid fa-plus"></i>
                        </button>
                      </div>
                    </div>
                    <div class="d-flex align-items-center justify-content-between my-1">
                      <span class="text-dark fw-500 fs-14">Phòng</span>
                      <div class="filter-room__action2 d-flex align-items-center me-2 border">
                        <button class="btn btn-action border-0 br-0 shadow-none disable" data-type="minus"
                          data-field="rooms" type="button">
                          <i class="fa-solid fa-minus"></i>
                        </button>
                        <span
                          class="text-dark fw-500 w-40 h-40 d-flex align-items-center justify-content-center amount-result"
                          data-field="rooms">1</span>
                        <button class="btn btn-action border-0 br-0 shadow-none" data-type="plus" data-field="rooms"
                          type="button">
                          <i class="fa-solid fa-plus"></i>
                        </button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-sm-12 gy-3">
                <button class="btn-primary2 bd-r-2 border-0 text-white w-100 py-3 px-2" type="submit">
                  Tìm
                </button>
              </div>
            </form>
            <!-- End of Filter Form  -->
          </aside>
        </div>
        <div class="col-sm-8 col-md-9">
          <div class="row">
            <div class="col-sm-12">
              <div class="d-flex align-items-center has-bd-bt flex-wrap">
                <a href=""
                  class="p-2 text-decoration-none hv-black bg-blue2 bd-r-2 flex-fill text-center fw-bold text-blue">Thông
                  tin căn hộ & giá</a>
                <a href=""
                  class="p-2 text-decoration-none hv-black bg-blue2 me-sm-0 me-md-1 mx-1 bd-r-2 text-center fw-bold text-blue">Tiện
                  nghi</a>
                <a href=""
                  class="p-2 text-decoration-none hv-black bg-blue2 me-sm-1 me-md-0 me-lg-1 bd-r-2 text-center fw-bold text-blue">Quy
                  tắc chung</a>
                <a href=""
                  class="p-2 text-decoration-none hv-black mb-sm-1 mb-md-0 mt-sm-1 mt-lg-0 bg-blue2 bd-r-2 flex-fill text-center fw-bold text-blue">Đánh
                  giá của khách (817)</a>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-sm-12 mt-3">
              <div class="d-flex justify-content-between align-items-center">
                <div class="d-flex align-items-center">
                  <span class="bg-secondary bd-r-2 fs-12 text-white p-1 me-2">Khách sạn</span>
                  <span class="fw-bold h4 text-black mb-0">Khách sạn NG Gia Tuấn</span>
                </div>
                <div class="d-flex align-items-center">
                  <i class="fa-regular fa-heart fs-20 text-blue me-3"></i>
                  <a href="#table-hotel" class="btn btn-primary2 bd-r-2 text-white" type="button">
                    Đặt ngay
                  </a>
                </div>
              </div>
              <div class="mt-1">
                <i class="fa-solid fa-location-dot text-blue fs-20"></i>
                <span>36E Nhiêu Tâm, Phường 5, quận 5 , Thành Phố Hồ Chí
                  Minh</span>
              </div>
            </div>
          </div>
          <div class="row mt-2">
            <div class="col-sm-12">
              <div class="row position-relative text-decoration-none p-c" data-bs-toggle="modal"
                data-bs-target="#hotel-img-modal">
                <div class="col-sm-12 mb-2">
                  <div class="row">
                    <div class="col-sm-4 pe-1">
                      <div class="row h-100">
                        <div class="col-sm-12 mb-2">
                          <img src="${pageContext.request.contextPath}/resources/assets/img/testimg.jpg" class="shadow-fade h-17 w-100 bd-r-2" alt="" />
                        </div>
                        <div class="col-sm-12">
                          <img src="${pageContext.request.contextPath}/resources/assets/img/testimg.jpg" class="shadow-fade h-17 w-100 bd-r-2" alt="" />
                        </div>
                      </div>
                    </div>
                    <div class="col-sm-8 ps-1">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/testimg.jpg" class="shadow-fade h-35 w-100 bd-r-2" alt="" />
                    </div>
                  </div>
                </div>
                <div class="col-sm-12">
                  <div class="row">
                    <div class="col pe-1">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/testimg.jpg" class="h-11 w-100 bd-r-2" alt="" />
                    </div>
                    <div class="col gx-2">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/testimg.jpg" class="h-11 w-100 bd-r-2" alt="" />
                    </div>
                    <div class="col gx-2">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/testimg.jpg" class="h-11 w-100 bd-r-2" alt="" />
                    </div>
                    <div class="col gx-2">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/testimg.jpg" class="h-11 w-100 bd-r-2" alt="" />
                    </div>
                    <div class="col ps-1 hotel-collapse-img">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/testimg.jpg" class="h-11 w-100 bd-r-2" alt="" />
                      <span
                        class="number-collapse-img fw-bold text-white fs-20 d-flex justify-content-center align-items-center text-sm-center">+35
                        ảnh</span>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Features-info -->
      <div class="row my-4">
        <div class="col">
          <div class="text-center">
            <svg viewBox="0 0 128 128" width="2em" height="2em">
              <path
                d="M8 40v76a4 4 0 0 0 4 4h104a4 4 0 0 0 4-4V40zm96 56H24V72h80zm0-32H24v-8h80zm12-56H12a4 4 0 0 0-4 4v20h112V12a4 4 0 0 0-4-4zM92 26a6 6 0 1 1 6-6 6 6 0 0 1-6 6zm16 0a6 6 0 1 1 6-6 6 6 0 0 1-6 6z">
              </path>
            </svg>
            <p class="mb-0">Bếp</p>
          </div>
        </div>
        <div class="col">
          <div class="text-center">
            <svg viewBox="0 0 128 128" width="2em" height="2em">
              <path
                d="M24 88h8v16h-8zm0-16h8V56h-8zm32 32h8V88h-8zm0-32h8V56h-8zm0-32h8V24h-8zm64 16v60a4 4 0 0 1-4 4H12a4 4 0 0 1-4-4V44a4 4 0 0 1 4-4h28V12a4 4 0 0 1 4-4h32a4 4 0 0 1 4 4v58.3l5.2-5.1a4 4 0 0 1 5.6 0l5.2 5.1V56a4 4 0 0 1 .3-1.5l8-20a4 4 0 0 1 7.4 0l8 20a4 4 0 0 1 .3 1.5zM16 112h24V48H16zm32 0h24V16H48v96zm32 0h16V81.7l-8-8-8 8zm32-55.2l-4-10-4 10V112h8z">
              </path>
            </svg>
            <p class="mb-0">Nhìn ra thành phố</p>
          </div>
        </div>
        <div class="col">
          <div class="text-center">
            <svg viewBox="0 0 128 128" width="2em" height="2em">
              <path
                d="M96 8H32a8 8 0 0 0-8 8v96a8 8 0 0 0 8 8h64a8 8 0 0 0 8-8V16a8 8 0 0 0-8-8zm-44 8a4 4 0 1 1-4 4 4 4 0 0 1 4-4zm-20 4a4 4 0 1 1 4 4 4 4 0 0 1-4-4zm32 80a28 28 0 1 1 28-28 28 28 0 0 1-28 28z">
              </path>
              <path
                d="M73 69.9a1.1 1.1 0 0 0-2 0 8 8 0 0 1-14 0 1.1 1.1 0 0 0-2 0 8 8 0 0 1-13 1.4 1.1 1.1 0 0 0-2 .8 23.7 23.7 0 0 0 .5 4.6A24 24 0 0 0 88 72a1.1 1.1 0 0 0-2-.7 8 8 0 0 1-13-1.4z">
              </path>
            </svg>
            <p class="mb-0">Máy giặt</p>
          </div>
        </div>
        <div class="col">
          <div class="text-center">
            <svg viewBox="0 0 128 128" width="2em" height="2em">
              <circle cx="64" cy="100" r="12"></circle>
              <path
                d="M118.3 32.7A94.9 94.9 0 0 0 64 16 94.9 94.9 0 0 0 9.7 32.7a4 4 0 1 0 4.6 6.6A87 87 0 0 1 64 24a87 87 0 0 1 49.7 15.3 4 4 0 1 0 4.6-6.6zM87.7 68.4a54.9 54.9 0 0 0-47.4 0 4 4 0 0 0 3.4 7.2 47 47 0 0 1 40.6 0 4 4 0 0 0 3.4-7.2z">
              </path>
              <path d="M104 50.5a81.2 81.2 0 0 0-80 0 4 4 0 0 0 4 7 73.2 73.2 0 0 1 72 0 4 4 0 0 0 4-7z"></path>
            </svg>
            <p class="mb-0">Wi-Fi miễn phí</p>
          </div>
        </div>
        <div class="col">
          <div class="text-center">
            <svg viewBox="0 0 128 128" width="2em" height="2em">
              <path
                d="M84 116a4 4 0 0 1-4 4H48a4 4 0 0 1 0-8h12V52a4 4 0 0 1 8 0v60h12a4 4 0 0 1 4 4zm-36-16a4 4 0 0 0-4-4H22.9l-7.1-21.3a4 4 0 1 0-7.6 2.6l7.5 22.4-7.3 14.5a4 4 0 1 0 7.2 3.6l6.9-13.8H32v12a4 4 0 0 0 8 0v-12h4a4 4 0 0 0 4-4zm64.3-.3l7.5-22.4a4 4 0 0 0-7.6-2.6l-7 21.3H84a4 4 0 0 0 0 8h4v12a4 4 0 0 0 8 0v-12h9.5l7 13.8a4 4 0 0 0 7-3.6zM12.3 40h103.4c3.7 0 5.7-4.1 3.2-6.7C109.8 24 90.4 8 64 8S18.2 24 9.1 33.3C6.6 36 8.6 40 12.3 40z">
              </path>
            </svg>
            <p class="mb-0">Sân hiên</p>
          </div>
        </div>
        <div class="col">
          <div class="text-center">
            <svg viewBox="0 0 128 128" width="2em" height="2em">
              <path
                d="M84 116a4 4 0 0 1-4 4H48a4 4 0 0 1 0-8h12V52a4 4 0 0 1 8 0v60h12a4 4 0 0 1 4 4zm-36-16a4 4 0 0 0-4-4H22.9l-7.1-21.3a4 4 0 1 0-7.6 2.6l7.5 22.4-7.3 14.5a4 4 0 1 0 7.2 3.6l6.9-13.8H32v12a4 4 0 0 0 8 0v-12h4a4 4 0 0 0 4-4zm64.3-.3l7.5-22.4a4 4 0 0 0-7.6-2.6l-7 21.3H84a4 4 0 0 0 0 8h4v12a4 4 0 0 0 8 0v-12h9.5l7 13.8a4 4 0 0 0 7-3.6zM12.3 40h103.4c3.7 0 5.7-4.1 3.2-6.7C109.8 24 90.4 8 64 8S18.2 24 9.1 33.3C6.6 36 8.6 40 12.3 40z">
              </path>
            </svg>
            <p class="mb-0">Ban công</p>
          </div>
        </div>
        <div class="col">
          <div class="text-center">
            <svg viewBox="0 0 128 128" width="2em" height="2em">
              <path
                d="M89.6 44.6L94 28.3a4 4 0 0 1 4.9-2.9 4 4 0 0 1 2.8 5l-2.3 8.5 7.7-4.4a4 4 0 0 1 5.5 1.4 4 4 0 0 1-1.5 5.5l-7.7 4.4 8.6 2.4a4 4 0 0 1 2.8 4.9 4 4 0 0 1-4.9 2.8l-16.3-4.4-15.5 9a4 4 0 0 1-5.5-1.5 4 4 0 0 1 1.5-5.5zM53.9 74.5a4 4 0 0 0 1.4-5.5 4 4 0 0 0-5.4-1.5l-15.6 9L18 72.2a4 4 0 0 0-5 2.8 4 4 0 0 0 2.9 5l8.4 2.2-7.5 4.3a4 4 0 0 0-1.4 5.5 4 4 0 0 0 5.4 1.5l7.8-4.5-2.4 8.8a4 4 0 0 0 2.9 4.9 4 4 0 0 0 4.9-2.9l4.4-16.4zM60 32.2V50a4 4 0 0 0 4 4 4 4 0 0 0 4-4V32l11.9-11.9a4 4 0 0 0 0-5.6 4 4 0 0 0-5.7 0L68 20.7V12a4 4 0 0 0-4-4 4 4 0 0 0-4 4v8.9l-6.4-6.4a4 4 0 0 0-5.6 0 4 4 0 0 0 0 5.7zM114.8 75a4 4 0 0 0-4.9-2.8l-16.3 4.3-15.5-9a4 4 0 0 0-5.5 1.5 4 4 0 0 0 1.5 5.5l15.5 8.9 4.3 16.4a4 4 0 0 0 4.9 2.8 4 4 0 0 0 2.8-4.9L99.3 89l7.7 4.5a4 4 0 0 0 5.5-1.5 4 4 0 0 0-1.5-5.4l-7.6-4.4 8.6-2.3a4 4 0 0 0 2.8-4.9zM68 95.8V78a4 4 0 0 0-4-4 4 4 0 0 0-4 4v18l-11.9 11.9a4 4 0 0 0 0 5.6 4 4 0 0 0 5.7 0l6.2-6.2v8.7a4 4 0 0 0 4 4 4 4 0 0 0 4-4v-8.9l6.4 6.4a4 4 0 0 0 5.6 0 4 4 0 0 0 0-5.7zM13.2 53a4 4 0 0 0 4.8 2.8l16.3-4.3 15.5 9a4 4 0 0 0 5.5-1.5 4 4 0 0 0-1.4-5.5l-15.5-8.9-4.3-16.4a4 4 0 0 0-5-2.8 4 4 0 0 0-2.8 4.9l2.3 8.7-7.7-4.5a4 4 0 0 0-5.4 1.5 4 4 0 0 0 1.4 5.5l7.6 4.3-8.5 2.3a4 4 0 0 0-2.9 4.9z">
              </path>
            </svg>
            <p class="mb-0">Điều hòa không khí</p>
          </div>
        </div>
      </div>
      <!-- Hotel-description -->
      <div class="row mt-3">
        <div class="col-sm-6 col-lg-9">
          <div class="pe-5">
            <p class="fs-14">
              Chỗ nghỉ này cách bãi biển 7 phút đi bộ. Nằm ở thành phố Vũng
              Tàu, cách Bãi Sau 550 m và Bãi Dứa 1,2 km, Vung Tau Melody
              Apartment cung cấp chỗ nghỉ với WiFi miễn phí và khu vực ghế
              ngồi.
            </p>
            <p class="fs-14">
              Tất cả chỗ nghỉ tại đây được trang bị máy điều hòa, TV màn hình
              phẳng, phòng khách với ghế sofa, bếp đầy đủ tiện nghi đi kèm khu
              vực ăn uống và phòng tắm riêng với vòi xịt/chậu rửa vệ sinh, áo
              choàng tắm cùng dép đi trong phòng. Các căn còn được trang bị lò
              vi sóng, tủ lạnh, bếp nấu ăn và ấm đun nước.
            </p>
            <p class="fs-14">Căn hộ có sân hiên.</p>
            <p class="fs-14">
              Vung Tau Melody Apartment nằm trong bán kính 1,4 km từ Bãi Trước
              và 1,7 km từ Tượng Chúa Kitô Vua. Sân bay gần nhất là sân bay
              quốc tế Tân Sơn Nhất, cách chỗ nghỉ 108 km.
            </p>
            <p class="fs-14">
              Các cặp đôi đặc biệt thích địa điểm này — họ cho điểm
              <span class="fw-bold"> 9,0 </span>cho kỳ nghỉ dành cho 2 người.
            </p>
          </div>
        </div>
        <div class="col-sm-6 col-lg-3">
          <div>
            <div class="bg-blue2 bd-r-2 mb-3">
              <div class="p-3">
                <h6 class="fw-bold">Điểm nổi bật của chỗ nghỉ</h6>
                <p class="d-flex align-items-center mt-2">
                  <span class="icon-size px-2 me-2">
                    <i class="fa-solid fa-location-dot fs-20"></i>
                  </span>
                  <span class="fs-14">Địa điểm hàng đầu: Được khách gần đây đánh giá cao (8,8
                    điểm)</span>
                </p>
                <p class="d-flex align-items-center mt-2">
                  <span class="icon-size px-2 me-2">
                    <i class="fa-solid fa-square-parking fs-20"></i>
                  </span>
                  <span class="fs-14">Có chỗ đậu xe trong khuôn viên</span>
                </p>
              </div>
            </div>
            <div class="bg-blue2 bd-r-2">
              <div class="p-3">
                <p class="text-success fw-500 fs-14 mb-2">
                  <i class="fa-solid fa-check fs-5"></i> Thông tin uy tín
                </p>
                <p class="fs-12">
                  Khách nói rằng mô tả và hình ảnh chỗ nghỉ này
                  <span class="fw-bold">đúng với sự thật.</span>
                </p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-12 col-lg-9">
          <div class="features">
            <h6 class="h6 fw-bold mb-3">Các tiện nghi được ưa chuộng nhất</h6>
            <div>
              <span class="me-2">
                <i class="fa-solid fa-water text-success fs-5"></i>
                <span class="fs-14"> Giáp biển </span>
              </span>
              <span class="me-2">
                <i class="fa-solid fa-wifi text-success fs-5"></i>
                <span class="fs-14"> Wifi </span>
              </span>
              <span class="me-2">
                <i class="fa-solid fa-square-parking text-success fs-5"></i>
                <span class="fs-14"> Chỗ đỗ xe </span>
              </span>
              <span class="me-2">
                <i class="fa-solid fa-people-group text-success fs-5"></i>
                <span class="fs-14"> Phòng gia đình </span>
              </span>
              <span class="me-2">
                <i class="fa-solid fa-ban-smoking text-success fs-5"></i>
                <span class="fs-14"> Phòng không hút thuốc </span>
              </span>
            </div>
          </div>
        </div>
        <div class="col-12">
          <hr class="mt-3 text-secondary" />
        </div>
      </div>
      <!-- Find Empty Room -->
      <div class="row">
        <div class="col-12">
          <div class="d-flex align-items-center justify-content-between">
            <h4>Phòng trống</h4>
            <div class="hover-cs text-center mb-2 px-0 py-2">
              <p class="fw-500 fs-14 text-dark mb-0">
                <i class="fa-solid fa-clipboard-check primary-text fs-6"></i>
                Chúng Tôi Luôn Khớp Giá!
              </p>
              <div class="hover-cs-info bg-black-fade text-start">
                <span class="text-success fs-14 fw-bold">Chúng Tôi Luôn Khớp Giá!</span>
                <p class="d-flex mb-0">
                  <span class="p-3"><i class="fa-solid fa-clipboard-check text-success fs-2"></i></span>
                  <span class="fs-14">
                    Giá phòng thấp • Không tính phí đặt phòng • Tìm được giá
                    thấp hơn? Chúng tôi sẽ hoàn lại số tiền chênh lệch!
                  </span>  
                </p>
              </div>
            </div>
          </div>
        </div>
        <div class="col-12">
          <div class="room-check p-2 mb-3">
            <div class="fs-18 m-2 mb-0">
              Bạn muốn nghỉ tại Gia Tuan's Hotel vào lúc nào?
            </div>
            <form action="" class="needs-validation p-2">
              <div class="fw-bold fs-14 mb-2">Ngày nhận - trả phòng</div>
              <div class="d-flex flex-wrap">
                <div class="input-group bd-r-2 w-25 flex-sm-fill me-sm-0 me-2">
                  <span class="input-group-text border-0 bg-white">
                    <i class="fa-solid fa-calendar-day"></i>
                  </span>
                  <input type="text" id="check-room-date"
                    class="form-control p-c ps-0 fs-14 py-2 shadow-none border-0 bd-r-2 bg-white" data-date-value=""
                    required />
                  <span class="input-group-text border-0 bg-white">
                    <i class="fa-solid fa-angle-down fs-12"></i>
                  </span>
                </div>
                <div
                  class="d-flex justify-content-sm-between align-items-center my-sm-2 my-md-0 flex-fill justify-content-md-evenly">
                  <div>
                    <span>Phòng</span>
                    <select class="form-select p-c shadow-none select-box d-inline-block" aria-label="roomSelect">
                      <option value="1" selected>1</option>
                      <option value="">2</option>
                      <option value="">3</option>
                      <option value="">4</option>
                      <option value="">5</option>
                      <option value="">6</option>
                      <option value="">7</option>
                      <option value="">8</option>
                      <option value="">9</option>
                      <option value="">10</option>
                      <option value="">11</option>
                      <option value="">12</option>
                      <option value="">13</option>
                      <option value="">14</option>
                      <option value="">15</option>
                      <option value="">16</option>
                      <option value="">17</option>
                      <option value="">18</option>
                      <option value="">19</option>
                      <option value="">20</option>
                      <option value="">21</option>
                      <option value="">22</option>
                      <option value="">23</option>
                      <option value="">24</option>
                      <option value="">25</option>
                      <option value="">26</option>
                      <option value="">27</option>
                      <option value="">28</option>
                      <option value="">29</option>
                      <option value="">30</option>
                    </select>
                  </div>
                  <div>
                    <span>Người lớn</span>
                    <select class="form-select p-c shadow-none select-box d-inline-block" aria-label="roomSelect">
                      <option value="1" selected>1</option>
                      <option value="">2</option>
                      <option value="">3</option>
                      <option value="">4</option>
                      <option value="">5</option>
                      <option value="">6</option>
                      <option value="">7</option>
                      <option value="">8</option>
                      <option value="">9</option>
                      <option value="">10</option>
                      <option value="">11</option>
                      <option value="">12</option>
                      <option value="">13</option>
                      <option value="">14</option>
                      <option value="">15</option>
                      <option value="">16</option>
                      <option value="">17</option>
                      <option value="">18</option>
                      <option value="">19</option>
                      <option value="">20</option>
                      <option value="">21</option>
                      <option value="">22</option>
                      <option value="">23</option>
                      <option value="">24</option>
                      <option value="">25</option>
                      <option value="">26</option>
                      <option value="">27</option>
                      <option value="">28</option>
                      <option value="">29</option>
                      <option value="">30</option>
                    </select>
                  </div>
                  <div>
                    <span>Trẻ em</span>
                    <select class="form-select p-c shadow-none select-box d-inline-block" aria-label="roomSelect">
                      <option value="0" selected>0</option>
                      <option value="1">1</option>
                      <option value="2">2</option>
                      <option value="3">3</option>
                      <option value="4">4</option>
                      <option value="4">5</option>
                      <option value="4">6</option>
                      <option value="4">7</option>
                      <option value="4">8</option>
                      <option value="4">9</option>
                      <option value="4">10</option>
                    </select>
                  </div>
                </div>
                <button class="btn btn-primary2 flex-sm-grow-1 mt-sm-2 mt-lg-0 text-white bd-r-2" type="submit">
                  Kiểm tra phòng trống
                </button>
              </div>
            </form>
          </div>
        </div>
      </div>
      <!-- Room Info -->
      <div class="row">
        <div class="col">
          <table class="table table-responsive-sm" id="table-hotel">
            <thead>
              <tr>
                <th scope="col" class="text-white bg-room-hd">
                  Loại chỗ nghỉ
                
                </th>
                <th scope="col" class="text-white bg-room-hd b-l-hotel">
                  Phù hợp cho
                </th>
                <th scope="col" class="text-white bg-primary text-center">Giá hôm nay</th>  
                <th scope="col" class="text-white bg-room-hd">
                  Các lựa chọn
                 
                </th>
                <th scope="col" class="text-white bg-room-hd b-l-hotel text-center">Chọn phòng</th>
              </tr>
            </thead>
            <tbody class="border-top-0">
              <tr>
                <td class="w-25">
                  <div class="">
                    <a href="" class="text-blue h5 fw-bold">Phòng tiêu chuẩn cỡ Queen</a>
                    <p class="mt-3">
                      <span class="fs-14">1 giường đôi lớn </span>
                      <i class="fa-solid fa-bed fs-4"></i>
                    </p>
                    <p class="mb-0">
                      <svg class="bk-icon -streamline-room_size" height="1em" 
                      width="1em" viewBox="0 0 24 24" role="presentation"
                      aria-hidden="true" focusable="false">
                      <path d="M3.75 23.25V7.5a.75.75 0 0 0-1.5 0v15.75a.75.75 0 0 0
                        1.5 0zM.22 21.53l2.25 2.25a.75.75 0 0 0 1.06 0l2.25-2.25a.75.75
                        0 1 0-1.06-1.06l-2.25 2.25h1.06l-2.25-2.25a.75.75 0 0 0-1.06
                          1.06zM5.78 9.22L3.53 6.97a.75.75 0 0 0-1.06 0L.22 9.22a.75.75
                          0 1 0 1.06 1.06l2.25-2.25H2.47l2.25 2.25a.75.75 0 1 0
                            1.06-1.06zM7.5 3.75h15.75a.75.75 0 0 0 0-1.5H7.5a.75.75 0 
                            0 0 0 1.5zM9.22.22L6.97 2.47a.75.75 0 0 0 0 1.06l2.25
                            2.25a.75.75 0 1 0 1.06-1.06L8.03 2.47v1.06l2.25-2.25A.75.75
                              0 1 0 9.22.22zm12.31 5.56l2.25-2.25a.75.75 0 0 0 0-1.06L21.53.22a.75.75 
                              0 1 0-1.06 1.06l2.25 2.25V2.47l-2.25 2.25a.75.75 0 0 0 1.06 1.06zM10.5 
                              13.05v7.2a2.25 2.25 0 0 0 2.25 2.25h6A2.25 2.25
                              0 0 0 21 20.25v-7.2a.75.75 0 0 0-1.5 0v7.2a.75.75 0 0 1-.75.75h-6a.75.75
                                0 0 1-.75-.75v-7.2a.75.75 0 0 0-1.5 0zm13.252 2.143l-6.497-5.85a2.25 2.25 
                                0 0 0-3.01 0l-6.497 5.85a.75.75 0 0 0 1.004 1.114l6.497-5.85a.75.75 0 0 1 
                                1.002 0l6.497 5.85a.75.75 0 0 0 1.004-1.114z"></path></svg>
                      <span class="fs-12">25 m²</span> 
                    </p>
                    <p class="mb-0">
                      <svg viewBox="0 0 128 128" width="1em" height="1em">
                        <path
                          d="M89.6 44.6L94 28.3a4 4 0 0 1 4.9-2.9 4 4 0 0 1 2.8 5l-2.3 8.5 7.7-4.4a4 4 0 0 1 5.5 1.4 4 4 0 0 1-1.5 5.5l-7.7 4.4 8.6 2.4a4 4 0 0 1 2.8 4.9 4 4 0 0 1-4.9 2.8l-16.3-4.4-15.5 9a4 4 0 0 1-5.5-1.5 4 4 0 0 1 1.5-5.5zM53.9 74.5a4 4 0 0 0 1.4-5.5 4 4 0 0 0-5.4-1.5l-15.6 9L18 72.2a4 4 0 0 0-5 2.8 4 4 0 0 0 2.9 5l8.4 2.2-7.5 4.3a4 4 0 0 0-1.4 5.5 4 4 0 0 0 5.4 1.5l7.8-4.5-2.4 8.8a4 4 0 0 0 2.9 4.9 4 4 0 0 0 4.9-2.9l4.4-16.4zM60 32.2V50a4 4 0 0 0 4 4 4 4 0 0 0 4-4V32l11.9-11.9a4 4 0 0 0 0-5.6 4 4 0 0 0-5.7 0L68 20.7V12a4 4 0 0 0-4-4 4 4 0 0 0-4 4v8.9l-6.4-6.4a4 4 0 0 0-5.6 0 4 4 0 0 0 0 5.7zM114.8 75a4 4 0 0 0-4.9-2.8l-16.3 4.3-15.5-9a4 4 0 0 0-5.5 1.5 4 4 0 0 0 1.5 5.5l15.5 8.9 4.3 16.4a4 4 0 0 0 4.9 2.8 4 4 0 0 0 2.8-4.9L99.3 89l7.7 4.5a4 4 0 0 0 5.5-1.5 4 4 0 0 0-1.5-5.4l-7.6-4.4 8.6-2.3a4 4 0 0 0 2.8-4.9zM68 95.8V78a4 4 0 0 0-4-4 4 4 0 0 0-4 4v18l-11.9 11.9a4 4 0 0 0 0 5.6 4 4 0 0 0 5.7 0l6.2-6.2v8.7a4 4 0 0 0 4 4 4 4 0 0 0 4-4v-8.9l6.4 6.4a4 4 0 0 0 5.6 0 4 4 0 0 0 0-5.7zM13.2 53a4 4 0 0 0 4.8 2.8l16.3-4.3 15.5 9a4 4 0 0 0 5.5-1.5 4 4 0 0 0-1.4-5.5l-15.5-8.9-4.3-16.4a4 4 0 0 0-5-2.8 4 4 0 0 0-2.8 4.9l2.3 8.7-7.7-4.5a4 4 0 0 0-5.4 1.5 4 4 0 0 0 1.4 5.5l7.6 4.3-8.5 2.3a4 4 0 0 0-2.9 4.9z">
                        </path>
                      </svg>
                      <span class="fs-12">Điều hòa không khí</span> 
                    </p>
                    <p class="mb-0">
                      <i class="fa-solid fa-tv fs-12"></i>
                      <span class="fs-12">Tivi màn hình phẳng</span> 
                    </p>
                    <hr class="text-grey my-2">
                  </div>
                  <div class="d-flex flex-wrap">
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Máy giặt
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Khăn tắm
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Lò sưởi
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Nhà vệ sinh
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Sàn lát gỗ
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Máy sấy tóc 
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Giường xếp 
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Ấm đun nước điện
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Nhà vệ sinh
                    </span>
                  </div>
                </td>
                <td class="b-l-hotel">
                  <i class="fa-solid fa-user-group"></i>  
                </td>
                <td class="b-l-hotel">
                  <p class="text-decoration-line-through text-danger fs-12 mb-1">VND 567.000</p> 
                  <p class="fw-bold mb-1">VND 328.860</p> 
                  <p class="fs-12 text-secondary">Đã bao gồm thuế và phí</p>
                </td>
                <td class="b-l-hotel">
                  <ul class="ps-3">
                    <li class="fs-14 fw-bold">Không hoàn tiền</li>
                  </ul>
                </td>
                <td class="b-l-hotel bg-book-room">
                  <div class="h-100 d-flex justify-content-center text-center align-items-center">
                    <a href="" class="text-blue">Đặt chỗ ngay</a>
                  </div>
                </td>
              </tr>
              <tr>
                <td class="w-25">
                  <div class="">
                    <a href="" class="text-blue h5 fw-bold">Phòng tiêu chuẩn cỡ Queen</a>
                    <p class="mt-3">
                      <span class="fs-14">1 giường đôi lớn </span>
                      <i class="fa-solid fa-bed fs-4"></i>
                    </p>
                    <p class="mb-0">
                      <svg class="bk-icon -streamline-room_size" height="1em" 
                      width="1em" viewBox="0 0 24 24" role="presentation"
                      aria-hidden="true" focusable="false">
                      <path d="M3.75 23.25V7.5a.75.75 0 0 0-1.5 0v15.75a.75.75 0 0 0
                        1.5 0zM.22 21.53l2.25 2.25a.75.75 0 0 0 1.06 0l2.25-2.25a.75.75
                        0 1 0-1.06-1.06l-2.25 2.25h1.06l-2.25-2.25a.75.75 0 0 0-1.06
                          1.06zM5.78 9.22L3.53 6.97a.75.75 0 0 0-1.06 0L.22 9.22a.75.75
                          0 1 0 1.06 1.06l2.25-2.25H2.47l2.25 2.25a.75.75 0 1 0
                            1.06-1.06zM7.5 3.75h15.75a.75.75 0 0 0 0-1.5H7.5a.75.75 0 
                            0 0 0 1.5zM9.22.22L6.97 2.47a.75.75 0 0 0 0 1.06l2.25
                            2.25a.75.75 0 1 0 1.06-1.06L8.03 2.47v1.06l2.25-2.25A.75.75
                              0 1 0 9.22.22zm12.31 5.56l2.25-2.25a.75.75 0 0 0 0-1.06L21.53.22a.75.75 
                              0 1 0-1.06 1.06l2.25 2.25V2.47l-2.25 2.25a.75.75 0 0 0 1.06 1.06zM10.5 
                              13.05v7.2a2.25 2.25 0 0 0 2.25 2.25h6A2.25 2.25
                              0 0 0 21 20.25v-7.2a.75.75 0 0 0-1.5 0v7.2a.75.75 0 0 1-.75.75h-6a.75.75
                                0 0 1-.75-.75v-7.2a.75.75 0 0 0-1.5 0zm13.252 2.143l-6.497-5.85a2.25 2.25 
                                0 0 0-3.01 0l-6.497 5.85a.75.75 0 0 0 1.004 1.114l6.497-5.85a.75.75 0 0 1 
                                1.002 0l6.497 5.85a.75.75 0 0 0 1.004-1.114z"></path></svg>
                      <span class="fs-12">25 m²</span> 
                    </p>
                    <p class="mb-0">
                      <svg viewBox="0 0 128 128" width="1em" height="1em">
                        <path
                          d="M89.6 44.6L94 28.3a4 4 0 0 1 4.9-2.9 4 4 0 0 1 2.8 5l-2.3 8.5 7.7-4.4a4 4 0 0 1 5.5 1.4 4 4 0 0 1-1.5 5.5l-7.7 4.4 8.6 2.4a4 4 0 0 1 2.8 4.9 4 4 0 0 1-4.9 2.8l-16.3-4.4-15.5 9a4 4 0 0 1-5.5-1.5 4 4 0 0 1 1.5-5.5zM53.9 74.5a4 4 0 0 0 1.4-5.5 4 4 0 0 0-5.4-1.5l-15.6 9L18 72.2a4 4 0 0 0-5 2.8 4 4 0 0 0 2.9 5l8.4 2.2-7.5 4.3a4 4 0 0 0-1.4 5.5 4 4 0 0 0 5.4 1.5l7.8-4.5-2.4 8.8a4 4 0 0 0 2.9 4.9 4 4 0 0 0 4.9-2.9l4.4-16.4zM60 32.2V50a4 4 0 0 0 4 4 4 4 0 0 0 4-4V32l11.9-11.9a4 4 0 0 0 0-5.6 4 4 0 0 0-5.7 0L68 20.7V12a4 4 0 0 0-4-4 4 4 0 0 0-4 4v8.9l-6.4-6.4a4 4 0 0 0-5.6 0 4 4 0 0 0 0 5.7zM114.8 75a4 4 0 0 0-4.9-2.8l-16.3 4.3-15.5-9a4 4 0 0 0-5.5 1.5 4 4 0 0 0 1.5 5.5l15.5 8.9 4.3 16.4a4 4 0 0 0 4.9 2.8 4 4 0 0 0 2.8-4.9L99.3 89l7.7 4.5a4 4 0 0 0 5.5-1.5 4 4 0 0 0-1.5-5.4l-7.6-4.4 8.6-2.3a4 4 0 0 0 2.8-4.9zM68 95.8V78a4 4 0 0 0-4-4 4 4 0 0 0-4 4v18l-11.9 11.9a4 4 0 0 0 0 5.6 4 4 0 0 0 5.7 0l6.2-6.2v8.7a4 4 0 0 0 4 4 4 4 0 0 0 4-4v-8.9l6.4 6.4a4 4 0 0 0 5.6 0 4 4 0 0 0 0-5.7zM13.2 53a4 4 0 0 0 4.8 2.8l16.3-4.3 15.5 9a4 4 0 0 0 5.5-1.5 4 4 0 0 0-1.4-5.5l-15.5-8.9-4.3-16.4a4 4 0 0 0-5-2.8 4 4 0 0 0-2.8 4.9l2.3 8.7-7.7-4.5a4 4 0 0 0-5.4 1.5 4 4 0 0 0 1.4 5.5l7.6 4.3-8.5 2.3a4 4 0 0 0-2.9 4.9z">
                        </path>
                      </svg>
                      <span class="fs-12">Điều hòa không khí</span> 
                    </p>
                    <p class="mb-0">
                      <i class="fa-solid fa-tv fs-12"></i>
                      <span class="fs-12">Tivi màn hình phẳng</span> 
                    </p>
                    <hr class="text-grey my-2">
                  </div>
                  <div class="d-flex flex-wrap">
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Máy giặt
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Khăn tắm
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Lò sưởi
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Nhà vệ sinh
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Sàn lát gỗ
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Máy sấy tóc 
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Giường xếp 
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Ấm đun nước điện
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Nhà vệ sinh
                    </span>
                  </div>
                </td>
                <td class="b-l-hotel">
                  <i class="fa-solid fa-user-group"></i>  
                </td>
                <td class="b-l-hotel">
                  <p class="text-decoration-line-through text-danger fs-12 mb-1">VND 567.000</p> 
                  <p class="fw-bold mb-1">VND 328.860</p> 
                  <p class="fs-12 text-secondary">Đã bao gồm thuế và phí</p>
                </td>
                <td class="b-l-hotel">
                  <ul class="ps-3">
                    <li class="fs-14 fw-bold">Không hoàn tiền</li>
                  </ul>
                </td>
                <td class="b-l-hotel bg-book-room">
                  <div class="h-100 d-flex justify-content-center text-center align-items-center">
                    <a href="" class="text-blue">Đặt chỗ ngay</a>
                  </div>
                </td>
              </tr>
              <tr>
                <td class="w-25">
                  <div class="">
                    <a href="" class="text-blue h5 fw-bold">Phòng tiêu chuẩn cỡ Queen</a>
                    <p class="mt-3">
                      <span class="fs-14">1 giường đôi lớn </span>
                      <i class="fa-solid fa-bed fs-4"></i>
                    </p>
                    <p class="mb-0">
                      <svg class="bk-icon -streamline-room_size" height="1em" 
                      width="1em" viewBox="0 0 24 24" role="presentation"
                      aria-hidden="true" focusable="false">
                      <path d="M3.75 23.25V7.5a.75.75 0 0 0-1.5 0v15.75a.75.75 0 0 0
                        1.5 0zM.22 21.53l2.25 2.25a.75.75 0 0 0 1.06 0l2.25-2.25a.75.75
                        0 1 0-1.06-1.06l-2.25 2.25h1.06l-2.25-2.25a.75.75 0 0 0-1.06
                          1.06zM5.78 9.22L3.53 6.97a.75.75 0 0 0-1.06 0L.22 9.22a.75.75
                          0 1 0 1.06 1.06l2.25-2.25H2.47l2.25 2.25a.75.75 0 1 0
                            1.06-1.06zM7.5 3.75h15.75a.75.75 0 0 0 0-1.5H7.5a.75.75 0 
                            0 0 0 1.5zM9.22.22L6.97 2.47a.75.75 0 0 0 0 1.06l2.25
                            2.25a.75.75 0 1 0 1.06-1.06L8.03 2.47v1.06l2.25-2.25A.75.75
                              0 1 0 9.22.22zm12.31 5.56l2.25-2.25a.75.75 0 0 0 0-1.06L21.53.22a.75.75 
                              0 1 0-1.06 1.06l2.25 2.25V2.47l-2.25 2.25a.75.75 0 0 0 1.06 1.06zM10.5 
                              13.05v7.2a2.25 2.25 0 0 0 2.25 2.25h6A2.25 2.25
                              0 0 0 21 20.25v-7.2a.75.75 0 0 0-1.5 0v7.2a.75.75 0 0 1-.75.75h-6a.75.75
                                0 0 1-.75-.75v-7.2a.75.75 0 0 0-1.5 0zm13.252 2.143l-6.497-5.85a2.25 2.25 
                                0 0 0-3.01 0l-6.497 5.85a.75.75 0 0 0 1.004 1.114l6.497-5.85a.75.75 0 0 1 
                                1.002 0l6.497 5.85a.75.75 0 0 0 1.004-1.114z"></path></svg>
                      <span class="fs-12">25 m²</span> 
                    </p>
                    <p class="mb-0">
                      <svg viewBox="0 0 128 128" width="1em" height="1em">
                        <path
                          d="M89.6 44.6L94 28.3a4 4 0 0 1 4.9-2.9 4 4 0 0 1 2.8 5l-2.3 8.5 7.7-4.4a4 4 0 0 1 5.5 1.4 4 4 0 0 1-1.5 5.5l-7.7 4.4 8.6 2.4a4 4 0 0 1 2.8 4.9 4 4 0 0 1-4.9 2.8l-16.3-4.4-15.5 9a4 4 0 0 1-5.5-1.5 4 4 0 0 1 1.5-5.5zM53.9 74.5a4 4 0 0 0 1.4-5.5 4 4 0 0 0-5.4-1.5l-15.6 9L18 72.2a4 4 0 0 0-5 2.8 4 4 0 0 0 2.9 5l8.4 2.2-7.5 4.3a4 4 0 0 0-1.4 5.5 4 4 0 0 0 5.4 1.5l7.8-4.5-2.4 8.8a4 4 0 0 0 2.9 4.9 4 4 0 0 0 4.9-2.9l4.4-16.4zM60 32.2V50a4 4 0 0 0 4 4 4 4 0 0 0 4-4V32l11.9-11.9a4 4 0 0 0 0-5.6 4 4 0 0 0-5.7 0L68 20.7V12a4 4 0 0 0-4-4 4 4 0 0 0-4 4v8.9l-6.4-6.4a4 4 0 0 0-5.6 0 4 4 0 0 0 0 5.7zM114.8 75a4 4 0 0 0-4.9-2.8l-16.3 4.3-15.5-9a4 4 0 0 0-5.5 1.5 4 4 0 0 0 1.5 5.5l15.5 8.9 4.3 16.4a4 4 0 0 0 4.9 2.8 4 4 0 0 0 2.8-4.9L99.3 89l7.7 4.5a4 4 0 0 0 5.5-1.5 4 4 0 0 0-1.5-5.4l-7.6-4.4 8.6-2.3a4 4 0 0 0 2.8-4.9zM68 95.8V78a4 4 0 0 0-4-4 4 4 0 0 0-4 4v18l-11.9 11.9a4 4 0 0 0 0 5.6 4 4 0 0 0 5.7 0l6.2-6.2v8.7a4 4 0 0 0 4 4 4 4 0 0 0 4-4v-8.9l6.4 6.4a4 4 0 0 0 5.6 0 4 4 0 0 0 0-5.7zM13.2 53a4 4 0 0 0 4.8 2.8l16.3-4.3 15.5 9a4 4 0 0 0 5.5-1.5 4 4 0 0 0-1.4-5.5l-15.5-8.9-4.3-16.4a4 4 0 0 0-5-2.8 4 4 0 0 0-2.8 4.9l2.3 8.7-7.7-4.5a4 4 0 0 0-5.4 1.5 4 4 0 0 0 1.4 5.5l7.6 4.3-8.5 2.3a4 4 0 0 0-2.9 4.9z">
                        </path>
                      </svg>
                      <span class="fs-12">Điều hòa không khí</span> 
                    </p>
                    <p class="mb-0">
                      <i class="fa-solid fa-tv fs-12"></i>
                      <span class="fs-12">Tivi màn hình phẳng</span> 
                    </p>
                    <hr class="text-grey my-2">
                  </div>
                  <div class="d-flex flex-wrap">
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Máy giặt
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Khăn tắm
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Lò sưởi
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Nhà vệ sinh
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Sàn lát gỗ
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Máy sấy tóc 
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Giường xếp 
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Ấm đun nước điện
                    </span>
                    <span class="fs-12 mb-0 me-3">
                      <i class="fa-solid fa-check text-success"></i>
                      Nhà vệ sinh
                    </span>
                  </div>
                </td>
                <td class="b-l-hotel">
                  <i class="fa-solid fa-user-group"></i>  
                </td>
                <td class="b-l-hotel">
                  <p class="text-decoration-line-through text-danger fs-12 mb-1">VND 567.000</p> 
                  <p class="fw-bold mb-1">VND 328.860</p> 
                  <p class="fs-12 text-secondary">Đã bao gồm thuế và phí</p>
                </td>
                <td class="b-l-hotel">
                  <ul class="ps-3">
                    <li class="fs-14 fw-bold">Không hoàn tiền</li>
                  </ul>
                </td>
                <td class="b-l-hotel bg-book-room">
                  <div class="h-100 d-flex justify-content-center text-center align-items-center">
                    <a href="" class="text-blue">Đặt chỗ ngay</a>
                  </div>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
      </div>
      <!-- Suggest -->
      <div class="row mb-3">
        <div class="col-12 my-2">
          <h4 class="fw-bold">4 lý do để chọn HANZ Thinh Anh Hotel Vung Tau</h4>
        </div>
        <div class="col-4 gy-3">
          <span class="d-inline-flex align-items-center">
            <span class="bg-fade-blue p-2 bd-r-8 d-inline-flex
             align-items-center justify-content-center me-2">
              <i class="fa-solid fa-wallet fs-2"></i>
            </span>  
            <span class="fw-500 text-dark">Giá không thể tốt hơn!</span>
          </span>
        </div>
        <div class="col-4 gy-3">
          <span class="d-inline-flex align-items-center">
            <span class="bg-fade-blue p-2 bd-r-8 d-inline-flex
             align-items-center justify-content-center me-2">
             <i class="fa-solid fa-lock fs-2"></i>
            </span>  
            <span class="fw-500 text-dark">Đặt phòng an toàn</span>
          </span>
        </div>
        <div class="col-4 gy-3">
          <span class="d-inline-flex align-items-center">
            <span class="bg-fade-blue p-2 bd-r-8 d-inline-flex
             align-items-center justify-content-center me-2">
             <i class="fa-solid fa-file-circle-check fs-2"></i>
            </span>  
            <span class="fw-500 text-dark">Quản lý đặt phòng trực tuyến</span>
          </span>
        </div>
        <div class="col-4 gy-3">
          <span class="d-inline-flex align-items-center">
            <span class="bg-fade-blue p-2 bd-r-8 d-inline-flex
             align-items-center justify-content-center me-2">
             <i class="fa-brands fa-rocketchat fs-2"></i>
            </span>  
            <span class="fw-500 text-dark">Nhân viên nói tiếng Việt</span>
          </span>
        </div>
      </div>
    </div>
  </div> <!-- End of Content-->

  <!-- User Comment Section -->
  <section class="">
    <div class="container">
      <div class="row">
        <div class="col-12 my-2 mt-4">
          <h4 class="">Đánh giá của khách</h4>
        </div>
        <div class="col-12">
          <div class="d-flex align-items-center p-2">
            <span class="bg-primary p-2 bd-r-4 text-white fw-bold br-l-b-0">7.7</span>
            <div class="p-2">
              <span class="fw-500 mb-0">Tốt</span>
              <span class="text-secondary mb-0 fw-500">• 31 đánh giá</span>
            </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-12 mt-2">
          <p class="fw-bold mb-2">Đọc xem khách yêu thích điều gì nhất:</p>
        </div>
      </div>
      <div class="row mb-4 user-comment-scroll shadow-fade-cmt mx-1">
        <div class="col-4 gy-3">
          <div class="d-flex align-items-center flex-wrap border p-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/usertest.jpg" class="user-icon-size-l rounded-circle me-2" alt="" />
            <div>
              <div class="fw-bold fs-14">Anh bạn thân</div>
              <div class="d-flex align-items-center">
                <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country-l me-2" />
                <span class="fs-12">Việt Nam</span>
              </div>
            </div>
            <p class="text-dark fs-14 py-2 mb-0">“Chỗ ở sạch sẽ, thoải mái, cô chủ và nhân viên dễ thương, nhiệt tình,
               vị trí gần Trung Tâm, đi đâu cũng dễ, phòng y như hình minh hoạ.”</p>
          </div>   
        </div>
        <div class="col-4 gy-3">
          <div class="d-flex align-items-center flex-wrap border p-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/usertest.jpg" class="user-icon-size-l rounded-circle me-2" alt="" />
            <div>
              <div class="fw-bold fs-14">Anh bạn thân</div>
              <div class="d-flex align-items-center">
                <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country-l me-2" />
                <span class="fs-12">Việt Nam</span>
              </div>
            </div>
            <p class="text-dark fs-14 py-2 mb-0">“Chỗ ở sạch sẽ, thoải mái, cô chủ và nhân viên dễ thương, nhiệt tình,
               vị trí gần Trung Tâm, đi đâu cũng dễ, phòng y như hình minh hoạ.”</p>
          </div>   
        </div>
        <div class="col-4 gy-3">
          <div class="d-flex align-items-center flex-wrap border p-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/usertest.jpg" class="user-icon-size-l rounded-circle me-2" alt="" />
            <div>
              <div class="fw-bold fs-14">Anh bạn thân</div>
              <div class="d-flex align-items-center">
                <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country-l me-2" />
                <span class="fs-12">Việt Nam</span>
              </div>
            </div>
            <p class="text-dark fs-14 py-2 mb-0">“Chỗ ở sạch sẽ, thoải mái, cô chủ và nhân viên dễ thương, nhiệt tình,
               vị trí gần Trung Tâm, đi đâu cũng dễ, phòng y như hình minh hoạ.”</p>
          </div>   
        </div>
        <div class="col-4 gy-3">
          <div class="d-flex align-items-center flex-wrap border p-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/usertest.jpg" class="user-icon-size-l rounded-circle me-2" alt="" />
            <div>
              <div class="fw-bold fs-14">Anh bạn thân</div>
              <div class="d-flex align-items-center">
                <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country-l me-2" />
                <span class="fs-12">Việt Nam</span>
              </div>
            </div>
            <p class="text-dark fs-14 py-2 mb-0">“Chỗ ở sạch sẽ, thoải mái, cô chủ và nhân viên dễ thương, nhiệt tình,
               vị trí gần Trung Tâm, đi đâu cũng dễ, phòng y như hình minh hoạ.”</p>
          </div>   
        </div>
        <div class="col-4 gy-3">
          <div class="d-flex align-items-center flex-wrap border p-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/usertest.jpg" class="user-icon-size-l rounded-circle me-2" alt="" />
            <div>
              <div class="fw-bold fs-14">Anh bạn thân</div>
              <div class="d-flex align-items-center">
                <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country-l me-2" />
                <span class="fs-12">Việt Nam</span>
              </div>
            </div>
            <p class="text-dark fs-14 py-2 mb-0">“Chỗ ở sạch sẽ, thoải mái, cô chủ và nhân viên dễ thương, nhiệt tình,
               vị trí gần Trung Tâm, đi đâu cũng dễ, phòng y như hình minh hoạ.”</p>
          </div>   
        </div>
        <div class="col-4 gy-3">
          <div class="d-flex align-items-center flex-wrap border p-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/usertest.jpg" class="user-icon-size-l rounded-circle me-2" alt="" />
            <div>
              <div class="fw-bold fs-14">Anh bạn thân</div>
              <div class="d-flex align-items-center">
                <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country-l me-2" />
                <span class="fs-12">Việt Nam</span>
              </div>
            </div>
            <p class="text-dark fs-14 py-2 mb-0">“Chỗ ở sạch sẽ, thoải mái, cô chủ và nhân viên dễ thương, nhiệt tình,
               vị trí gần Trung Tâm, đi đâu cũng dễ, phòng y như hình minh hoạ.”</p>
          </div>   
        </div>
        <div class="col-4 gy-3">
          <div class="d-flex align-items-center flex-wrap border p-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/usertest.jpg" class="user-icon-size-l rounded-circle me-2" alt="" />
            <div>
              <div class="fw-bold fs-14">Anh bạn thân</div>
              <div class="d-flex align-items-center">
                <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country-l me-2" />
                <span class="fs-12">Việt Nam</span>
              </div>
            </div>
            <p class="text-dark fs-14 py-2 mb-0">“Chỗ ở sạch sẽ, thoải mái, cô chủ và nhân viên dễ thương, nhiệt tình,
               vị trí gần Trung Tâm, đi đâu cũng dễ, phòng y như hình minh hoạ.”</p>
          </div>   
        </div>
        <div class="col-4 gy-3">
          <div class="d-flex align-items-center flex-wrap border p-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/usertest.jpg" class="user-icon-size-l rounded-circle me-2" alt="" />
            <div>
              <div class="fw-bold fs-14">Anh bạn thân</div>
              <div class="d-flex align-items-center">
                <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country-l me-2" />
                <span class="fs-12">Việt Nam</span>
              </div>
            </div>
            <p class="text-dark fs-14 py-2 mb-0">“Chỗ ở sạch sẽ, thoải mái, cô chủ và nhân viên dễ thương, nhiệt tình,
               vị trí gần Trung Tâm, đi đâu cũng dễ, phòng y như hình minh hoạ.”</p>
          </div>   
        </div>
      </div>
    </div>
  </section>


  <!-- Section -->
  <section>
    <div class="container-fluid">
      <div class="row bg-footer">
        <div class="col-sm-12">
          <div class="pt-5 pb-2">
            <h4 class="h4 text-white fw-light text-center mb-0">
              Tiết kiệm thời gian và tiền bạc!
            </h4>
            <p class="text-center" style="color: #bdbdbd">
              Hãy đăng ký và chúng tôi sẽ gửi những ưu đãi tốt nhất cho bạn
            </p>
          </div>
          <div class="">
            <form action="" class="needs-validation d-flex justify-content-center px-4">
              <input type="email" class="p-2 me-1 text-black-50 fs-20 flex-sm-grow-1 flex-xl-grow-0 w-25"
                placeholder="Địa chỉ email của bạn" required />
              <button class="btn btn-primary2 fs-1-2 text-white px-5" type="submit">
                Đăng ký
              </button>
            </form>
          </div>
          <div class="text-center pt-2 pb-5">
            <input type="checkbox" name="" id="checkbox-sendlink-down" />
            <label for="checkbox-sendlink-down" class="text-white fs-14">
              Gửi cho tôi đường dẫn để tải ứng dụng Booking.com MIỄN
              PHÍ!</label>
          </div>
        </div>
      </div>
      <div class="row bg-primary">
        <div class="col-sm-12">
          <div class="py-3 text-center">
            <a href="" class="btn btn-sm btn-primary fw-400 btn-sm text-white border fs-14 px-3">Đăng chỗ nghỉ của quí
              vị</a>
          </div>
        </div>
      </div>
      <div class="row bg-primary border-top">
        <div class="col sm-12">
          <div class="text-center p-2">
            <a href="" class="fw-bold text-white m-2 fs-14">Phiên bản di động</a>
            <a href="" class="fw-bold text-white m-2 fs-14">Tài khoản của bạn</a>
            <a href="" class="fw-bold text-white m-2 fs-14">Thay đổi đặt phòng của bạn trực tuyến</a>
            <a href="" class="fw-bold text-white m-2 fs-14">Dịch vụ khách hàng</a>
            <a href="" class="fw-bold text-white m-2 fs-14">Trở thành đối tác phân khối</a>
            <a href="" class="fw-bold text-white m-2 fs-14">TLTC.com dành cho doanh nghiệp</a>
          </div>
        </div>
      </div>
    </div>
  </section>

  <!-- Footer -->
  <footer class="foooter">
    <div class="container">
      <div class="row py-2">
        <div class="col">
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Các quốc gia</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Khu vực</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Thành phố</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Quận</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Các quốc gia</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Sân bay</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Khách sạn</a>
        </div>
        <div class="col">
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Nhà</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Căn hộ</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Resort</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Biệt thự</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Nhà trọ</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Nhà nghỉ B&B</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Nhà khách</a>
        </div>
        <div class="col">
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">
            Những chỗ nghỉ độc đáo</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Tất cả các điểm đến</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Khám phá</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Đánh giá của khách</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Các bài viết</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Ưu đãi theo mùa và dịp lễ</a>
        </div>
        <div class="col">
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">
            Cho thuê xe hơi</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Tìm chuyến bay</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Đặt nhà hàng</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Booking.com dành cho Đại Lý Du Lịch</a>
        </div>
        <div class="col">
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Các câu hỏi thường gặp về virus corona
            (COVID-19)</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Về Booking.com</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Dịch vụ khách hàng</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Trợ giúp đối tác</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Careers</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Du lịch bền vững</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Truyền thông</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Trung tâm thông tin bảo mật</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Quan hệ cổ đông</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Điều khoản và điều kiện</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Tranh chấp đối tác</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Chúng tôi hoạt động như thế nào</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Thông báo về Bảo mật & Cookie</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Liên hệ công ty</a>
        </div>
      </div>
      <div class="row">
        <div class="col-sm-12">
          <div class="text-center py-5">
            <a href="" class="fw-bold text-black-50 text-brown text-decoration-none">Đăng nhập vào trang Extranet</a>
          </div>
          <div>
            <p class="fs-12">
              Bản quyền © 1996–2022 Booking.com™. Bảo lưu mọi quyền.
            </p>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-sm-12">
          <div class="text-center mt-2">
            <p class="fs-12">
              Booking.com là một phần của Booking Holdings Inc., tập đoàn đứng
              đầu thế giới về du lịch trực tuyến và các dịch vụ liên quan.
            </p>
          </div>
          <div class="text-center">
            <img src="${pageContext.request.contextPath}/resources/assets/img/bookinglogo.png" alt="" class="m-3" />
            <img src="${pageContext.request.contextPath}/resources/assets/img/pricelinelogo.png" alt="" class="m-3" />
            <img src="${pageContext.request.contextPath}/resources/assets/img/kaykaklogo.png" alt="" class="m-3" />
            <img src="${pageContext.request.contextPath}/resources/assets/img/agodalogo.png" alt="" class="m-3" />
            <img src="${pageContext.request.contextPath}/resources/assets/img/rentalcarslogo.png" alt="" class="m-3" />
            <img src="${pageContext.request.contextPath}/resources/assets/img/opentablelogo.png" alt="" class="m-3" />
          </div>
        </div>
      </div>
    </div>
  </footer>

  <!--Hotel Image Modal -->
  <div class="modal fade overflow-hidden" id="hotel-img-modal" tabindex="-1" aria-labelledby="hotelImgLabel" aria-hidden="true">
    <div class="modal-dialog py-sm-3 px-sm-3 m-0 px-lg-4 py-lg-4 img-modal">
      <div class="modal-content overflow-hidden bd-r-2">
        <div class="modal-header">
            <button data-bs-toggle="collapse" data-bs-target="#zoom-in-img"
            aria-expanded="false" role="button" aria-controls="zoom-in-img"
             class="btn px-0 py-0 shadow-none btn-close-zoom invisible">
              <span class="">
                <i class="fa-solid fa-arrow-left me-2"></i>
              </span>
              <span class="fw-500">Thư viện ảnh</span> 
            </button>
          <h5 class="modal-title text-center flex-fill pe-5 me-3" id="hotelImgLabel">
            Khách sạn Thành Trâu  Thành Trâu
          </h5>
          <button type="button" class="btn-close ms-0" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body p-0">
          <div class="container-fluid">
            <div class="row row-m-h">
              <div class="col-sm-12 col-sm-h-50 col-lg-h-50 h-100 col-lg-9">
                <!-- Show Image -->
                <div class="row h-100 modal-img-scroll pb-1">
                  <div class="col-sm-6 flex-grow-0 col-lg-3 gx-2 gy-1">
                    <div class="overflow-hidden img-thumbnail h-100" data-bs-toggle="collapse" data-bs-target="#zoom-in-img"
                      aria-expanded="false" role="button" aria-controls="zoom-in-img">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/-RosiesAreRosieDay-rose-blackpink-42630481-750-844.jpg" class="img-hover h-17 w-100 bd-r-4" alt="" />
                  </div>
                  </div>
                  <div class="col-sm-6 flex-grow-0 col-lg-3 gx-2 gy-1">
                    <div class="overflow-hidden img-thumbnail h-100" data-bs-toggle="collapse" data-bs-target="#zoom-in-img"
                      aria-expanded="false" role="button" aria-controls="zoom-in-img">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/823347377556e4b2eb3a852b5c02369a.png" class="img-hover h-17 w-100 bd-r-4" alt="" />
                    </div>
                  </div>
                  <div class="col-sm-6 flex-grow-0 col-lg-3 gx-2 gy-1">
                    <div class="overflow-hidden img-thumbnail h-100" data-bs-toggle="collapse" data-bs-target="#zoom-in-img"
                      aria-expanded="false" role="button" aria-controls="zoom-in-img">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/8df8483d-334b-4794-9522-8345673a4fb6.jpg" class="img-hover h-17 w-100 bd-r-4" alt="" />
                    </div>
                  </div>
                  <div class="col-sm-6 flex-grow-0 col-lg-3 gx-2 gy-1">
                    <div class="overflow-hidden img-thumbnail h-100" data-bs-toggle="collapse" data-bs-target="#zoom-in-img"
                      aria-expanded="false" role="button" aria-controls="zoom-in-img">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/a39c9930-ccc7-11ec-9c78-050901070303-compressed.jpg" class="img-hover h-17 w-100 bd-r-4" alt="" />
                    </div>
                  </div>
                  <div class="col-sm-6 flex-grow-0 col-lg-3 gx-2 gy-1">
                    <div class="overflow-hidden img-thumbnail h-100" data-bs-toggle="collapse" data-bs-target="#zoom-in-img"
                      aria-expanded="false" role="button" aria-controls="zoom-in-img">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/blackpinks_rose_style_0.jpg" class="img-hover h-17 w-100 bd-r-4" alt="" />
                    </div>
                  </div>
                  <div class="col-sm-6 flex-grow-0 col-lg-3 gx-2 gy-1">
                    <div class="overflow-hidden img-thumbnail h-100" data-bs-toggle="collapse" data-bs-target="#zoom-in-img"
                      aria-expanded="false" role="button" aria-controls="zoom-in-img">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/cb09b6c6b679db47c81299ee06ffa16d.png" class="img-hover h-17 w-100 bd-r-4" alt="" />
                    </div>
                  </div>
                  <div class="col-sm-6 flex-grow-0 col-lg-3 gx-2 gy-1">
                    <div class="overflow-hidden img-thumbnail h-100" data-bs-toggle="collapse" data-bs-target="#zoom-in-img"
                      aria-expanded="false" role="button" aria-controls="zoom-in-img">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/photo-1643307548224-16433075491651886651524.jpg" class="img-hover h-17 w-100 bd-r-4" alt="" />
                    </div>
                  </div>
                  <div class="col-sm-6 flex-grow-0 col-lg-3 gx-2 gy-1">
                    <div class="overflow-hidden img-thumbnail h-100" data-bs-toggle="collapse" data-bs-target="#zoom-in-img"
                      aria-expanded="false" role="button" aria-controls="zoom-in-img">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/rose-blackpink-pha-moi-ky-luc-voi-san-pham-am-nhac-solo-dau-tay.jpeg" class="img-hover h-17 w-100 bd-r-4" alt="" />
                    </div>
                  </div>
                  <div class="col-sm-6 flex-grow-0 col-lg-3 gx-2 gy-1">
                    <div class="overflow-hidden img-thumbnail h-100" data-bs-toggle="collapse" data-bs-target="#zoom-in-img"
                      aria-expanded="false" role="button" aria-controls="zoom-in-img">
                      <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/rosie2.jpg" class="img-hover h-17 w-100 bd-r-4" alt="" />
                    </div>
                  </div>
                  
                </div>
                <!-- Zoom Image -->
                <div class="row h-100 py-2 zoom-img d-none" id="zoom-in-img">
                  <div class="col-12 h-100 px-0 d-flex flex-column justify-content-center align-items-center">
                    <section class="splide h-75 w-75 flex-fill" id="slider-show">
                      <div class="splide__track h-100">
                        <ul class="splide__list">
                          <li class="splide__slide w-100 h-100">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/-RosiesAreRosieDay-rose-blackpink-42630481-750-844.jpg" class="bd-r-4 w-100 h-100 mb-3" alt="" />
                          </li>
                          <li class="splide__slide w-100 h-100">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/823347377556e4b2eb3a852b5c02369a.png" class="bd-r-4 w-100 h-100 mb-3" alt="" />
                          </li>
                          <li class="splide__slide w-100 h-100">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/8df8483d-334b-4794-9522-8345673a4fb6.jpg" class="bd-r-4 w-100 h-100 mb-3" alt="" />
                          </li>
                          <li class="splide__slide w-100 h-100">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/a39c9930-ccc7-11ec-9c78-050901070303-compressed.jpg" class="bd-r-4 w-100 h-100 mb-3" alt="" />
                          </li>
                          <li class="splide__slide w-100 h-100">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/blackpinks_rose_style_0.jpg" class="bd-r-4 w-100 h-100 mb-3" alt="" />
                          </li>
                          <li class="splide__slide w-100 h-100">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/cb09b6c6b679db47c81299ee06ffa16d.png" class="bd-r-4 w-100 h-100 mb-3"
                              alt="" />
                          </li>
                          <li class="splide__slide w-100 h-100">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/photo-1643307548224-16433075491651886651524.jpg" class="bd-r-4 w-100 h-100 mb-3" alt="" />
                          </li>
                          <li class="splide__slide w-100 h-100">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/rose-blackpink-pha-moi-ky-luc-voi-san-pham-am-nhac-solo-dau-tay.jpeg" class="bd-r-4 w-100 h-100 mb-3" alt="" />
                          </li>
                          <li class="splide__slide w-100 h-100" data-src="rosie2.jpg">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/rosie2.jpg" class="bd-r-4 w-100 h-100 mb-3" alt="" />
                          </li>
                        </ul>
                      </div> 
                    </section>
                    <section class="splide splide2 w-75 h-25 p-sm-2 p-lg-4" id="slider-thumbnail">
                      <div class="splide__track h-100 mx-4">
                        <ul class="splide__list">
                          <li class="splide__slide h-100 op-0-5">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/-RosiesAreRosieDay-rose-blackpink-42630481-750-844.jpg" class="w-100 h-100 bd-r-2" alt="" />
                          </li>
                          <li class="splide__slide h-100 op-0-5">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/823347377556e4b2eb3a852b5c02369a.png" class="w-100 h-100 bd-r-2" alt="" />
                          </li>
                          <li class="splide__slide h-100 op-0-5">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/8df8483d-334b-4794-9522-8345673a4fb6.jpg" class="w-100 h-100 bd-r-2" alt="" />
                          </li>
                          <li class="splide__slide h-100 op-0-5">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/a39c9930-ccc7-11ec-9c78-050901070303-compressed.jpg" class="w-100 h-100 bd-r-2" alt="" />
                          </li>
                          <li class="splide__slide h-100 op-0-5">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/blackpinks_rose_style_0.jpg" class="w-100 h-100 bd-r-2" alt="" />
                          </li>
                          <li class="splide__slide h-100 op-0-5">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/cb09b6c6b679db47c81299ee06ffa16d.png" class="w-100 h-100 bd-r-2"
                              alt="" />
                          </li>
                          <li class="splide__slide h-100 op-0-5">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/photo-1643307548224-16433075491651886651524.jpg" class="w-100 h-100 bd-r-2" alt="" />
                          </li>
                          <li class="splide__slide h-100 op-0-5">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/rose-blackpink-pha-moi-ky-luc-voi-san-pham-am-nhac-solo-dau-tay.jpeg" class="w-100 h-100 bd-r-2" alt="" />
                          </li>
                          <li class="splide__slide h-100 op-0-5">
                            <img src="${pageContext.request.contextPath}/resources/assets/img/rosie/rosie2.jpg" class="w-100 h-100 bd-r-2" alt="" />
                          </li>
                        </ul>
                      </div>
                    </section>
                  </div>
                </div>
              </div>
              <div class="col-sm-12 col-sm-h-50 col-lg-h-50 h-100 col-lg-3">
                <!--Rate Point-->
                <div class="row h-100 flex-column flex-nowrap">
                  <div class="col-sm-12 gx-0">
                    <div class="d-flex align-items-center p-2 border border-top-0">
                      <span class="bg-primary p-2 bd-r-4 text-white fw-bold br-l-b-0">7.7</span>
                      <div class="p-2">
                        <p class="fw-bold mb-0">Tốt</p>
                        <p class="text-secondary mb-0 fs-12">31 đánh giá</p>
                      </div>
                    </div>
                  </div>
                  <div class="col-sm-12 overflow-y-auto flex-fill border-start">
                    <div class="">
                      <div class="fs-14 text-dark fw-500 py-2">
                        Điều khách yêu thích nhất
                      </div>
                      <div class="user-comment">
                        <div class="mb-2">
                          <p class="fs-14 mb-0">
                            “Chỗ ở sạch sẽ, thoải mái, cô chủ và nhân viên dễ
                            thương, nhiệt tình, vị trí gần Trung Tâm, đi đâu
                            cũng dễ, phòng y như hình minh hoạ.”
                          </p>
                        </div>
                        <div>
                          <img src="${pageContext.request.contextPath}/resources/assets/img/usertest.jpg" class="user-icon-size rounded-circle" alt="" />
                          <span class="fw-500 fs-12">Anh bạn thân</span>
                          <span>
                            <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country" />
                            <span class="fs-12">Việt Nam</span>
                          </span>
                          <hr class="bg-dark h-0-5" />
                        </div>
                      </div>
                      <div class="user-comment">
                        <div class="mb-2">
                          <p class="fs-14 mb-0">
                            “Có ghế TANTRA, phòng cách âm chưa ổn,chủ khách
                            sạn nhìn dê quá.”
                          </p>
                        </div>
                        <div>
                          <img src="${pageContext.request.contextPath}/resources/assets/img/rosie.jpg" class="user-icon-size rounded-circle" alt="" />
                          <span class="fw-500 fs-12">Cô người yêu cũ</span>
                          <span>
                            <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country" />
                            <span class="fs-12">Việt Nam</span>
                          </span>
                          <hr class="bg-dark h-0-5" />
                        </div>
                      </div>
                      <div class="user-comment">
                        <div class="mb-2">
                          <p class="fs-14 mb-0">
                            “Phòng đẹp nhưng lỡ gặp người yêu cũ nên cho 1
                            sao”
                          </p>
                        </div>
                        <div>
                          <img src="${pageContext.request.contextPath}/resources/assets/img/irene.png" class="user-icon-size rounded-circle" alt="" />
                          <span class="fw-500 fs-12">Cờ Rớt cũ</span>
                          <span>
                            <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country" />
                            <span class="fs-12">Việt Nam</span>
                          </span>
                          <hr class="bg-dark h-0-5" />
                        </div>
                      </div>
                      <div class="user-comment">
                        <div class="mb-2">
                          <p class="fs-14 mb-0">
                            “Có tất cả nhưng không có Trịnh Công Sơn”
                          </p>
                        </div>
                        <div>
                          <img src="${pageContext.request.contextPath}/resources/assets/img/daoanh.jpg" class="user-icon-size rounded-circle" alt="" />
                          <span class="fw-500 fs-12">Trinh's Lover</span>
                          <span>
                            <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country" />
                            <span class="fs-12">Việt Nam</span>
                          </span>
                          <hr class="bg-dark h-0-5" />
                        </div>
                      </div>
                      <div class="user-comment">
                        <div class="mb-2">
                          <p class="fs-14 mb-0">
                            “Khi nào có World Tour nhất định mình sẽ ghé khách sạn này”
                          </p>
                        </div>
                        <div>
                          <img src="${pageContext.request.contextPath}/resources/assets/img/lisa-2-6925.jpg" class="user-icon-size rounded-circle" alt="" />
                          <span class="fw-500 fs-12">LLisa BlackPink</span>
                          <span>
                            <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country" />
                            <span class="fs-12">Việt Nam</span>
                          </span>
                          <hr class="bg-dark h-0-5" />
                        </div>
                      </div>
                      <div class="user-comment">
                        <div class="mb-2">
                          <p class="fs-14 mb-0">
                            “Có tất cả nhưng không có Trịnh Công Sơn”
                          </p>
                        </div>
                        <div>
                          <img src="${pageContext.request.contextPath}/resources/assets/img/daoanh.jpg" class="user-icon-size rounded-circle" alt="" />
                          <span class="fw-500 fs-12">Trinh's Lover</span>
                          <span>
                            <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" alt="" class="user-icon-country" />
                            <span class="fs-12">Việt Nam</span>
                          </span>
                          <hr class="bg-dark h-0-5 opacity-0" />
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <!--User Feedback  -->

              </div>
            </div>
          </div>
        </div>
        <!-- <div class="modal-footer">
            <h4>hello</h4>
          </div> -->
      </div>
    </div>
  </div>


  <script src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.6.0.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/popper.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/toolTip.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/custom/inputFilterDate.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/custom/customFilter.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/splide.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/custom/customSliderDetails.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/custom/bsValidation.js"></script>
</body>

</html>