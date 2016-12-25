<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<t:general_form title="home">
    <jsp:attribute name="content">


        <div class="panel panel-default">
            <div class="panel-heading">
                <c:out value="${title}" />
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">

                <p>Welcome, <c:out value="${username}"/>!</p>

            </div>
            <!-- /.panel-body -->
        </div>

        <!-- /.panel -->
    </jsp:attribute>
</t:general_form>

