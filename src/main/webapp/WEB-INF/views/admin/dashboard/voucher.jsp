<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Host Dashboard</title>

 <!-- Google Font: Source Sans Pro -->
 <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
 <!-- Font Awesome -->
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/fontawesome-free/css/all.min.css">
 <!-- Ionicons -->
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/select2/css/select2.min.css">
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/select2-bootstrap4-theme/select2-bootstrap4.min.css">
 <!-- Select2 -->
 <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
 <!-- Tempusdominus Bootstrap 4 -->
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
 <!-- iCheck -->
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
 <!-- JQVMap -->
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/jqvmap/jqvmap.min.css">
 <!-- Theme style -->
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/dist/css/adminlte.min.css">
 <!-- overlayScrollbars -->
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
 <!-- Daterange picker -->
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/daterangepicker/daterangepicker.css">
 <!-- summernote -->
 <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/summernote/summernote-bs4.min.css">
  <style>
    #voucherTable_filter{
      float: right;
    }
    .dataTables_empty{
      text-align: center;
    }
  </style>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">

  <!-- Preloader -->
  

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#" role="button"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="add-service.html" class="nav-link">Home</a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="#" class="nav-link">Contact</a>
      </li>
    </ul>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
      <!-- Navbar Search -->
      <li class="nav-item">
        <a class="nav-link" data-widget="navbar-search" href="#" role="button">
          <i class="fas fa-search"></i>
        </a>
        <div class="navbar-search-block">
          <form class="form-inline">
            <div class="input-group input-group-sm">
              <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
              <div class="input-group-append">
                <button class="btn btn-navbar" type="submit">
                  <i class="fas fa-search"></i>
                </button>
                <button class="btn btn-navbar" type="button" data-widget="navbar-search">
                  <i class="fas fa-times"></i>
                </button>
              </div>
            </div>
          </form>
        </div>
      </li>

      <!-- Messages Dropdown Menu -->
      <li class="nav-item dropdown">
        <a class="nav-link" data-toggle="dropdown" href="#">
          <i class="far fa-comments"></i>
          <span class="badge badge-danger navbar-badge">3</span>
        </a>
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="${pageContext.request.contextPath}/resources/dashboard/dist/img/user1-128x128.jpg" alt="User Avatar" class="img-size-50 mr-3 img-circle">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Brad Diesel
                  <span class="float-right text-sm text-danger"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">Call me whenever you can...</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="${pageContext.request.contextPath}/resources/dashboard/dist/img/user8-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  John Pierce
                  <span class="float-right text-sm text-muted"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">I got your message bro</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <!-- Message Start -->
            <div class="media">
              <img src="${pageContext.request.contextPath}/resources/dashboard/dist/img/user3-128x128.jpg" alt="User Avatar" class="img-size-50 img-circle mr-3">
              <div class="media-body">
                <h3 class="dropdown-item-title">
                  Nora Silvester
                  <span class="float-right text-sm text-warning"><i class="fas fa-star"></i></span>
                </h3>
                <p class="text-sm">The subject goes here</p>
                <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
              </div>
            </div>
            <!-- Message End -->
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
        </div>
      </li>
      <!-- Notifications Dropdown Menu -->
      <li class="nav-item dropdown">
        <a class="nav-link" data-toggle="dropdown" href="#">
          <i class="far fa-bell"></i>
          <span class="badge badge-warning navbar-badge">15</span>
        </a>
        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
          <span class="dropdown-item dropdown-header">15 Notifications</span>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fas fa-envelope mr-2"></i> 4 new messages
            <span class="float-right text-muted text-sm">3 mins</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fas fa-users mr-2"></i> 8 friend requests
            <span class="float-right text-muted text-sm">12 hours</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item">
            <i class="fas fa-file mr-2"></i> 3 new reports
            <span class="float-right text-muted text-sm">2 days</span>
          </a>
          <div class="dropdown-divider"></div>
          <a href="#" class="dropdown-item dropdown-footer">See All Notifications</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" data-widget="fullscreen" href="#" role="button">
          <i class="fas fa-expand-arrows-alt"></i>
        </a>
      </li>
    </ul>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-navy elevation-4">
    <!-- Brand Logo -->
    <a href="add-room.html" class="brand-link">
      <img src="${pageContext.request.contextPath}/resources/dashboard/dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opavoucher: .8">
      <span class="brand-text font-weight-light">TLTC</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="${pageContext.request.contextPath}/resources/dashboard/dist/img/avatar2.png" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="#" class="d-block">Anh Châu (Host)</a>
        </div>
      </div>

      <!-- SidebarSearch Form -->
      <div class="form-inline">
        <div class="input-group" data-widget="sidebar-search">
          <input class="form-control form-control-sidebar" type="search" placeholder="Search" aria-label="Search">
          <div class="input-group-append">
            <button class="btn btn-sidebar">
              <i class="fas fa-search fa-fw"></i>
            </button>
          </div>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item menu-open">
            <a href="#" class="nav-link active">
                <i class="fas fa-house-user mx-1"></i>
                <p>
                  Quản lý phòng
                  <i class="right fas fa-angle-left"></i>
                </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="${pageContext.request.contextPath}/admin/dashboard/room/add" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Tạo phòng mới</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="${pageContext.request.contextPath}/admin/dashboard/room/info" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Xem danh sách phòng</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="${pageContext.request.contextPath}/admin/dashboard/voucher" class="nav-link active">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Tạo voucher</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="${pageContext.request.contextPath}/admin/dashboard/room/service" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Tạo dịch vụ</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="${pageContext.request.contextPath}/admin/dashboard/room/type" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Kiểu phòng</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="fas fa-hotel mx-1"></i>
              <p>
                Quản lý chỗ nghỉ
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">  
              <li class="nav-item">
                <a href="${pageContext.request.contextPath}/admin/dashboard/accommodation/info" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Xem danh sách chỗ nghỉ</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="${pageContext.request.contextPath}/admin/dashboard/accommodation/add" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Thêm chỗ nghỉ</p>
                </a>
              </li>
            </ul>
          </li>
          
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0">Voucher</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Quản lý phòng</a></li>
              <li class="breadcrumb-item active">Voucher</li>
            </ol>
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">Danh sách voucher</h3>
                <div class="card-tools">
                  <button type="button" class="btn btn-tool" data-card-widget="collapse" title="Collapse">
                    <i class="fas fa-minus"></i>
                  </button>
                </div>
              </div>
              <div class="card-body">
                <table
                  id="voucherTable"
                  class="table table-bordered table-striped"
                >
                  <thead>
                    <tr>
                      <th>#</th>
                      <th>Chỗ nghỉ</th>    
                      <th>Giá giảm</th>    
                      <th>Thời hạn đến</th>    
                      <th></th>
                    </tr>
                  </thead>
                  <tbody>
                  	<c:forEach var="voucher" items="${vouchers}">
	                  	<tr>
	                      <input type="hidden" name="id" value="${voucher.id}">
	                      <td></td>
	                      <td data-id="${voucher.accomodation_id}">
                          <a href="" role="button" data-toggle="modal" data-target="#modal-info">
                            ${voucher.accomodation_name}
                          </a>
                        </td>
	                      <td>${voucher.priceDiscount}</td>
	                      <td>                          
                          <fmt:formatDate pattern = "dd/MM/yyyy" value = "${voucher.expDate}" />
                        </td>
	                      <td><a href="${pageContext.request.contextPath }/admin/dashboard/voucher/delete/${voucher.id}" class="btn btn-danger btn-sm" onclick="return confirm('Bạn có muốn xóa không?')"><i class="fas fa-times"></i></a></td>
	                    </tr> 
                  	</c:forEach>
                       
                  </tbody>      
                </table>
              </div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">Tạo voucher mới</h3>
                <div class="card-tools">
                  <button type="button" class="btn btn-tool" data-card-widget="collapse" title="Collapse">
                    <i class="fas fa-minus"></i>
                  </button>
                </div>
              </div>
              <div class="card-body">
                <form method="post" action="${pageContext.request.contextPath}/admin/dashboard/voucher/add" id="voucherAddForm">
                  <div class="form-group">
                    <label>Chọn chỗ nghỉ</label>
                    <select class="form-control select2" name="accomodation_id" style="width: 100%;">
                      <c:forEach var="accommo" items="${accommodations }">
                      	<option value="${accommo.id }">${accommo.name}</option>
                      </c:forEach>
                    </select>
                  </div>
                  <div class="form-group">
                    <label for="">Bạn muốn giảm bao nhiêu</label>
                     <div class="input-group">
                        <input type="number" name="priceDiscount" class="form-control">
                        <div class="input-group-append">
                          <span class="input-group-text">$</span>
                        </div>
                      </div>
                  </div>
                  <div class="form-group">
                    <label>Date and time:</label>
                      <div class="input-group w-25 date" id="reservationdatetime" data-target-input="nearest">
                          <input type="text" name="expDate" class="form-control datetimepicker-input"
                           data-target="#reservationdatetime" data-toggle="datetimepicker"/>
                          <div class="input-group-append" data-target="#reservationdatetime">
                              <div class="input-group-text"><i class="fa fa-calendar"></i></div>
                          </div>
                      </div>
                  </div>
                  <div class="card-footer">
                    <button type="submit" class="btn btn-primary">Thêm voucher</button>
                  </div>
                </form> 
                </div>
                <!-- /.card-body -->                
            </div>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <footer class="main-footer">
    <strong>Copyright &copy; 2022 TLTC Company</strong>
  </footer>


  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->
