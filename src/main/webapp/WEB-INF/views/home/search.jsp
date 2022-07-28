<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/flatpickr.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
    integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==
    " crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/style.css">
</head>
<body>
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
                          <ul class="navbar-nav 
                          position-fixed top-0 bg-primary end-0 z-index-9999 start-0 bottom-0 d-md-none d-sm-block">
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
    <nav>
      <div class="container">
        <div class="row">
          <div class="col">
            <nav aria-label="breadcrumb">
              <ol class="breadcrumb my-2">
                <li class="breadcrumb-item fs-12"><a href="#" class="text-decoration-none text-blue">Trang chủ</a></li>
                <li class="breadcrumb-item fs-12"><a href="#" class="text-decoration-none text-blue">${city}</a></li>
                <li class="breadcrumb-item fs-12 active" aria-current="page">Kết quả tìm kiếm</li>
              </ol>
            </nav>
          </div>
        </div>
      </div>
    </nav>
    <div class="content">
        <div class="container">
            <div class="row">
              <div class="col-sm-4 col-md-3 mb-5">
                 <aside>
                  <!-- Filter-Form -->
                      <form action="" class="row py-3 px-2 bg-orange bd-r-2 needs-validation mx-0" novalidate>
                        <h4 class="h4">Search</h4>
                        <div class="col-sm-12">
                          <label for="province-filter" class="form-label mb-0 fs-12">Destination / property name:</label>
                          <div class="input-group bd-r-2">       
                            <span class="input-group-text border-0 bg-white">
                              <i class="fa-solid fa-magnifying-glass"></i>
                            </span>
                            <input type="text" class="form-control ps-0 fs-14 py-2 shadow-none border-0 bd-r-2 bg-white"
                             aria-label="province" id="province-filter" autocomplete="off" required>
                             <div class="invalid-feedback mb-1">
                              <span style="background-color:#fff0f0" class="d-block p-2 bd-r-2 d-flex align-items-center">
                                <i class="fa-solid fa-circle-info fs-20 me-2"></i>
                                <span class="text-dark">Vui lòng nhập điểm đến để bắt đầu tìm kiếm.</span>
                              </span>
                             
                             </div>
                          </div>    
                                   
                        </div>
                        <div class="col-sm-12">
                          <label for="" class="form-label mb-0 fs-12">Check-in date</label>
                          <div class="input-group bd-r-2">
                            <span class="input-group-text border-0 bg-white">
                              <i class="fa-solid fa-calendar-day"></i>
                            </span>
                            <input type="text" class="form-control ps-0 fs-14 p-c py-2 shadow-none border-0 bd-r-2 bg-white"
                             id="checkin-date-filter" value="Check-in date" data-date-value="">
                            <span class="input-group-text border-0 bg-white">
                              <i class="fa-solid fa-angle-down fs-12"></i>
                            </span>
                          </div>
                        </div>
                        <div class="col-sm-12">
                          <label for="" class="form-label mb-0 fs-12">Check-out date</label>
                          <div class="input-group bd-r-2">
                            <span class="input-group-text border-0 bg-white">
                              <i class="fa-solid fa-calendar-day"></i>
                            </span>
                            <input type="text" class="form-control ps-0 fs-14 py-2 p-c shadow-none border-0 bd-r-2 bg-white"
                              id="checkout-date-filter" value="Check-out date" data-date-value="">
                            <span class="input-group-text border-0 bg-white">
                              <i class="fa-solid fa-angle-down fs-12"></i>
                            </span>
                          </div>
                        </div>
                        <div class="col-sm-12">
                          <label for="" class="form-label mb-0 fs-12"><!-- Chau viet tinh ngay o day checkout-checkin --> Night stay</label>
                          <div class="input-group bd-r-2 position-relative">
                            <input type="text" class="form-control fs-14 py-2
                             shadow-none border-0 bd-r-2 bg-white input-drop-select p-c"
                             aria-label='filterRoom' id="input-filter-room"
                              value="2 adults - 0 children - 1 rooms" readonly>
                            <span class="input-group-text border-0 bg-white">
                              <i class="fa-solid fa-angle-down fs-12"></i>
                            </span>
                            <div class="input-list-dropdown bg-white p-3" id="filter-room-form">
                              <div class="d-flex align-items-center justify-content-between my-1">
                                <span class="text-dark fw-500 fs-14">Adult</span>
                                <div class="filter-room__action2 d-flex align-items-center me-2 border">
                                  <button class="btn btn-action border-0 br-0 shadow-none" data-type="minus" data-field="adults" type="button">
                                    <i class="fa-solid fa-minus"></i>
                                  </button>
                                  <span class="text-dark fw-500 w-40 h-40 d-flex
                                     align-items-center justify-content-center amount-result" data-field="adults">2</span>
                                  <button class="btn btn-action border-0 br-0 shadow-none" data-type="plus" data-field="adults" type="button">
                                    <i class="fa-solid fa-plus"></i>
                                  </button>
                                </div>
                              </div>
                              <div class="d-flex align-items-center justify-content-between my-1">
                                <span class="text-dark fw-500 fs-14">Children</span>
                                <div class="filter-room__action2 d-flex align-items-center me-2 border">
                                  <button class="btn btn-action border-0 br-0 shadow-none disable" data-type="minus" data-field="childs" type="button">
                                    <i class="fa-solid fa-minus"></i>
                                  </button>
                                  <span class="text-dark fw-500 w-40 h-40 d-flex
                                     align-items-center justify-content-center amount-result" data-field="childs">0</span>
                                  <button class="btn btn-action border-0 br-0 shadow-none" data-type="plus" data-field="childs" type="button">
                                    <i class="fa-solid fa-plus"></i>
                                  </button>
                                </div>
                              </div>
                              <div class="d-flex align-items-center justify-content-between my-1">
                                <span class="text-dark fw-500 fs-14">Room</span>
                                <div class="filter-room__action2 d-flex align-items-center me-2 border">
                                  <button class="btn btn-action border-0 br-0 shadow-none disable" data-type="minus" data-field="rooms" type="button">
                                    <i class="fa-solid fa-minus"></i>
                                  </button>
                                  <span class="text-dark fw-500 w-40 h-40 d-flex
                                     align-items-center justify-content-center amount-result" data-field="rooms">1</span>
                                  <button class="btn btn-action border-0 br-0 shadow-none" data-type="plus" data-field="rooms" type="button">
                                    <i class="fa-solid fa-plus"></i>
                                  </button>
                                </div>
                              </div>
                            </div>
                          </div>
                        </div>
                        <div class="col-sm-12 gy-3">
                          <button class="btn-primary2 bd-r-2 border-0 text-white w-100 py-3 px-2" type="submit">Tìm</button>
                        </div>
                      </form>
                      <div class="sidebar-filter mt-2 bd-r-2">
                        <h5 class="h5 fw-bold border border-bottom-0 mb-0 p-2 bd-r-2 br-bottom-0">Chọn lọc theo: </h5>
                        <div class="border border-bottom-0 p-3">
                            <h6 class="h6 fw-bold fs-14">Ngân sách của bạn (mỗi đêm)</h6>
                            <div class="form-check d-flex align-items-center my-1">
                              <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="budget-checkbox1">
                              <label class="form-check-label p-c ms-2 fs-14" for="budget-checkbox1">               
                                VND 0 - VND 1.000.000
                              </label>
                              <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="budget-checkbox1">               
                                14
                              </label>
                            </div>
                            <div class="form-check d-flex align-items-center my-1">
                              <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="budget-checkbox2">
                              <label class="form-check-label p-c ms-2 fs-14" for="budget-checkbox2">               
                                VND 1.000.000 - VND 2.000.000
                              </label>
                              <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="budget-checkbox2">               
                                4
                              </label>
                            </div>
                            <div class="form-check d-flex align-items-center my-1">
                              <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="budget-checkbox3">
                              <label class="form-check-label p-c ms-2 fs-14" for="budget-checkbox3">               
                                VND 2.000.000 - VND 3.000.000
                              </label>
                              <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="budget-checkbox3">               
                                5
                              </label>
                            </div>
                            <div class="form-check d-flex align-items-center my-1">
                              <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="budget-checkbox4">
                              <label class="form-check-label p-c ms-2 fs-14" for="budget-checkbox4">               
                                VND 3.000.000 - VND 4.000.000
                              </label>
                              <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="budget-checkbox4">               
                                2
                              </label>
                            </div>
                            <div class="form-check d-flex align-items-center my-1">
                              <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="budget-checkbox5">
                              <label class="form-check-label p-c ms-2 fs-14" for="budget-checkbox5">               
                                VND 4.000.000 +
                              </label>
                              <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="budget-checkbox5">               
                                15
                              </label>
                            </div>
                        </div>  
                        <div class="border border-bottom-0 p-3">
                          <h6 class="h6 fw-bold fs-14">Xếp hạng sao</h6>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="rating-star1">
                            <label class="form-check-label p-c ms-2 fs-14" for="rating-star1">               
                               1 sao
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="rating-star1">               
                               1
                            </label>
                          </div>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="rating-star2">
                            <label class="form-check-label p-c ms-2 fs-14" for="rating-star2">               
                              2 sao
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="rating-star2">               
                              1
                            </label>
                          </div>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="rating-star3">
                            <label class="form-check-label p-c ms-2 fs-14" for="rating-star3">               
                              3 sao
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="rating-star3">               
                              8
                            </label>
                          </div>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="rating-star4">
                            <label class="form-check-label p-c ms-2 fs-14" for="rating-star4">               
                              4 sao
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="rating-star4">               
                              4
                            </label>
                          </div>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="rating-star5">
                            <label class="form-check-label p-c ms-2 fs-14" for="rating-star5">               
                              5 sao
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="rating-star5">               
                              1
                            </label>
                          </div>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="rating-star0">
                            <label class="form-check-label p-c ms-2 fs-14" for="rating-star0">               
                              Không xếp hạng
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="rating-star0">               
                              17
                            </label>
                          </div>
                        </div>          
                        <div class="border border-bottom-0 p-3">
                          <h6 class="h6 fw-bold fs-14">Ưu đãi</h6>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="bonus-1">
                            <label class="form-check-label p-c ms-2 fs-14" for="bonus-1">               
                              Tất cả các ưu đãi
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="bonus-1">               
                               10
                            </label>
                          </div>
                        </div>          
                        <div class="border border-bottom-0 p-3">
                          <h6 class="h6 fw-bold fs-14">Chính sách hủy đặt phòng</h6>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="policy-1">
                            <label class="form-check-label p-c ms-2 fs-14" for="policy-1">               
                              Miễn phí hủy
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="policy-1">               
                              3
                            </label>
                          </div>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="policy-2">
                            <label class="form-check-label p-c ms-2 fs-14" for="policy-2">               
                              Đặt phòng không cần thẻ tín dụng
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="policy-2">               
                              16
                            </label>
                          </div>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="policy-3">
                            <label class="form-check-label p-c ms-2 fs-14" for="policy-3">               
                              Không cần thanh toán trước
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="policy-3">               
                              16
                            </label>
                          </div>
                        </div>
                        <div class="border p-3">
                          <h6 class="h6 fw-bold fs-14">Loại chỗ ở</h6>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="accommodation-type1">
                            <label class="form-check-label p-c ms-2 fs-14" for="accommodation-type1">               
                              Biệt thự
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="accommodation-type1">               
                              10
                            </label>
                          </div>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="accommodation-type2">
                            <label class="form-check-label p-c ms-2 fs-14" for="accommodation-type2">               
                              Khách sạn
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="accommodation-type2">               
                              7
                            </label>
                          </div>
                          <div class="form-check d-flex align-items-center my-1">
                            <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="accommodation-type3">
                            <label class="form-check-label p-c ms-2 fs-14" for="accommodation-type3">               
                              Căn hộ
                            </label>
                            <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="accommodation-type3">               
                              4
                            </label>
                          </div>
                          <div class="collapse" id="accommodation-remain">
                            <div class="form-check d-flex align-items-center my-1">
                              <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="accommodation-type3">
                              <label class="form-check-label p-c ms-2 fs-14" for="accommodation-type3">               
                                Nhà khách
                              </label>
                              <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="accommodation-type3">               
                                4
                              </label>
                            </div>
                            <div class="form-check d-flex align-items-center my-1">
                              <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="accommodation-type4">
                              <label class="form-check-label p-c ms-2 fs-14" for="accommodation-type4">               
                                Resort
                              </label>
                              <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="accommodation-type4">               
                                3
                              </label>
                            </div>
                            <div class="form-check d-flex align-items-center my-1">
                              <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="accommodation-type5">
                              <label class="form-check-label p-c ms-2 fs-14" for="accommodation-type5">               
                                Nhà nghỉ nông thôn
                              </label>
                              <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="accommodation-type5">               
                                1
                              </label>
                            </div>
                            <div class="form-check d-flex align-items-center my-1">
                              <input class="form-check-input bd-r-2 checkbox-rs shadow-none p-c mt-0" type="checkbox" value="" id="accommodation-type6">
                              <label class="form-check-label p-c ms-2 fs-14" for="accommodation-type6">               
                                Nhà nghỉ giữa thiên nhiên
                              </label>
                              <label class="form-check-label p-c ms-auto fs-14 text-secondary" for="accommodation-type6">               
                                1
                              </label>
                            </div>
                          </div>
                          <div>
                            <a class="text-blue text-toggle" data-bs-toggle="collapse" href="#accommodation-remain" role="button" aria-expanded="false" aria-controls="accommodation-remain">
                              <span class="text-expanded fs-14">
                                Hiển thị tất cả
                                <i class="fa-solid fa-angle-down fs-12"></i>
                              </span>
                              <span class="text-collapsed fs-14">
                                Hiển thị ít đi
                                <i class="fa-solid fa-angle-up fs-12"></i>
                              </span>
                            </a>
                          </div>
                          
                        </div>          
                      </div>
                 </aside>
              </div>
              <div class="col-sm-8 col-md-9">
                <h4 class="h4 fw-bold">${city}: ${result} accomodations found.</h4>
                <div class="row">
                  <div class="col-sm-12"><hr style="color: #ccc;"></div>
                </div>

                <div class="row">
                  <div class="col-sm-12">
                    <div class="d-flex">
                      <button class="btn btn-primary2 text-white shadow-none bd-r-2 br-r-0 px-lg-5">Lựa chọn hàng đầu của chúng tôi</button>
                      <button class="btn text-blue btn-action2 border-end-0 shadow-none 
                      -start-0 br-0 text-white bd-r-2 br-r-0 px-lg-5">Ưu tiên nhà & căn hộ</button>
                      <div class="d-flex flex-fill">
                        <div class="dropdown">
                          <button class="btn btn-action2 br-l-0 bd-r-2 h-100 shadow-none dropdown-toggle border-start-0" type="button" id="filter-more" data-bs-toggle="dropdown" aria-expanded="false">
                            <i class="fa-solid fa-ellipsis text-blue"></i>
                          </button>
                          <ul class="dropdown-menu bd-r-2 dropdown-menu-cs py-0" aria-labelledby="filter-more">
                            <li><a class="dropdown-item fs-14 p-2" href="#">Hạng sao (ưu tiên cao nhất)</a></li>
                            <li><a class="dropdown-item fs-14 p-2" href="#">Hạng sao (ưu tiên thấp nhất)</a></li>
                          </ul>
                        </div>
                      </div>
                      
                      
                    </div>      
                  </div>
                </div>

                <article class="hotel-article row mt-3">
                  <c:forEach var="acc" items="${accomms }">
                    <c:set var="rand1"><%= java.lang.Math.round(java.lang.Math.random() * 2 +1) %></c:set>
                    <c:set var="rand2"><%= java.lang.Math.round(java.lang.Math.random() * 4 +1) %></c:set>
                    <div class="col-sm-12 mb-3">
                    <div class="border p-3 d-flex flex-sm-column-reverse flex-lg-row bd-r-2">
                      <a href="#" class="position-relative d-inline-block text-decoration-none mt-sm-3 mt-lg-0">
                        <img src="localhost:9596/api/image/getimage/${acc.image}" class="img-article bd-r-4" alt="">
                        <i class="fa-regular fa-heart position-absolute end-0 top-0 
                        text-white p-c fs-20 m-2 text-shadow-icon"
                        data-bs-toggle="tooltip" data-bs-placement="top"
                            title="Lưu"></i>
                        <i class="fa-solid fa-heart position-absolute end-0 top-0 text-shadow-icon d-none p-c fs-20 m-2"></i>
                      </a> 
                      <div class="ms-sm-0 ms-lg-3 d-flex justify-content-between">

                        <div class="w-75">

                          <h5 class="h5 d-flex flex-wrap align-items-lg-center fw-bold mb-0">
                            <a href="" class="text-blue text-decoration-none me-2">
                              ${acc.name}
                            </a>
                            <i class="fa-solid p-1 bd-r-2 fs-12 fa-thumbs-up
                            bg-orange text-white" data-bs-toggle="tooltip" data-bs-placement="top"
                            title="Đây là chỗ nghỉ Đối tác Ưu tiên. 
                            Nơi đây cam kết cung cấp cho khách những 
                            trải nghiệm tích cực đáng giá tiền với dịch vụ tốt. 
                            Chỗ nghỉ này có thể phải chi trả thêm một khoản nhỏ cho 
                            Booking.com để tham gia Chương trình."
                            ></i>
                          </h5>

                          <div class="hotel-info">
                            <a href="" class="text-blue fs-14 fw-500">${acc.city_name}</a>
                            <span class="text-secondary fs-12">
                              <span class="fs-20 fw-bold op-0-5">.</span>  
                              ${rand1}km away from center.
                            </span>
                            <p class="text-secondary fs-12 w-75 ps-2 has-separated mt-2">
                              ${acc.description}
                            </p>
                          </div>

                        </div>

                        <div class="flex-fill">
                          <a href="#" class="d-flex ps-3 align-items-center text-decoration-none justify-content-end">
                            <div class="me-2 m-w-70">
                              <p class="fw-bold text-dark fs-6 mb-0">${acc.category_name}</p>
                              <p class="fs-12 text-secondary mb-0">155 đánh giá</p>
                            </div>
                            <span class="text-white bg-primary bd-r-4 icon-size p-3 d-flex align-items-center justify-content-center">
                              ${rand2}
                            </span>
                          </a>
                          <div class="mt-2 text-end">
                            <p class="text-secondary fs-12 mb-0">Is available</p>
                            <h5 class="mb-0">${acc.status?"Always available":"Not available"}</h5>
                            <p class="text-secondary fs-12 mb-0">Top booking</p>
                          </div>
                          <div class="text-end mt-2">
                            <a href="details.html" class="btn btn-primary2 fs-14 d-inline-flex text-white justify-content-between fw-500">
                              Xem chỗ trống
                              <i class="fa-solid fa-angle-right fs-12 mx-2"></i>
                            </a>
                            
                          </div>
                        </div>

                      </div>
                    </div>
                  </div>
                  </c:forEach>
                </article>
                
                <div class="row">
                  <div class="col-sm-12">
                    <div class="border bd-r-2 mb-3 d-flex align-items-center justify-content-between flex-wrap">
                      <nav aria-label="Pagination" class="p-2">
                        <ul class="pagination mb-0">
                          <li class="page-item disabled mx-1">
                            <a class="page-link border-0 text-blue-btn shadow-none bd-r-2" href="#" aria-disabled="true">
                              <i class="fa-solid fa-angle-left fs-12"></i>
                            </a>
                          </li>
                          <li class="page-item active disabled mx-1"><a class="page-link border-0 text-blue-btn shadow-none bd-r-2"
                             href="#" aria-current="page">1</a></li>
                          <li class="page-item mx-1"><a class="page-link border-0 text-blue-btn shadow-none bd-r-2" href="#">2</a></li>                   
                          <li class="page-item mx-1">
                            <a class="page-link border-0 text-blue-btn bd-r-2 shadow-none" href="#">
                            <i class="fa-solid fa-angle-right fs-12"></i>
                            </a>
                          </li>
                        </ul>
                      </nav>
                      <p class="text-dark fs-14 mb-0 px-3">Hiển thị n kết quả</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
        </div>
    </div>
    

    <section>
      <div class="container-fluid">
        <div class="row bg-footer">
          <div class="col-sm-12">
            <div class="pt-5 pb-2">
              <h4 class="h4 text-white fw-light text-center mb-0">Tiết kiệm thời gian và tiền bạc!</h4>
              <p class="text-center" style="color: #bdbdbd;">Hãy đăng ký và chúng tôi sẽ gửi những ưu đãi tốt nhất cho bạn</p>
            </div>
            <div class="">
              <form action="" class="needs-validation d-flex justify-content-center px-4">
                <input type="email" class="p-2 me-1 text-black-50 fs-20 flex-sm-grow-1 flex-xl-grow-0 w-25" placeholder="Địa chỉ email của bạn" required>
                <button class="btn btn-primary2 fs-1-2 text-white px-5" type="submit">Đăng ký</button>
              </form>
            </div>
            <div class="text-center pt-2 pb-5">
                <input type="checkbox" name="" id="checkbox-sendlink-down">
                <label for="checkbox-sendlink-down" class="text-white fs-14"> Gửi cho tôi đường dẫn để tải ứng dụng Booking.com MIỄN PHÍ!</label>
            </div>
          </div>
        </div>
        <div class="row bg-primary">
          <div class="col-sm-12">
            <div class="py-3 text-center">
              <a href="" class="btn btn-sm btn-primary fw-400 btn-sm text-white border fs-14 px-3">Đăng chỗ nghỉ của quí vị</a>
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

    <footer class="footer">
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
            <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Các câu hỏi thường gặp về virus corona (COVID-19)</a>
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
              <p class="fs-12">Bản quyền © 1996–2022 Booking.com™. Bảo lưu mọi quyền.</div>
            </div>
        </div>
        <div class="row">
          <div class="col-sm-12">
            <div class="text-center mt-2">
              <p class="fs-12">Booking.com là một phần của Booking Holdings Inc., tập đoàn đứng đầu thế giới về du lịch trực tuyến và các dịch vụ liên quan.</p>
            </div>
            <div class="text-center">
              <img src="${pageContext.request.contextPath}/resources/assets/img/bookinglogo.png" alt="" class="m-3">
              <img src="${pageContext.request.contextPath}/resources/assets/img/pricelinelogo.png" alt="" class="m-3">
              <img src="${pageContext.request.contextPath}/resources/assets/img/kaykaklogo.png" alt="" class="m-3">
              <img src="${pageContext.request.contextPath}/resources/assets/img/agodalogo.png" alt="" class="m-3">
              <img src="${pageContext.request.contextPath}/resources/assets/img/rentalcarslogo.png" alt="" class="m-3">
              <img src="${pageContext.request.contextPath}/resources/assets/img/opentablelogo.png" alt="" class="m-3">
            </div>
          </div>
        </div>
      </div>
    </footer>
    
    <script src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.6.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/toolTip.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/custom/inputFilterDate.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/custom/customFilter.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/custom/bsValidation.js"></script>


</body>
</html>