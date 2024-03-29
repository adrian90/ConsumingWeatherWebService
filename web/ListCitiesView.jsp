
<%@page import="Model.City"%>
<%@page import="Model.Country"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Weather Service</title>
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    </head>
    <body class="jumbotron">
        <%  Country country = (Country) request.getAttribute("country"); %>
        <form action="FrontController" method="post">
            <input type="hidden" name="command" value="Main">
            <button type="submit" class="btn btn-default">
                <span class="glyphicon glyphicon-arrow-left"></span>
            </button>
        </form>
        <br>
        <div class="col-md-4 col-md-offset-0">
            <table class="table table-bordered">
                <tr>
                    <th colspan=10 class="success"><center>Cities from <%=country.getName() %></center></th>
                </tr>
                <tr>
                    <%
                        int counter = 0;
                        for (City city : country.getCities()) {
                            counter++;%>
                    <td class="active"><%=city.getName()%></td>
                    <%
                        if (counter == 10) {
                            counter = 0;%>
                </tr>
                <tr>
                    <%}%>
                    <%}%>
            </table>
        </div>
    </body>
</html>
