<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Host Dashboard</title>

    <!-- Google Font: Source Sans Pro -->
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback"
    />
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/fontawesome-free/css/all.min.css" />
    <!-- Ionicons -->
    <link
      rel="stylesheet"
      href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css"
    />
    <!-- iCheck -->
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css"
    />
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables-responsive/css/responsive.bootstrap4.min.css"
    />
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/dashboard/plugins/datatables-buttons/css/buttons.bootstrap4.min.css"
    />
    <!-- DataTables -->
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/dashboard/plugins/icheck-bootstrap/icheck-bootstrap.min.css"
    />
    <!-- JQVMap -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/jqvmap/jqvmap.min.css" />
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/dist/css/adminlte.min.css" />
    <!-- overlayScrollbars -->
    <link
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/dashboard/plugins/overlayScrollbars/css/OverlayScrollbars.min.css"
    />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/dashboard/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
    <!-- Daterange picker -->
  </head>
  <body class="hold-transition sidebar-mini layout-fixed">
    <div class="wrapper">
      <!-- Preloader -->

      <!-- Navbar -->
      <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" data-widget="pushmenu" href="#" role="button"
              ><i class="fas fa-bars"></i
            ></a>
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
            <a
              class="nav-link"
              data-widget="navbar-search"
              href="#"
              role="button"
            >
              <i class="fas fa-search"></i>
            </a>
            <div class="navbar-search-block">
              <form class="form-inline">
                <div class="input-group input-group-sm">
                  <input
                    class="form-control form-control-navbar"
                    type="search"
                    placeholder="Search"
                    aria-label="Search"
                  />
                  <div class="input-group-append">
                    <button class="btn btn-navbar" type="submit">
                      <i class="fas fa-search"></i>
                    </button>
                    <button
                      class="btn btn-navbar"
                      type="button"
                      data-widget="navbar-search"
                    >
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
                  <img
                    src="${pageContext.request.contextPath}/resources/dashboard/dist/img/user1-128x128.jpg"
                    alt="User Avatar"
                    class="img-size-50 mr-3 img-circle"
                  />
                  <div class="media-body">
                    <h3 class="dropdown-item-title">
                      Brad Diesel
                      <span class="float-right text-sm text-danger"
                        ><i class="fas fa-star"></i
                      ></span>
                    </h3>
                    <p class="text-sm">Call me whenever you can...</p>
                    <p class="text-sm text-muted">
                      <i class="far fa-clock mr-1"></i> 4 Hours Ago
                    </p>
                  </div>
                </div>
                <!-- Message End -->
              </a>
              <div class="dropdown-divider"></div>
              <a href="#" class="dropdown-item">
                <!-- Message Start -->
                <div class="media">
                  <img
                    src="${pageContext.request.contextPath}/resources/dashboard/dist/img/user8-128x128.jpg"
                    alt="User Avatar"
                    class="img-size-50 img-circle mr-3"
                  />
                  <div class="media-body">
                    <h3 class="dropdown-item-title">
                      John Pierce
                      <span class="float-right text-sm text-muted"
                        ><i class="fas fa-star"></i
                      ></span>
                    </h3>
                    <p class="text-sm">I got your message bro</p>
                    <p class="text-sm text-muted">
                      <i class="far fa-clock mr-1"></i> 4 Hours Ago
                    </p>
                  </div>
                </div>
                <!-- Message End -->
              </a>
              <div class="dropdown-divider"></div>
              <a href="#" class="dropdown-item">
                <!-- Message Start -->
                <div class="media">
                  <img
                    src="${pageContext.request.contextPath}/resources/dashboard/dist/img/user3-128x128.jpg"
                    alt="User Avatar"
                    class="img-size-50 img-circle mr-3"
                  />
                  <div class="media-body">
                    <h3 class="dropdown-item-title">
                      Nora Silvester
                      <span class="float-right text-sm text-warning"
                        ><i class="fas fa-star"></i
                      ></span>
                    </h3>
                    <p class="text-sm">The subject goes here</p>
                    <p class="text-sm text-muted">
                      <i class="far fa-clock mr-1"></i> 4 Hours Ago
                    </p>
                  </div>
                </div>
                <!-- Message End -->
              </a>
              <div class="dropdown-divider"></div>
              <a href="#" class="dropdown-item dropdown-footer"
                >See All Messages</a
              >
            </div>
          </li>
          <!-- Notifications Dropdown Menu -->
          <li class="nav-item dropdown">
            <a class="nav-link" data-toggle="dropdown" href="#">
              <i class="far fa-bell"></i>
              <span class="badge badge-warning navbar-badge">15</span>
            </a>
            <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
              <span class="dropdown-item dropdown-header"
                >15 Notifications</span
              >
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
              <a href="#" class="dropdown-item dropdown-footer"
                >See All Notifications</a
              >
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
          <img
            src="${pageContext.request.contextPath}/resources/dashboard/dist/img/AdminLTELogo.png"
            alt="AdminLTE Logo"
            class="brand-image img-circle elevation-3"
            style="opacity: 0.8"
          />
          <span class="brand-text font-weight-light">TLTC</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
          <!-- Sidebar user panel (optional) -->
          <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
              <img
                src="${pageContext.request.contextPath}/resources/dashboard/dist/img/avatar2.png"
                class="img-circle elevation-2"
                alt="User Image"
              />
            </div>
            <div class="info">
              <a href="#" class="d-block">Anh Châu (Host)</a>
            </div>
          </div>

          <!-- SidebarSearch Form -->
          <div class="form-inline">
            <div class="input-group" data-widget="sidebar-search">
              <input
                class="form-control form-control-sidebar"
                type="search"
                placeholder="Search"
                aria-label="Search"
              />
              <div class="input-group-append">
                <button class="btn btn-sidebar">
                  <i class="fas fa-search fa-fw"></i>
                </button>
              </div>
            </div>
          </div>

          <!-- Sidebar Menu -->
          <nav class="mt-2">
            <ul
              class="nav nav-pills nav-sidebar flex-column"
              data-widget="treeview"
              role="menu"
              data-accordion="false"
            >
              <li class="nav-item menu-open">
                <a href="#" class="nav-link active">
                  <i class="fas fa-user-cog mx-1"></i>
                  <p>
                    Quản lý người dùng
                    <i class="right fas fa-angle-left"></i>
                  </p>
                </a>
                <ul class="nav nav-treeview">
                  <li class="nav-item">
                    <a href="${pageContext.request.contextPath}/superadmin/dashboard/staff/add" class="nav-link">
                      <i class="far fa-circle nav-icon"></i>
                      <p>Thêm Staff</p>
                    </a>
                  </li>
                  <li class="nav-item">
                    <a href="${pageContext.request.contextPath}/superadmin/dashboard/staff/info" class="nav-link active">
                      <i class="far fa-circle nav-icon"></i>
                      <p>Xem danh sách Staff</p>
                    </a>
                  </li>
                </ul>
              </li>
              <li class="nav-item">
                <a href="#" class="nav-link">
                  <i class="fas fa-hotel mx-1"></i>
                  <p>
                    Quản lý khách sạn
                    <i class="fas fa-angle-left right"></i>
                  </p>
                </a>
                <ul class="nav nav-treeview">
                  <li class="nav-item">
                    <a href="${pageContext.request.contextPath}/superadmin/dashboard/category" class="nav-link">
                      <i class="far fa-circle nav-icon"></i>
                      <p>Danh mục</p>
                    </a>
                  </li>
                  <li class="nav-item">
                    <a href="${pageContext.request.contextPath}/superadmin/dashboard/city" class="nav-link">
                      <i class="far fa-circle nav-icon"></i>
                      <p>Thành phố</p>
                    </a>
                  </li>
                  <li class="nav-item">
                    <a href="pages/layout/boxed.html" class="nav-link">
                      <i class="far fa-circle nav-icon"></i>
                      <p>Thêm đánh giá</p>
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
                <h1 class="m-0">Thông tin Staff</h1>
              </div>
              <!-- /.col -->
              <div class="col-sm-6">
                <ol class="breadcrumb float-sm-right">
                  <li class="breadcrumb-item">
                    <a href="#">Quản lý người dùng</a>
                  </li>
                  <li class="breadcrumb-item active">Xem danh sách Staff</li>
                </ol>
              </div>
              <!-- /.col -->
            </div>
            <!-- /.row -->
          </div>
          <!-- /.container-fluid -->
        </div>
        <!-- /.content-header -->

        <!-- Main content -->
        <section class="content">
          <div class="container-fluid">
            <div class="row">
              <div class="col-12">
                <div class="card">
                  <div class="card-header">
                    <h3 class="card-title">Danh sách Staff</h3>
                  </div>
                  <!-- /.card-header -->
                  <div class="card-body">
                    <table
                      id="staffTable"
                      class="table table-bordered table-striped"
                    >
                      <thead>
                        <tr>
                          <th>#</th>
                          <th>Tên Staff</th>
                          <th>Số điện thoại</th>
                          <th>Email</th>
                          <th>CCCD</th>
                          <th>Ngày sinh</th>
                          <th>Địa chỉ</th>
                          <th>Quyền</th>
                        </tr>
                      </thead>
                      <tbody>
                      <c:forEach var="staff" items="${staffs }">
                        <tr>
                          <td></td>
                          <td><a href="" role="button" data-toggle="modal" data-target="#modal-staff">${staff.name}</a></td>
                          <td>${staff.phone}</td>
                          <td>${staff.email}</td>
                          <td>${staff.civilIdentity}</td>
                          <td>${staff.dob.toString("dd/MM/yyyy")}</td>
                          <td>${staff.address}</td>
                          <td>${staff.role_name}</td>
                          <input type="hidden" name="id" value="${staff.id}">
                        </tr>
                      </c:forEach>
                      </tbody>
                    </table>
                  </div>
                  <!-- /.card-body -->
                </div>
              </div>
            </div>
          </div>
          <!-- /.container-fluid -->
        </section>
        <!-- /.content -->
      </div>
      <!-- /.content-wrapper -->
      <footer class="main-footer">
        <strong>Copyright &copy; 2022 TLTC Company</strong>
      </footer>

      <div class="modal fade" id="modal-staff">
        <div class="modal-dialog h-100 my-0 py-3">
          <form action="" id="editForm" class="modal-content">
            <div class="modal-header">
              <h4 class="modal-title">Thông tin Staff</h4>
              <button
                type="button"
                class="close"
                data-dismiss="modal"
                aria-label="Close"
              >
                <span aria-hidden="true">&times;</span>
              </button>
            </div>            
            <div class="modal-body">
              <div class="form-group">
                <label>Tên Staff</label>
                <input type="text" placeholder="Nhập tên Staff" autocomplete="off" class="form-control" name="staffName">
              </div>
              <div class="form-group">
                <label>Ngày sinh</label>
                  <div class="input-group w-50 date" id="dob" data-target-input="nearest">
                      <input type="text" name="dob" class="form-control datetimepicker-input"
                      data-target="#dob" autocomplete="off" data-toggle="datetimepicker"/>
                      <div class="input-group-append" data-target="#dob">
                          <div class="input-group-text"><i class="fa fa-calendar"></i></div>
                      </div>
                  </div>
              </div> 
              <div class="form-group">
                <label>Số điện thoại</label>
                <div class="input-group">
                  <div class="input-group-prepend">
                    <span class="input-group-text"><i class="fas fa-phone"></i></span>
                  </div>
                  <input type="text" class="form-control" name="phone" data-inputmask='"mask": "(+84) 9999-9999"' data-mask>
                </div>
                <!-- /.input group -->
              </div>
              <div class="form-group">
                <label for="">Email</label>
                <div class="input-group">
                    <input type="email" name="email" class="form-control" placeholder="abc@gmail.com">
                    <div class="input-group-append">
                      <span class="input-group-text"><i class="fas fa-envelope"></i></span>
                    </div>
                  </div>
              </div>
              <div class="form-group">
                <label>Địa chỉ</label>
                <input type="text" placeholder="HCMC..." class="form-control" name="address" id="">
              </div>
              <div class="form-group">
                <label>Căn cước công dân</label>
                <input type="text" placeholder="Nhập CCCD-CMND" class="form-control" name="civil_identity" id="">
              </div>     
              <input type="hidden" name="id">
            </div>
            <div class="modal-footer justify-content-between">
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
      <!-- /.modal -->

      <!-- /.control-sidebar -->
    </div>
    <!-- ./wrapper -->

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
    <!-- daterangepicker -->
    <script src="${pageContext.request.contextPath}/resources/dashboard/plugins/moment/moment.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/dashboard/plugins/daterangepicker/daterangepicker.js"></script>
    <script src="${pageContext.request.contextPath}/resources/dashboard/plugins/bs-custom-file-input/bs-custom-file-input.min.js"></script>
    <!-- AdminLTE App -->
    <script src="${pageContext.request.contextPath}/resources/dashboard/plugins/jquery-ui/jquery-ui.min.js"></script>
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <script>
      $.widget.bridge("uibutton", $.ui.button);
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
    <script src="${pageContext.request.contextPath}/resources/dashboard/plugins/adminJs/staff-info.js"></script>
  </body>
</html>
