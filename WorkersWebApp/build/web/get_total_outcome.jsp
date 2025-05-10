<%-- 
    Document   : get_total_outcome
    Created on : May 9, 2025, 9:12:31 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Total Workers</h1>
        <%
            Long count = (Long)request.getAttribute("count");
        %>
        <p>
            The total number of Workers is: <b><%=count%></b>
        </p>
    </body>
</html>
