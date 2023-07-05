<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:twoColumnLayout>
    <jsp:body>
    <h1>List of users:</h1>
		<c:forEach items="${requestScope.users}" var="usersMap">
    	<p> Id: ${usersMap.key} </p>
    	<p> Name: ${usersMap.value} </p>
		</c:forEach>
    </jsp:body> 
</t:twoColumnLayout>

