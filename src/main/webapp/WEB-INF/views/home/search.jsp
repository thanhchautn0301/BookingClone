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
                      <form action="${pageContext.request.contextPath}/home/searchhome" method="get"  class="row py-3 px-2 bg-orange bd-r-2 needs-validation mx-0" novalidate>
                        <h4 class="h4">Search</h4>
                        <div class="col-sm-12">
                          <label for="province-filter" class="form-label mb-0 fs-12">Destination / property name:</label>
                          <div class="input-group bd-r-2">       
                            <span class="input-group-text border-0 bg-white">
                              <i class="fa-solid fa-magnifying-glass"></i>
                            </span>
                            <input type="text" class="form-control ps-0 fs-14 py-2 shadow-none border-0 bd-r-2 bg-white"
                             aria-label="province" id="province-filter" name="cityName" autocomplete="off" required value="${sessionScope.filter.cityName}">
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
                             id="checkin-date-filter" placeholder="Check-in date" name="datecheckin">
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
                              id="checkout-date-filter" placeholder="Check-out date" name="checkout">
                            <span class="input-group-text border-0 bg-white">
                              <i class="fa-solid fa-angle-down fs-12"></i>
                            </span>
                          </div>
                        </div>
                        <div class="col-sm-12">
                          <label for="" class="form-label mb-0 fs-12"><!-- Chau viet tinh ngay o day checkout-checkin --> Night stay</label>
                          <div class="input-group bd-r-2 position-relative">
                            <input type="text" class="form-control fs-14 py-2 no-validate
                             shadow-none border-0 bd-r-2 bg-white input-drop-select p-c"
                             aria-label='filterRoom' id="input-filter-room"
                                   value="${sessionScope.filter.adult} adults - ${sessionScope.filter.children} children" name="category" readonly>
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
                                     align-items-center justify-content-center amount-result" data-field="adults">${sessionScope.filter.adult}</span>
                                  <button class="btn btn-action border-0 br-0 shadow-none" data-type="plus" data-field="adults" type="button">
                                    <i class="fa-solid fa-plus"></i>
                                  </button>
                                </div>
                              </div>
                              <div class="d-flex align-items-center justify-content-between my-1">
                                <span class="text-dark fw-500 fs-14">Children</span>
                                <div class="filter-room__action2 d-flex align-items-center me-2 border">
                                  <button class="btn btn-action border-0 br-0 shadow-none" data-type="minus" data-field="childs" type="button">
                                    <i class="fa-solid fa-minus"></i>
                                  </button>
                                  <span class="text-dark fw-500 w-40 h-40 d-flex
                                     align-items-center justify-content-center amount-result" data-field="childs">${sessionScope.filter.children}</span>
                                  <button class="btn btn-action border-0 br-0 shadow-none" data-type="plus" data-field="childs" type="button">
                                    <i class="fa-solid fa-plus"></i>
                                  </button>
                                </div>
                              </div>
                              <div class="d-flex align-items-center justify-content-between my-1 d-none">
                                <span class="text-dark fw-500 fs-14">Room</span>
                                <div class="filter-room__action2 d-flex align-items-center me-2 border">
                                  <button class="btn btn-action border-0 br-0 shadow-none" data-type="minus" data-field="rooms" type="button">
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
                <h4 class="h4 fw-bold">${city}: ${result} found.</h4>
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
                        <img src="http://localhost:9596/api/image/getimage/${acc.image}" class="img-article bd-r-4" alt="">
                        <i class="fa-regular fa-heart position-absolute end-0 top-0 
                        text-white p-c fs-20 m-2 text-shadow-icon"
                        data-bs-toggle="tooltip" data-bs-placement="top"
                            title="Lưu"></i>
                        <i class="fa-solid fa-heart position-absolute end-0 top-0 text-shadow-icon d-none p-c fs-20 m-2"></i>
                      </a> 
                      <div class="ms-sm-0 ms-lg-3 flex-fill d-flex justify-content-between">

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
                            <p class="text-secondary fs-12 w-75 ps-2 has-separated limit-line mt-2">
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
                            <a href="details/${acc.id}" class="btn btn-primary2 fs-14 d-inline-flex text-white justify-content-between fw-500">
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