package example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/get-cookie"})
public class GetCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        Cookie[] cookies  = req.getCookies();
        String name = "null";
        for (Cookie c :cookies){
            if (c.getName().equals("username")){
                name = c.getValue();
            }
            if (name.equals("")){
                resp.sendRedirect("servlet-cookie");
            }
        }
        printWriter.println("welcome");
    }
}
