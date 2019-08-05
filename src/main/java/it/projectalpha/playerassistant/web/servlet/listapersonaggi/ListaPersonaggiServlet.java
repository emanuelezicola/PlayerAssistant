package it.projectalpha.playerassistant.web.servlet.listapersonaggi;

import it.projectalpha.playerassistant.model.Personaggio;
import it.projectalpha.playerassistant.model.Utente;
import it.projectalpha.playerassistant.service.personaggio.PersonaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ListaPersonaggiServlet")
public class ListaPersonaggiServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    @Autowired
    PersonaggioService personaggioService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    public ListaPersonaggiServlet() {super();}


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Personaggio> personaggiUtente = personaggioService.caricaPersonaggi((Utente) request.getSession().getAttribute("userInfo"));

        ((Utente) request.getSession().getAttribute("userInfo")).setPersonaggi(personaggiUtente);

        RequestDispatcher rd = request.getRequestDispatcher("listaPersonaggi/personaggi.jsp");
        request.setAttribute("activeLink", "personaggi");
        request.setAttribute("listaPersonaggi", personaggiUtente);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {}
}
