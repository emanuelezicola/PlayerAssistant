<%@ page contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Player Assistant - Personaggi</title>
    <link rel="icon" href="<%= request.getContextPath()%>/res/favicon.ico" type="image/x-icon" />

    <!-- Bootstrap -->
    <link href="<%= request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="<%= request.getContextPath()%>/css/signin.css" rel="stylesheet">
    <link href="<%= request.getContextPath()%>/css/bottom-navbar.css" rel="stylesheet">
    <link href="<%= request.getContextPath() %>/css/input-color.css" rel="stylesheet">

</head>
<body>
    <%@ include file="../static-element/navbar.jsp" %>

    <!-- -PAGE CONTENT- -->
    <div class="container">
        <div class="col-md-12">
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>Classe</th>
                    <th>Nome</th>
                    <th>Vita</th>
                    <th>Azioni</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listaPersonaggi }" var="personaggioItem">
                    <tr>
                        <td>${personaggioItem.classe }</td>
                        <td>${personaggioItem.nome }</td>
                        <td>${personaggioItem.vita }</td>
                        <!--PrepareModificaMunicipioServlet?idMunicipio=${municipioItem.id }-->
                        <td><a
                                href="#"
                                class="btn btn-info">Dettaglio</a> <a
                                href="#"
                                class="btn btn-info">Modifica</a></td>
                    </tr>
                </c:forEach>


                </tbody>

            </table>
        </div>

        <div class="col-sm-6" align="right">
            <button class="btn btn-lg orange-control btn-block" style="border-radius: 12px" id="nuovoPersonaggioButton">Aggiungi un personaggio</button>
        </div>

    </div>

    <%@ include file="../static-element/bottomNavBar.jsp"%>
</body>
</html>


<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
