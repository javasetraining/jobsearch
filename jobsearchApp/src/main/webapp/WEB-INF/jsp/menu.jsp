<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

    <div class="large-4 columns" >

                <ul class="nav in" id="side-menu">
                    <li>
                        <a href="<c:url value="/userhome"/>">User profile</a>
                    </li>
                    <li>
                        <a href="<c:url value="/parsersetting"/>">Parser setting</a>
                    </li>
                    <li>
                         <a href="<c:url value="/logout"/>">Log out</a>
                    </li>
                </ul>
    </div>