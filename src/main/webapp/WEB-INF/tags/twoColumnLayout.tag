<%@tag description="User Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %> <!-- Added for taking input  -->
<%@attribute name="footer" fragment="true" %>
<%@attribute name="sidepanel" fragment="true" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<html>
<head>
<title></title>
</head>
  <body>
    <div id="pageheader">
 		<t:header></t:header>
    </div>
    <br>
    <div id="body">
      	<jsp:doBody/>
    </div>
    <div id="sidepanel">
      	<t:sidepanel></t:sidepanel>
    </div>
    <br>
    <div id="pagefooter">
   		<t:footer></t:footer>
    </div>
  </body>
</html>