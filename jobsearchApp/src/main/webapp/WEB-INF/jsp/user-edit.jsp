<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<t:general_form title="User edit">
    <jsp:attribute name="content">

        <div class="panel panel-default">
            <div class="panel-heading">
                <c:out value="${title}" />
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">

                <form:form  method="POST" commandName="user" action="">
                    <div class="dataTable_wrapper">
                         <table class="table table-striped table-bordered table-hover" >
                            <thead>
                                <tr>
                                    <th>Id</th>
                                    <th>login</th>
                                    <th>password</th>
                                    <th>first name</th>
                                    <th>last name</th>
                                    <th>date of birth</th>
                                </tr>

                            </thead>
                            <tbody>
                                <tr>
                                    <td><form:hidden path="userId" />${user.userId}</td>
                                    <td><form:input path="login" /></td>
                                    <td><form:input path="password" /></td>
                                    <td><form:input path="firstName" /></td>
                                    <td><form:input path="lastName" /></td>
                                    <td><form:input path="dateOfBirth" /></td>

                                </tr>
                            </tbody>
                        </table>
                    </div>
                    <button type="submit" class="btn btn-default">Save </button>

                </form:form> 

            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </jsp:attribute>
</t:general_form>

