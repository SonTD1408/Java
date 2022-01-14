package example.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = {"/*"})
public class Logger implements Filter {
    private int count;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        count=0;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest,servletResponse);
        PrintWriter printWriter = servletResponse.getWriter();
        count++;
        System.out.println(count);

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
