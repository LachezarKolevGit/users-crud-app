<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:twoColumnLayout>
    <jsp:body>
      <h1>Enter the id of the user you want to delete</h1>
<form action="${pageContext.request.contextPath}/resolve" method="post">
    <input type="hidden" name="method" value="DELETE">
    <label>Id of user</label>
    <input type="number" name="id">
    <input type="submit" value="Submit">
</form>
    </jsp:body> 
</t:twoColumnLayout>





