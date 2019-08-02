package it.projectalpha.playerassistant.web.servlet.nuovaregistrazione;


import it.projectalpha.playerassistant.model.Utente;
import it.projectalpha.playerassistant.service.utente.UtenteService;
import it.projectalpha.playerassistant.utils.StringUtility;
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
import java.io.IOException;
import java.util.Date;
import java.util.regex.Matcher;

@WebServlet("/NuovoUtenteServlet")
public class NuovoUtenteServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }

    @Autowired
    private UtenteService utenteService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomeUtente = request.getParameter("nome");
        String cognomeUtente = request.getParameter("cognome");
        String email = request.getParameter("email");
        String psw = request.getParameter("password");
        String pswRip = request.getParameter("password_confirm");


        if(condizioniRegistrazione(nomeUtente, cognomeUtente, email, psw, pswRip) ) {

            request.setAttribute("messaggioErrore", "Uno o più campi non sono stati inseriti correttamente");
            RequestDispatcher rd = request.getRequestDispatcher("nuovoUtente.jsp");
            rd.forward(request, response);
            return;
        }

        String encodedPsw = new String(Base64.encodeBase64(psw.getBytes()));

        nomeUtente = nomeUtente.substring(0, 1).toUpperCase() + nomeUtente.substring(1);
        cognomeUtente = cognomeUtente.substring(0, 1).toUpperCase() + cognomeUtente.substring(1);

        Utente utente = new Utente(nomeUtente, cognomeUtente, email, encodedPsw, new Date());
        utenteService.inserisciNuovo(utente);

        response.sendRedirect(request.getContextPath() + "/LoginServlet");
    }


    private boolean condizioniRegistrazione(String nomeUtente, String cognomeUtente, String email, String psw, String pswRip) {

        StringUtility su = new StringUtility();
        Matcher matcher = su.getEmailPattern().matcher(email);

        return StringUtils.isBlank(nomeUtente)|| StringUtils.isBlank(cognomeUtente)|| StringUtils.isBlank(email)
                || StringUtils.isBlank(psw) || StringUtils.isBlank(pswRip) || psw.length() < 4
                || !psw.equals(pswRip) ||  !matcher.find();
    }

}
