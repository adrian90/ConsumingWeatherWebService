
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
        <%
            Country country = (Country) request.getAttribute("country");
            for (City city : country.getCities()) {
            out.print(city.getName());
            }
        %>
        
        <div class="col-md-4 col-md-offset-4">
            <div class="table-responsive">
                <table class="table">
                    <tr>Hola
                        <td>Hola</td>
                    </tr>
                    <tr>Paco
                        <td>Paco</td>
                    </tr>
                    <tr>Pepe</tr>
                </table>
            </div>
        </div>
    </body>
</html>