<!-- Modal -->
<div class="modal fade" id="modal-info">
  <div class="modal-dialog h-80 my-0 py-3">
    <form action="${pageContext.request.contextPath}/admin/dashboard/voucher/edit" method="post" id="editForm" class="modal-content h-100 overflow-auto">
      <div class="modal-header pl-5">
        <h4 class="modal-title">Thông tin voucher</h4>
        <button
          type="button"
          class="close"
          data-dismiss="modal"
          aria-label="Close"
        >
          <span aria-hidden="true">&times;</span>
        </button>
      </div>            
      <div class="modal-body container-fluid px-5">
        <div class="row">
          <div class="form-group col-12">
            <label>Chỗ nghỉ</label>
            <select class="form-control select2" name="accomodation_id" style="width: 100%;">
              <c:forEach var="accommo" items="${accommodations}">
       			<option value="${accommo.id}">${accommo.name}</option>
              </c:forEach>
            </select>
          </div>
          <div class="form-group col-12">
            <label>Giá giảm</label>
            <div class="input-group">
              <input type="number" name="priceDiscount" class="form-control" 
              autocomplete="off" id="" placeholder="Nhập giá giảm">
              <div class="input-group-append">
                <span class="input-group-text">$</span>
              </div>
            </div>
          </div>
          <div class="form-group col-12">
            <label>Thời hạn đến</label>
            <div class="input-group  date" id="expDate" data-target-input="nearest">
                <input type="text" name="expDate" class="form-control datetimepicker-input"
                data-target="#expDate" autocomplete="off" data-toggle="datetimepicker"/>
                <div class="input-group-append" data-target="#expDate">
                    <div class="input-group-text"><i class="fa fa-calendar"></i></div>
                </div>
            </div>
          </div>
        </div>
        <input type="hidden" name="id">
      </div>
      <div class="modal-footer px-5 justify-content-between">
        <button
          type="button"
          class="btn btn-default"
          data-dismiss="modal"
        >
          Đóng
        </button>
        <button type="submit" class="btn btn-primary">
          Lưu
        </button>
      </div>
    </form>
    <!-- /.modal-content -->
  </div>
  <!-- /.modal-dialog -->
</div>

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- DataTables  & Plugins -->
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables-buttons/js/dataTables.buttons.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables-buttons/js/buttons.bootstrap4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/jszip/jszip.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/pdfmake/pdfmake.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/pdfmake/vfs_fonts.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables-buttons/js/buttons.html5.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables-buttons/js/buttons.print.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables-buttons/js/buttons.colVis.min.js"></script>
<!-- bs-custom-file-input -->
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button)
</script>


<!-- daterangepicker -->
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/moment/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/daterangepicker/daterangepicker.js"></script>
<!-- Tempusdominus Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/summernote/summernote-bs4.min.js"></script>
<!-- overlayScrollbars -->
<!-- jquery-validation -->
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/jquery-validation/jquery.validate.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/jquery-validation/additional-methods.min.js"></script>

<!-- InputMask -->
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/moment/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/inputmask/jquery.inputmask.min.js"></script>

<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/resources/dashboard/dist/js/adminlte.js"></script>
<!-- Select2 -->
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/select2/js/select2.full.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/hostJs/add-voucher.js"></script>
<script src="${pageContext.request.contextPath}/resources/dashboard/plugins/hostJs/voucher-info.js"></script>

</body>
</html>
