<%@ page contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Player Assistant - Registrazione</title>
    <link rel="icon" href="res/favicon.ico" type="image/x-icon" />


    <link href="<%= request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%= request.getContextPath() %>/css/signin.css" rel="stylesheet">
    <link href="<%= request.getContextPath() %>/css/input-color.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div ${pageContext.request.getAttribute("messaggioErrore") == null ? "hidden = \"true\"" : ""} class="alert alert-danger" role="alert" id="alertErrore">
        <strong>Attenzione!</strong> ${pageContext.request.getAttribute("messaggioErrore")}
    </div>

    <form class="form-horizontal" action='NuovoUtenteServlet' method="POST">
        <fieldset>
            <!--LEGEND-->
            <div id="legend">
                <legend class="">Registrazione</legend>
            </div>
            <!--NOME-->
            <div class="form-group">
                <label class="control-label col-sm-2" for="nome">Nome:</label>
                <div class="col-sm-4">
                    <input class="form-control dark-control" type="text" id="nome" name="nome" required>
                </div>
            </div>
            <div hidden="true" class="alert alert-danger" role="alert" id="alertNome">
                <strong>Attenzione!</strong> Il nome che hai inserito non risulta valida
            </div>

            <!--COGNOME-->
            <div class="form-group">
                <label class="control-label col-sm-2" for="cognome">Cognome:</label>
                <div class="col-sm-4">
                    <input class="form-control dark-control" type="text" id="cognome" name="cognome" required>
                </div>
            </div>
            <div hidden="true" class="alert alert-danger" role="alert" id="alertCognome">
                <strong>Attenzione!</strong> Il cognome che hai inserito non risulta valida
            </div>

            <!--EMAIL-->
            <div class="form-group">
                <label class="control-label col-sm-2" for="email">Email:</label>
                <div class="col-sm-4">
                    <input class="form-control dark-control" type="text" id="email" name="email" required>
                    <p class="help-block">Inserisci una email valida. Servir� per accedere</p>
                </div>
            </div>

            <div hidden="true" class="alert alert-danger" role="alert" id="alertEmail">
                <strong>Attenzione!</strong> La mail che hai inserito non risulta valida
            </div>


            <!--PASSWORD-->
            <div class="form-group">
                <label class="control-label col-sm-2" for="password">Password:</label>
                <div class="col-sm-4">
                    <input class="form-control dark-control" type="password" id="password" name="password" required>
                    <p class="help-block">La password deve essere almeno di 4 caratteri</p>
                </div>
            </div>
            <div id="alertPassword" hidden="true" class="alert alert-danger" role="alert">
                <strong>Attenzione!</strong> La password che hai inserito non risulta valida
            </div>


            <!--PASSWORD REP-->
            <div class="form-group">
                <label class="control-label col-sm-2" for="password_confirm">Password (conferma):</label>
                <div class="col-sm-4">
                    <input class="form-control dark-control" type="password" id="password_confirm" name="password_confirm" required>
                    <p class="help-block">Per favore, conferma la password</p>
                </div>
            </div>
            <div id="alertPasswordRip" hidden="true" class="alert alert-danger" role="alert">
                <strong>Attenzione!</strong> La password che hai inserito non coincide con la password precedente
            </div>

            <div class="control-group">
                <!-- Button -->
                <div class="controls">
                    <button class="btn orange-control" id="registratiButton">Registrati</button>
                </div>
            </div>
        </fieldset>
    </form>
</div>

</body>
</html>


<script src="<%= request.getContextPath() %>/js/jquery-3.4.1.min.js" type="text/javascript"></script>
<script src="<%= request.getContextPath() %>/js/userUtility.js" type="text/javascript"></script>
<script src="<%= request.getContextPath() %>/js/nuovoUtente/nuovoUtente.js" type="text/javascript"></script>