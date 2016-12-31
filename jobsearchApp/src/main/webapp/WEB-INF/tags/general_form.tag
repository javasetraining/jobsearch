<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@attribute name="title"%>
<%@attribute name="content" fragment="true"%>

<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="http://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.min.css">
        <link href='http://cdnjs.cloudflare.com/ajax/libs/foundicons/3.0.0/foundation-icons.css' rel='stylesheet'
              type='text/css'>
        <title>Title</title>
    </head>
    <body>
        <header style="background-color: #eee;
                padding-bottom: 5px;">
            <div class="row">
                <div class="large-4 columns">

                    <h3 style="color:#0e476b; font-weight: bold;"><a href="<c:url value="/"/>">Java Job Search</a></h3>
                </div>
                <div class="large-4 columns">
                    <ul class="menu">
                        <li><input type="search" placeholder="Search"></li>
                        <li>
                            <button type="button" class="button">Search</button>
                        </li>
                    </ul>
                </div>
                <div class="large-4 columns">
                    <a href="<c:url value="/login"/>">Login</a>
                </div>

            </div>
        </header>
        <article style="margin-top: 15px;
                 margin-bottom: 15px;">
            <jsp:invoke fragment="content" />

        </article>
    </body>
</html>