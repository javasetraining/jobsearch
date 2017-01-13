package ua.pp.iserf.controller.handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse,
            Authentication authentication) throws IOException, ServletException {

        Collection<? extends GrantedAuthority> auths = authentication.getAuthorities();
        for (GrantedAuthority authorities : auths) {
            if (authorities.getAuthority().equals("admin")) {
                httpServletResponse.sendRedirect("userhome");
            } else if (authorities.getAuthority().equals("client")) {
                httpServletResponse.sendRedirect("userhome");
            }
        }
    }
}
