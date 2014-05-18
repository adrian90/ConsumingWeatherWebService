
<%@page import="Model.City"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Weather Service</title>
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    </head>
    <body class="jumbotron">
        <form action="FrontController" method="post">
            <input type="hidden" name="command" value="Main">
            <button type="submit" class="btn btn-default">
                <span class="glyphicon glyphicon-arrow-left"></span>
            </button>
        </form>
        <br>
        <div class="col-md-4 col-md-offset-4">
            <table class="table table-bordered">
                <%
                    City city = (City) request.getAttribute("city");
                %>
                <tr>
                    <td></td>
                    <th class="success"><%=city.getName() + "-" + city.getCountry()%></th>
                </tr>
                <tr>
                    <td class="success">Temperature:</td>
                    <td class="active"><%=city.getTemperature()%></td>
                </tr>
                <tr>
                    <td class="success">Visibility:</td>
                    <td class="active"><%=city.getVisibility()%></td>
                </tr>
                <tr>
                    <td class="success">Humidity:</td>
                    <td class="active"><%=city.getHumidity()%></td>
                </tr>
            </table>
        </div>
    </body>
</html>
