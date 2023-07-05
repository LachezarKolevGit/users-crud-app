<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:twoColumnLayout>
    <jsp:body>
    	<h1>Post user</h1>
		<form action="${pageContext.request.contextPath}/user" method="POST">
    		<label>Name</label>
    		<input type="text" name="name" placeholder="name">
    		<button type="submit" value="Submit"></button>
		</form>	
    </jsp:body> 
</t:twoColumnLayout>