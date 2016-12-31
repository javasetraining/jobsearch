<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<c:url value="/j_spring_security_check" var="loginUrl"/>

<t:general_form title="home">
    <jsp:attribute name="content">

        <div class="row">
            <div class="large-4 columns" style="float: left;">
                <div class="panel-body">

                    <h3>Login page</h3>
                    <div>

                        <form:form action="${loginUrl}" method="POST">

                            <p><input type="text" name="j_username" placeholder="Login" maxlength="25"></p>

                            <p><input type="password" name="j_password" placeholder="Password" maxlength="25"></p>

                            <input type="submit" name="submit" class="login login-submit  btn btn-lg btn-success" value="Login">

                            <c:if test="${not empty param['error']}">
                                <h5>Login or Password is not valid. Please try again.</h5>
                            </c:if>

                        </form:form>

                    </div>
                </div>
            </div>
        </div> 

    </jsp:attribute>
</t:general_form>

