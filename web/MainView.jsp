
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Weather Service</title>
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h1 align="center">Weather Service</h1>
            <br><br><br>
            <form action="FrontController" method="post">
                <input type="hidden" name="command" value="ListCities">
                <div class="col-md-4 col-md-offset-4">
                    <label for="Country">Country</label>
                    <input type="text" class="form-control" placeholder="Introduce a country">
                    <button class="btn btn-default" type="submit">Send</button>
                </div>
            </form>
            <br><br><br><br><br><br><br><br>
            <form action="FrontController" method="post">
                <input type="hidden" name="command" value="ListWeatherCity">
                <div class="col-md-4 col-md-offset-4">
                    <label for="Country">Country</label>
                    <input type="country" class="form-control" id="Country"
                           placeholder="Introduce a country">
                </div>
                <br><br><br>
                <div class="col-md-4 col-md-offset-4">
                    <label for="City">City</label>
                    <input type="city" class="form-control" id="Country" 
                           placeholder="Introduce a city">
                    <button type="submit" class="btn btn-default">Send</button>
                </div>
            </form>
        </div>
    </body>
</html>
