<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="<%= request.getContextPath()%>/ListaPersonaggiServlet">
        <img src="<%= request.getContextPath()%>/res/icon.png" width="40" height="40" class="d-inline-block align-top" alt="img_def">
        Player Assistant
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="<%= request.getContextPath()%>/ListaPersonaggiServlet">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Social
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="https://www.facebook.com/PlayerAssistant95/">
                        <img src="<%= request.getContextPath()%>/res/fb_icon.png" width="20" height="20" class="d-inline-block align-top" alt="img_fb">
                        Facebook</a>
                </div>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/LogoutServlet">Log out <span class="sr-only">(current)</span></a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Cerca" aria-label="Cerca">
            <button class="btn btn-outline-warning orange-control my-2 my-sm-0" type="submit">Cerca</button>
        </form>
    </div>
</nav>