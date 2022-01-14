package example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/session2"})
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        String name ="";
        HttpSession httpSession = req.getSession();
        Object obj1 = httpSession.getAttribute("name");
        if (obj1!=null){
            name = String.valueOf(obj1);
        }else{
            resp.sendRedirect("/session1");
        }
        printWriter.println("xin chao "+ name);
    }
}
