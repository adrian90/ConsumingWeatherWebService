
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
    </body>
</html>
