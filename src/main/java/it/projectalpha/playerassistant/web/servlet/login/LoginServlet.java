package it.projectalpha.playerassistant.web.servlet.login;


import it.projectalpha.playerassistant.model.Utente;
import it.projectalpha.playerassistant.service.utente.UtenteService;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Autowired
    private UtenteService utenteService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    public LoginServlet() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        rd.forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String usernameInput = request.getParameter("inputUsername");
        String passwordInput = request.getParameter("inputPassword");

        if(StringUtils.isBlank(usernameInput) || StringUtils.isBlank(passwordInput)) {
            request.setAttribute("messaggioErrore", "Uno o più campi non sono validi.");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
            return;
        }

        String encodedPassword = new String(Base64.encodeBase64(passwordInput.getBytes()));

        Utente utenteCheAccede = utenteService.eseguiAccesso(usernameInput, encodedPassword);

        //se non trovo nulla non deve essere possibile accedere
        if(utenteCheAccede == null) {
            request.setAttribute("messaggioErrore", "Non è stato trovato nessun utente con le credenziali fornite!");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
            return;
        }

        //metto utente in sessione
        HttpSession session =  request.getSession();
        session.setAttribute("userInfo", utenteCheAccede);

        RequestDispatcher rd = request.getRequestDispatcher("listaPersonaggi/personaggi.jsp");
        request.setAttribute("activeLink", "personaggi");
        rd.forward(request, response);
    }


}
