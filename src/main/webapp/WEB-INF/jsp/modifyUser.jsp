<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:twoColumnLayout>
    <jsp:body>
    	<h1>Enter id of user you want to modify</h1>
		<form action="${pageContext.request.contextPath}/resolve" method="post">
    		<input type="hidden" name="method" value="PUT">
    		<label>Id of user</label>
    		<input type="number" name="id">
    		<label>New name</label>
    		<input type="text" name="name">
    		<input type="submit" value="Submit">
		</form>
    </jsp:body> 
</t:twoColumnLayout>
