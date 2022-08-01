<%@page import="com.booking.entities.Room"%>
<%@page import="java.util.Date"%>
<%@page import="com.booking.helpers.BookingDateHelper"%>
<%@page import="com.booking.entities.BookingForm"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<% BookingForm bookingForm = (BookingForm) session.getAttribute("booking");
   Date checkIn = bookingForm.getBookingDetail().getCheckin();
   Date checkOut = bookingForm.getBookingDetail().getCheckout();
   long stayDays = BookingDateHelper.countDay(checkIn,checkOut);
;
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/select2.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==
    " crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/style.css" />
    <title>Booking Details</title>

</head>
<body style="height: 100vh;">
    

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

                        <li class="nav-item position-relative">
                            <button class="btn btn-primary btn-icon-nav shadow-none" data-bs-toggle="collapse" href="#user-features" role="button" aria-expanded="false">
                              <div class="d-flex align-items-center">
                                <img src="https://icon-library.com/images/no-user-image-icon/no-user-image-icon-23.jpg" alt="" class="rounded-circle me-2 border-user-filter user-icon-size-l">
                                <span class="fw-bold fs-14">Tài khoản của bạn</span>
                              </div>
                            </button>
                            <ul class="bg-white user-features list-style-none shadow-fade bd-r-2 ps-0 collapse" id="user-features">
                                <li class="p-3"><a href="${pageContext.request.contextPath }/customer/features" class="text-decoration-none text-dark"><i class="fa-regular fa-user p-2"></i>Quản lý tài khoản</a></li>
                                <li class="p-3"><a href="index.html" class="text-decoration-none text-dark"><i class="fa-solid fa-briefcase p-2"></i>Đặt chỗ</a></li>
                                <li class="p-3"><a href="${pageContext.request.contextPath }/account/logout" class="text-decoration-none text-dark"><i class="fa-solid fa-arrow-right-from-bracket p-2"></i>Đăng xuất</a></li>
                            </ul>
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

    <div class="content container">
        <div class="row">
            <div class="col-12">
                <div class="d-flex py-4">
                    <div class="d-flex align-items-center flex-fill">
                        <i class="fa-solid fa-circle-check text-blue-btn fs-4 me-1"></i>
                        <span class="text-secondary fw-bold fs-14 me-2">Bạn chọn</span>   
                        <div class="bg-light-grey flex-fill" style="height: .5px;"></div>
                    </div>
                    <div class="d-flex align-items-center flex-fill">
                        <span class="rounded-circle bg-blue3 text-white icon-size text-center mx-1">2</span>
                        <span class="text-dark fw-bold fs-14 me-2">Chi tiết đặt phòng</span>  
                        <div class="bg-light-grey flex-fill" style="height: .5px;"></div> 
                    </div>
                    <div class="d-flex align-items-center">
                        <span class="rounded-circle bg-dark text-white icon-size text-center mx-1">3</span>
                        <span class="text-secondary fw-bold fs-14 me-2">Hoàn tất đặt phòng</span>   
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
          <div class="col-sm-12 col-lg-4">
            <div class="row">
              <div class="col-12">
                <div class="border bd-r-2 p-3">
                  <h6 class="fw-bold">Chi tiết đặt phòng của bạn</h6 class="fw-bold">
                  <div class="row">
                    <div class="col-6">
                      <h6 class="fs-14">Check in</h6>
                      <div>
                        <p class="mb-0 fw-bold fs-14"><%= BookingDateHelper.getDateWithoutYear(checkIn) %></p>
                        <p class="mb-0 fw-bold fs-14"><%= BookingDateHelper.getYear(checkIn)%></p>
                      </div>
                    </div>
                    <div class="col-6">
                      <h6 class="fs-14">Check out</h6>
                      <div class="has-separate">
                        <p class="mb-0 fw-bold fs-14"><%= BookingDateHelper.getDateWithoutYear(checkOut) %></p>
                        <p class="mb-0 fw-bold fs-14"><%= BookingDateHelper.getYear(checkOut)%></p>
                      </div>
                    </div>
                  </div>
                  <div>
                    <h6 class="fs-14 py-2 mb-0 mt-3">Total length of stay:</h6>
                    <p class="fs-14 fw-bold mb-0"><%= stayDays %>&nbsp;days</p>
                    <input type="hidden" id="stayDays" value="<%= stayDays %>">
                    <hr class="hr-color">
                  </div>
                  <div>
                    <h6 class="fs-14 fw-bold pb-2 mb-0">You have selected:</h6>
                    <p class="fs-14">${room.name } (${booking.bookingDetail.quantityAdult } adults + ${booking.bookingDetail.quantityChildren } children)</p>
                    <a href="" class="btn btn-action2 text-blue text-blue-hover-none fw-500 border-0 px-1 fs-14">Đổi lựa chọn của bạn</a>
                  </div>
                </div>  
              </div>
            </div>
            <div class="row mb-3">
              <div class="col-12 gy-3">
                <div class="border bd-r-2 p-3">
                  <h6 class="fw-bold">Mã giảm giá</h6>
                  <form method="get" class="needs-validation" id="voucher-check" novalidate>
                    <div class="d-flex flex-column">
                      <label for="" class="form-label">Nhập mã giảm giá:</label>
                      <input type="text" class="voucherSelect" required>
                      <input type="hidden" name="accomodation_id" value="${room.accomodation_id }">
                      <div class="invalid-feedback">
                        * Vui lòng chọn 1 mã giảm giá !
                      </div>
                      <button class="btn btn-primary text-white mt-3" type="submit">Check voucher</button>
                    </div>
                  </form>
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-12 bd-r-2">
                <div class="border br-b-2">
                  <h6 class="fw-bold px-3 mt-3">Tóm tắt giá</h6>
                  <div class="row mb-3 px-3">
                    <div class="col-lg-8 col-sm-12 fs-14">${room.name} (${room.roomType_name })</div>
                    <div class="col-lg-4 col-sm-12 fs-14 text-lg-end text-sm-start">
                    	VND&nbsp;<span id="currentPrice">${roomPrice }</span>
                    </div>
                  </div>
                  <div class="row justify-content-between py-3 m-0 bg-blue2">
                    <div class="col-lg-7 col-sm-12">
                      <h6 class="fw-bold mb-0">Total</h6>
                      <p class="fs-12">(for <%= BookingDateHelper.countDay(checkIn, checkOut) %> nights & all customers)</p>
                    </div>
                    <div class="col-lg-5 col-sm-12">
                      <h6 class="fw-bold text-lg-end text-sm-start">VND <div id="totalPrice">${totalPrice }</div></h6>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-sm-12 col-lg-8">
            <div class="row">
              <div class="col-12">
                <div class="border bd-r-2 p-3 d-flex">
                  <img src="${pageContext.request.contextPath}/resources/assets/img/daoanh.jpg" class="rounded img-hotel me-3" alt="">
                  <div>
                    <p class="mb-0 text-secondary fs-14 fw-500">Khách sạn</p>
                    <a href="" class="d-block text-blue fw-bold fs-20 pb-2 mt-0">GOLD CITY Hotel</a>
                    <p class="mb-0 fs-14">
                      PG02-03 ( khu TTTM Vincom), Số 444-Đường 30/04, KP1, P3, TP Tây Ninh, Tây Ninh, Việt Nam, Tây Ninh, Việt Nam
                    </p>
                    <div class="d-flex align-items-center">
                      <span class="bg-primary p-1 text-center bd-r-4 rate-icon-size fs-12 text-white fw-bold br-l-b-0">9.1</span>
                      <div class="p-2">
                        <span class="fw-bold mb-0">Tốt</span>
                        <span class="text-secondary mb-0 fs-12">. 31 đánh giá</span>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-12 gy-3">
                <div class="border bd-r-2 bg-book-room p-3">
                  <h5 class="py-2 fw-bold">Thông tin của bạn</h5>
                  <p class="mb-0 booking-alert d-flex align-items-center fw-500 fs-14 mb-3">
                    <svg xmlns="http://www.w3.org/2000/svg" class="h-6 w-6 icon-size me-1" fill="none" viewBox="0 0 24 24" stroke="currentColor" stroke-width="2">
                      <path stroke-linecap="round" stroke-linejoin="round" d="M13 16h-1v-4h-1m1-4h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z" />
                    </svg> Đây là thông tin cá nhân của bạn, nếu muốn thay đổi , vui lòng bấm vào <a href="${pageContext.request.contextPath}/customer/profile" class="ms-1 text-blue text-blue-hover-none">đây</a>
                  </p>
                  <div class="row">
                    <div class="col-sm-12 col-lg-6 mb-2">
                      <label for="" class="form-label fw-500 fs-14">Email:</label>
                      <input type="text" id="" class="form-control" value="${customer.email }" disabled readonly>
                    </div>
                    <div class="col-sm-12 col-lg-6 mb-2">
                      <label for="" class="form-label fw-500 fs-14">Name:</label>
                      <input type="text" id="" class="form-control" value="${customer.name }" disabled readonly>
                    </div>
                    <div class="col-sm-12 col-lg-6 mb-2">
                      <label for="" class="form-label fw-500 fs-14">Civil identity:</label>
                      <input type="text" id="" class="form-control" value="${customer.civilIdentity }" disabled readonly>
                    </div>
                    <div class="col-sm-12 col-lg-6 mb-2">
                      <label for="" class="form-label fw-500 fs-14">Phone number:</label>
                      <input type="text" id="" class="form-control" value="${customer.phone }" disabled readonly>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-12 gy-3">
                <div class="border p-3 bd-r-2 bg-book-room">
                  <h5 class="py-2 fw-bold">${room.name } (${sessionScope.booking.bookingDetail.quantityAdult} adults + ${sessionScope.booking.bookingDetail.quantityChildren} children)</h5>
                  <span class="fw-500 fs-14">Số người tối đa:</span>
                  <span><i class="fa-regular fa-user"></i> x 3</span>
                </div>
              </div>
            </div>
            <form method="post" action="${pageContext.request.contextPath }/customer/booking/startBooking">
              <div class="row">
                <div class="col-12 gy-3">
                  <div class="border p-3 bd-r-2 bg-payment">
                    <h5 class="fw-bold mb-3">Chọn phương thức thanh toán</h5>
                    
                      <div class="d-flex flex-column">
                        <label for="" class="form-label fw-500 fs-14">Phương thức thanh toán</label>
                        <select class="paymentSelect">
                          <option value="card">Credit</option>
                          <option value="master-card">Master Card</option>
                          <option value="paypal">Paypal</option>
                        </select>
                        <!-- -->
                      </div>
                </div>
                </div>
              </div>
              <div class="row">
                <div class="col-12">
                  <div class="mt-3 d-flex justify-content-end">
                    <input type="hidden" name="voucher">
                    <button class="btn btn-primary2 text-white fw-500 d-flex align-items-center" type="submit">
                      Đặt phòng
                      <span class="ms-2"><i class="fa-solid fa-angle-right fs-12"></i></span></button>
                  </div>
                  </div>
              </div>
            </form>
          </div>
        </div>
    </div>
    
    <footer class="bg-footer-grey mt-5">
      <div class="container">
        <div class="row py-4">
          <div class="col-12">
            <span class="fs-12">Bản quyền © 1996–2022 TLTC.com. Bảo lưu mọi quyền</span>
          </div>
        </div>
      </div>
    </footer>

    <script src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.6.0.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/popper.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/select2.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/toolTip.js"></script>
    <script>
        $(document).click(function(e){
            $('#user-features').removeClass('show');
        })
        $(document).ready(function() {
            $('.paymentSelect').select2({
                theme: "classic"
            });

            $('#voucher-check').submit(function(ev){
                var voucher_name  = $('#voucher-check input[class="voucherSelect"]').val();
                var accomodation_id = $('#voucher-check input[type="hidden"][name="accomodation_id"]').val();
                if(voucher_name !== ""){
                  $.ajax({
                    type:'GET',
                    data:{
                      name: voucher_name,
                      accomodation_id: accomodation_id
                    },
                    url: '${pageContext.request.contextPath}/customer/voucher/check',
                    success: function(result){

                     if(result.expDate != undefined){
                       var dateConvert = result.expDate.split("/");
                       var currentDate = new Date();
                       var expiredDate = new Date(dateConvert[2],(+dateConvert[1])-1,dateConvert[0]);
                       var isExpired =  expiredDate.setHours(12,0,0,0) < currentDate.setHours(12,0,0,0);  
                       if(!isExpired){
                         $('input[type="hidden"][name="voucher"]').val(voucher_name);
                         var resultPrice = ((+$('#currentPrice').text()) * +$('#stayDays').val()) - result.priceDiscount;
                         if(resultPrice < 0){
                        	 $('#totalPrice').text('0');
                         }
                         else{
                        	 $('#totalPrice').text(resultPrice);
                         }
                         
                       }
                       else{
                    	 $('#totalPrice').text($('#currentPrice').text());
                    	 $('input[type="hidden"][name="voucher"]').val("");
                         alert('The voucher is currently unavailable because it has expired ('+result.expDate+')');
                       }
                     }
                     else{
                       $('#totalPrice').text($('#currentPrice').text());
                       $('input[type="hidden"][name="voucher"]').val("");
                       alert('This voucher is not found');
                     }
                    }
                  })
                  ev.preventDefault();
                }

            })

        });

        // Example starter JavaScript for disabling form submissions if there are invalid fields
        (function () {
            'use strict'

            // Fetch all the forms we want to apply custom Bootstrap validation styles to
            var forms = document.querySelectorAll('.needs-validation')

            // Loop over them and prevent submission
            Array.prototype.slice.call(forms)
                .forEach(function (form) {
                    form.addEventListener('submit', function (event) {
                        if (!form.checkValidity()) {
                            event.preventDefault()
                            event.stopPropagation()
                        }

                        form.classList.add('was-validated')
                    }, false)
                })
        })()
    </script>
</body>
</html>