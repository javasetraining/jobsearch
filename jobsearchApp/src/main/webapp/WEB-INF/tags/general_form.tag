<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@attribute name="title"%>
<%@attribute name="content" fragment="true"%>


<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Java Job Search v 0.0.1 - ${title}</title>

        <!-- Bootstrap Core CSS -->
        <link href="<c:url  value="/bower_components/bootstrap/dist/css/bootstrap.min.css" />" rel="stylesheet">

        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">

        <!-- Custom CSS -->
        <link href="<c:url  value="/dist/css/sb-admin-2.css" />" rel="stylesheet">
        <link href="<c:url  value="/dist/css/app.css" />" rel="stylesheet">

        <!-- DataTables CSS -->
        <link href="<c:url  value="/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" />" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="<c:url  value="/bower_components/font-awesome/css/font-awesome.min.css" />" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>

        <div id="wrapper">






                    <!-- Navigation -->
                    <jsp:include page="/WEB-INF/jsp/menu.jsp" flush="true" />

                    <div id="page-wrapper">
                        <div class="row">
                            <div class="col-lg-12">
                                <c:if test="${successNotification != null}">
                                    <div class="alert alert-success alert-dismissable">
                                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                                        <p><b>${successNotification.title}</b></p>
                                        <p>${successNotification.description}</p>
                                    </div>
                                </c:if>

                                <c:if test="${errorNotification != null}">
                                    <div class="alert alert-danger alert-dismissable">
                                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                                        <p><b>${errorNotification.title}</b></p>
                                        <p>${errorNotification.description}</p>
                                    </div>
                                </c:if>
                                <jsp:invoke fragment="content" />
                            </div>
                        </div>
                    </div>
                    <!-- /#page-wrapper -->



        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="<c:url  value="/bower_components/jquery/dist/jquery.min.js" />"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="<c:url  value="/bower_components/bootstrap/dist/js/bootstrap.min.js" />"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="<c:url  value="/bower_components/metisMenu/dist/metisMenu.min.js" />"></script>


        <!-- Custom Theme JavaScript -->
        <script src="<c:url  value="/dist/js/sb-admin-2.js" />"></script>

        <!-- DataTables JavaScript -->
        <script src="<c:url  value="/bower_components/datatables/media/js/jquery.dataTables.min.js" />"></script>
        <script src="<c:url  value="/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js" />"></script>

        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    </body>


</html>