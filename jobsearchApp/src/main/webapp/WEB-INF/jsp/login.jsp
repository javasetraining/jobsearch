<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<c:url value="/j_spring_security_check" var="loginUrl"/>

<t:general_form title="login form">
    <jsp:attribute name="content">


        <div class="panel panel-default">
            <div class="panel-heading">
                Notifications Panel
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">

                <h1>USER</h1>
                    <table class="table table-striped table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>login</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="user"  items="${userList}" >
                                <tr>
                                    <td>${user.userId}</td>
                                    <td>${user.login}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                    <h1>parser</h1>
                    <table class="table table-striped table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>parserId</th>
                                <th>parserName</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="parser"  items="${parserList}" >
                                <tr>
                                    <td>${parser.parserId}</td>
                                    <td>${parser.parserName}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                <h1>vacancy</h1>
                    <table class="table table-striped table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>vacancyId</th>
                                <th>vacancyName</th>
                                <th>companyName</th>
                                <th>creationDate</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="vacancy"  items="${vacancyList}" >
                                <tr>
                                    <td>${vacancy.vacancyId}</td>
                                    <td>${vacancy.vacancyName}</td>
                                    <td>${vacancy.companyName}</td>
                                    <td>${vacancy.creationDate}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>



            </div>


            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </jsp:attribute>
</t:general_form>
