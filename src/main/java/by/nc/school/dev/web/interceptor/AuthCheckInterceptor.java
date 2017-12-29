package by.nc.school.dev.web.interceptor;


import by.nc.school.dev.web.util.Pages;
import by.nc.school.dev.web.util.SessionAttributes;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthCheckInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (Boolean.TRUE.equals(request.getSession().getAttribute(SessionAttributes.IS_LOGGED_IN)) || isIgnoreRequest(request)) {
            return true;
        } else {
            response.sendRedirect(Pages.VIEWS.LOGIN.PATH_ABSOLUTE);
            return false;
        }
    }

    private boolean isIgnoreRequest(HttpServletRequest request) {
        return Pages.VIEWS.LOGIN.PATH_ABSOLUTE.equals(request.getRequestURI())
               || Pages.USER.LOGIN.PATH_ABSOLUTE.equals(request.getRequestURI())
               || Pages.USER.REGISTER.PATH_ABSOLUTE.equals(request.getRequestURI())
               || request.getRequestURI().startsWith("/static/");
    }

}
