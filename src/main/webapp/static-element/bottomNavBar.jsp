<nav class="navbar-bottom fixed-bottom navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <div class="row">
            <div class="col-sm-4">
                <a href="<%=request.getContextPath()%>/ListaPersonaggiServlet" class="${pageContext.request.getAttribute("activeLink") == "personaggi" ? "active" : ""}">Personaggi</a>
            </div>
            <div class="col-sm-4">
                <a href="<%=request.getContextPath()%>/ToolsServlet" class="${pageContext.request.getAttribute("activeLink") == "tools" ? "active" : ""}">Tools</a>
            </div>
            <div class="col-sm-4">
                <a href="<%=request.getContextPath()%>/FightTrackerServlet" class="${pageContext.request.getAttribute("activeLink") == "fightTracker" ? "active" : ""}">Fight Tracker</a>
            </div>
        </div>
    </div>
</nav>