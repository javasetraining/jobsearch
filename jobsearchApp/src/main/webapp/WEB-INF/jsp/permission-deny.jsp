<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="req" value="${pageContext.request}" />
<c:set var="baseURL" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath}" />

<t:general_form title="permission deny">
    <jsp:attribute name="content">


        <div class="panel panel-default">
            <div class="panel-heading">
                Permission deny
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">

                <p>
                 You don't have permission to access, try <a href="${baseURL}">login</a>
                </p>
                
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </jsp:attribute>
</t:general_form>

