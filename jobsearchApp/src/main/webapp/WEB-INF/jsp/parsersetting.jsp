<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<t:general_form title="home">
    <jsp:attribute name="content">
            
        <div class="row">
            <jsp:include page="/WEB-INF/jsp/menu.jsp" flush="true" />
            <div class="large-8 columns">

             

                <div class="panel-body">

                    <p>Setting for parser</p>

                </div>
            </div>
        </div>

    </jsp:attribute>
</t:general_form>

