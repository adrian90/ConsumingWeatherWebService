
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

        <div class="container">
            <h1  class="cover-heading" align="center">Weather Service</h1>
            <br>
            <div class="col-md-4 col-md-offset-0">
                <div class="panel panel-primary">
                    <div class="panel-heading">Get a list of cities from a country</div>
                    <div class="panel-body">
                        <form action="FrontController" method="post">
                            <input type="hidden" name="command" value="ListCities">
                            <label for="Country">Country</label>
                            <input type="text" name="country" class="form-control" placeholder="Introduce a country">
                            <button class="btn btn-default" type="submit">Send</button>
                        </form>
                    </div>
                </div>
                <% if (request.getAttribute("checkCountry") != null) { %>
                <div class="alert alert-danger">You have to enter an existing country.</div>
                <%}%>
            </div>
            <div class="col-md-4 col-md-offset-3">
                <div class="panel panel-primary">
                    <div class="panel-heading">Get weather information from a city</div>
                    <div class="panel-body">
                        <form action="FrontController" method="post">
                            <input type="hidden" name="command" value="ListWeatherCity">
                            <label for="Country">Country</label>
                            <input type="country" name="country" class="form-control" id="Country"
                                   placeholder="Introduce a country">
                            <br>
                            <label for="City">City</label>
                            <input type="city" name="city" class="form-control" id="Country" 
                                   placeholder="Introduce a city">
                            <button type="submit" class="btn btn-default">Send</button>
                        </form>
                    </div>
                </div>
                <% if (request.getAttribute("checkCity") != null) { %>
                <div class="alert alert-danger">You have to introduce a correct country and one of its cities.</div>
                <%}%>
            </div>
        </div>
    </body>
</html>
