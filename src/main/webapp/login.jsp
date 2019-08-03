<%@ page contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Player Assistant - Accesso</title>
    <link rel="icon" href="<%= request.getContextPath() %>/res/favicon.ico" type="image/x-icon" />

    <!-- Bootstrap -->
    <link href="<%= request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="<%= request.getContextPath() %>/css/signin.css" rel="stylesheet">
    <link href="<%= request.getContextPath() %>/css/input-color.css" rel="stylesheet">

</head>
<body>
<form class="form-signin text-center" action="LoginServlet" method="post" id="loginForm">
    <!--       <img class="mb-4" src="../../assets/brand/bootstrap-solid.svg" alt="" width="72" height="72"> -->
    <h1 class="h3 mb-3 font-weight-normal">Inserisci le Credenziali per accedere</h1>

    <label for="inputUsername" class="sr-only">Username</label>
    <input type="text" name="inputUsername" id="inputUsername" class="form-control dark-control" placeholder="Email" required autofocus>
    <div hidden class="alert alert-danger" role="alert" id="alertEmail">
        <strong>Attenzione!</strong> La mail che hai inserito non risulta valida
    </div>
    <br>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" name="inputPassword" id="inputPassword" class="form-control dark-control" placeholder="Password" required>



    <button class="btn btn-lg orange-control btn-block" type="submit">Entra</button>
    <div>
        <br>
        <a class="dark-control" href="nuovoUtente.jsp">Se non sei registrato, clicca qui.</a>
    </div>
</form>
</body>
</html>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<%= request.getContextPath() %>/js/jquery-3.4.1.min.js" type="javascript"></script>
<script src="<%= request.getContextPath() %>/js/bootstrap.min.js" type="javascript"></script>
<script src="<%= request.getContextPath() %>/js/bootstrap.bundle.js" type="javascript"></script>
<!--<script src="<%= request.getContextPath() %>/js/login/login.js" type="text/javascript"></script>-->
