<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                  <span class="fw-bold h4 text-black mb-0">${accommodation.name}</span>
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
                <span> ${ accommodationDetail.accommodation.city_name } </span>
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
                          <img src="http://localhost:9596/api/image/getimage/${images[0]}" class="shadow-fade h-17 w-100 bd-r-2" alt="" />
                        </div>
                        <div class="col-sm-12">
                          <img src="http://localhost:9596/api/image/getimage/${images[1]}" class="shadow-fade h-17 w-100 bd-r-2" alt="" />
                        </div>
                      </div>
                    </div>
                    <div class="col-sm-8 ps-1">
                      <img src="http://localhost:9596/api/image/getimage/${images[2]}" class="shadow-fade h-35 w-100 bd-r-2" alt="" />
                    </div>
                  </div>
                </div>
                <div class="col-sm-12">
                  <div class="row">
                    <c:if test="${images.size() >= '8'}">
                      <c:forEach var="image" begin = "3" items="${images}" end="7" varStatus="loop" >
                        <c:choose>
                          <c:when test="${loop.index == 7}">
                            <div class="col ps-1 hotel-collapse-img">
                              <img src="http://localhost:9596/api/image/getimage/${image}" class="h-11 w-100 bd-r-2" alt="" />
                              <span
                                      class="number-collapse-img fw-bold text-white fs-20 d-flex justify-content-center align-items-center text-sm-center">+ ${images.size() - '7'}
                               ảnh</span>
                            </div>
                          </c:when>
                          <c:otherwise>
                            <div class="col pe-1">
                              <img src="http://localhost:9596/api/image/getimage/${image}" class="h-11 w-100 bd-r-2" alt="" />
                            </div>
                          </c:otherwise>
                        </c:choose>
                      </c:forEach>
                    </c:if>


                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Features-info -->
      <div class="row my-4">
        <c:forEach var="service" items="${services}">
          <div class="col">
            <div class="text-center">
              <svg viewBox="0 0 128 128" width="2em" height="2em">
                <path
                        d="M8 40v76a4 4 0 0 0 4 4h104a4 4 0 0 0 4-4V40zm96 56H24V72h80zm0-32H24v-8h80zm12-56H12a4 4 0 0 0-4 4v20h112V12a4 4 0 0 0-4-4zM92 26a6 6 0 1 1 6-6 6 6 0 0 1-6 6zm16 0a6 6 0 1 1 6-6 6 6 0 0 1-6 6z">
                </path>
              </svg>
              <p class="mb-0">${service.name}</p>
            </div>
          </div>
        </c:forEach>

      </div>
      <!-- Hotel-description -->
      <div class="row mt-3">
        <div class="col-sm-6 col-lg-9">
          <div class="pe-5 fs-14">
              ${accommodation.description}
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
            <c:forEach var="room" items="${rooms}">
            <tr>
              <td class="w-25">
                <div class="">
                  <a href="" class="text-blue h5 fw-bold">${room.nameRoom}</a>
                  <div class="d-flex flex-wrap my-3">
                    <c:forEach var="service" items="${services}">
                      <span class="fs-12 mb-0 me-3"> <i class="fa-solid fa-check text-success"></i> ${service.name} </span>
                    </c:forEach>
                  </div>
                </div>
              </td>
              <td class="b-l-hotel">
                <div>
                  <div class="mb-2">
                    <i class="fa-solid fa-user"></i>&nbsp; <span class="mx-2">x</span>${room.capacity}
                  </div>
                  <div class="mb-2">
                    <i class="fa-solid fa-person"></i>&nbsp; <span class="mx-2">x</span>${room.quantityAdult}
                  </div>
                  <div class="mb-2">
                    <i class="fa-solid fa-child fs-12"></i>&nbsp; <span class="mx-2">x</span>${room.quantityChildren}
                  </div>
                </div>
              </td>
              <td class="b-l-hotel">
                <p class="fw-bold mb-1">VND ${room.price}</p>
                <p class="fs-12 text-secondary">Đã bao gồm thuế và phí</p>
              </td>
              <td class="b-l-hotel">
                <ul class="ps-3">
                  <li class="fs-14 fw-bold">Không hoàn tiền</li>
                </ul>
              </td>
              <td class="b-l-hotel bg-book-room">
                <form action="${pageContext.request.contextPath}/customer/booking/form" method="get" class="h-100 d-flex justify-content-center text-center align-items-center">
                  <input type="hidden" name="checkOut" value="03-07-2022">
                  <input type="hidden" name="checkIn" value="08-07-2022">
                  <input type="hidden" name="id" value="${room.id}">
                  <button class="text-blue bg-white border-0 text-decoration-underline" type="submit">Đặt chỗ ngay</button>
                </form>
              </td>
            </tr>
            </c:forEach>
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
                  <c:forEach var="image" items="${images}"  >
                  <div class="col-sm-6 flex-grow-0 col-lg-3 gx-2 gy-1">
                    <div class="overflow-hidden img-thumbnail h-100" data-bs-toggle="collapse" data-bs-target="#zoom-in-img"
                      aria-expanded="false" role="button" aria-controls="zoom-in-img">
                      <img src="http://localhost:9596/api/image/getimage/${image}" class="img-hover h-17 w-100 bd-r-4" alt="" />
                    </div>
                  </div>

                  </c:forEach>
                </div>
                <!-- Zoom Image -->
                <div class="row h-100 py-2 zoom-img d-none" id="zoom-in-img">
                  <div class="col-12 h-100 px-0 d-flex flex-column justify-content-center align-items-center">
                    <section class="splide h-75 w-75 flex-fill" id="slider-show">
                      <div class="splide__track h-100">
                        <ul class="splide__list">
                          <c:forEach var="image" items="${images}"  >
                          <li class="splide__slide w-100 h-100">
                            <img src="http://localhost:9596/api/image/getimage/${image}" class="bd-r-4 w-100 h-100 mb-3" alt="" />
                          </li>
                          </c:forEach>
                        </ul>
                      </div> 
                    </section>
                    <section class="splide splide2 w-75 h-25 p-sm-2 p-lg-4" id="slider-thumbnail">
                      <div class="splide__track h-100 mx-4">
                        <ul class="splide__list">
                          <c:forEach var="image" items="${images}"  >
                          <li class="splide__slide h-100 op-0-5">
                            <img src="http://localhost:9596/api/image/getimage/${image}" class="w-100 h-100 bd-r-2" alt="" />
                          </li>
                          </c:forEach>
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