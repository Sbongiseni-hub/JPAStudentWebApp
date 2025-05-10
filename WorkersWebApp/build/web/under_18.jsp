<%-- 
    Document   : under18
    Created on : May 9, 2025, 9:44:29 AM
    Author     : DELL
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entity.Worker"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            List<Worker> worker = (List<Worker>)request.getAttribute("count");
//            Integer cnt = worker.size();
        %>
        
        <table>
            <tr>
                <%
                    for(int i =0; i < worker.size(); i++){
                        Worker work = worker.get(i);
                        String name = work.getName();
                          Long id = work.getId();
                    
                %>
            </tr>
            <tr>
                <td>name</td>
                <td><%=id %></td>
            </tr>
            <tr>
               <%
                   }
               %>
            </tr>
        </table>
  

    </body>
</html>
