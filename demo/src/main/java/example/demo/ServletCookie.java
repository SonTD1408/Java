package example.demo;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/servlet-cookie"})
public class ServletCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<form action='servlet-cookie' method='post'>");
        printWriter.println("Username: <input type='text' name='user'>");
        printWriter.println("<br>Password: <input type='text' name='pass'>");
        printWriter.println("<br><input type='submit' name = 'sub'>");
        printWriter.println("</form>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String username = req.getParameter("user");
        String password = req.getParameter("pass");
        if (username.equals("son") && password.equals("123")){
            Cookie cookie = new Cookie("username", username)    ;
            cookie.setMaxAge(5);

            resp.addCookie(cookie);
            resp.sendRedirect("get-cookie");
        }else {
            resp.sendRedirect("servlet-cookie");
        }
    }
}
