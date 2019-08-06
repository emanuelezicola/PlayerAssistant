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
    <link href="<%= request.getContextPath() %>/css/orange-control.css" rel="stylesheet">
    <link href="<%= request.getContextPath() %>/css/img-link.css" rel="stylesheet">
    <link href="<%= request.getContextPath() %>/css/all.css" rel="stylesheet">

</head>
<body>
    <%@ include file="../static-element/navbar.jsp" %>

    <!-- -PAGE CONTENT- -->
    <div class="container">
        <div class="col-md-12">
            <h4 class="display-4">I tuoi personaggi:</h4>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th style="text-align:center">Classe</th>
                    <th style="text-align:center">Nome</th>
                    <th style="text-align:center">Vita</th>
                    <th style="text-align:center">Azioni</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listaPersonaggi }" var="personaggioItem">
                    <tr>
                        <td style="text-align:center">
                            <img src="<%= request.getContextPath()%>/res/${personaggioItem.classe}.jpg" width="40" height="40" class="d-inline-block align-top" alt="img_def"></td>
                        <td style="text-align:center">${personaggioItem.nome }</td>
                        <td style="text-align:center">${personaggioItem.vita }</td>
                        <!--PrepareModificaMunicipioServlet?idMunicipio=${municipioItem.id }-->
                        <td class="img-link" style="text-align:center">
                            <a href="#" title="Visualizza Personaggio">
                                <i class="far fa-eye"></i>
                            </a>
                            <a class="img-link" href="#" title="Modifica Personaggio">
                                <i class="fas fa-edit"></i>
                            </a>
                            <a class="img-link" href="#" title="Elimina Personaggio">
                                <i class="far fa-trash-alt"></i>
                            </a>
                    </tr>
                </c:forEach>


                </tbody>

            </table>
        </div>

        <div class="col-sm-6">
            <p><a class="btn orange-control btn-lg" href="${pageContext.request.contextPath}/PrepareNuovoPersonaggioServlet" role="button">Aggiungi un personaggio</a></p>
            <!--<button class="btn btn-lg orange-control btn-block" style="border-radius: 12px" id="nuovoPersonaggioButton">Aggiungi un personaggio</button>-->
        </div>

    </div>

    <%@ include file="../static-element/bottomNavBar.jsp"%>
</body>
</html>


<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
