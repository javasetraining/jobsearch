<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!-- Navigation -->
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <h3>Java Job Search v 0.0.1 - ${title}</h3>
    </div>
    <!-- /.navbar-header -->


    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">

                <sec:authorize url="/userhome">
                    <li>
                        <a href="<c:url value="/userhome"/>">Home</a>
                    </li>
                </sec:authorize>

                <sec:authorize url="/listuser">

                    <li>
                        <a href="<c:url value="/listuser"/>">View Users</a>
                    </li>
                    <li>
                        <a href="<c:url value="/listmanager"/>">Manage managers</a>
                    </li>
                    <li>
                        <a href="<c:url value="/listmaster"/>">Manage masters</a>
                    </li>
                    <li>
                        <a href="<c:url value="/listclient"/>">Manage clients</a>
                    </li>

                </sec:authorize>   

                <li>
                    <a href="<c:url value="/logout"/>">Log out</a>
                </li>

            </ul>
        </div>
        <!-- /.sidebar-collapse -->
    </div>
    <!-- /.navbar-static-side -->
</nav>