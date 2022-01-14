package example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/set-cookie"})
public class SetCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Cookie cookie1 = new Cookie("a","1");
        cookie1.setMaxAge(5);
        resp.addCookie(cookie1);

        Cookie cookie2 = new Cookie("b","2");
        cookie2.setMaxAge(10);
        resp.addCookie(cookie2);
    }
}
