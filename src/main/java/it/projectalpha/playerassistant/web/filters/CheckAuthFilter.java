package it.projectalpha.playerassistant.web.filters;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/*"}, initParams = {
        @WebInitParam(name = "excludedUrls", value = "/login.jsp,/LoginServlet,/LogoutServlet,/css/,/js/,/nuovoUtente.jsp,/NuovoUtenteServlet")})
public class CheckAuthFilter implements Filter {

    private List<String> excludedUrls;

    public CheckAuthFilter() {
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        String excludePattern = filterConfig.getInitParameter("excludedUrls");
        excludedUrls = java.util.Arrays.asList(excludePattern.split(","));
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String path = httpRequest.getServletPath();

        boolean isInWhiteList = false;
        for (String urlPatternItem : excludedUrls) {
            if (path.contains(urlPatternItem)) {
                isInWhiteList = true;
                break;
            }
        }
        if (!isInWhiteList) {
            HttpSession session = ((HttpServletRequest) request).getSession();
            if (session.getAttribute("userInfo") == null) {
                httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
                return;
            }
        }

        chain.doFilter(request, response);
    }

    public void destroy() {
    }

}
