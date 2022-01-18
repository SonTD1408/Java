package src.controller;

import src.model.Index;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

@WebServlet(urlPatterns = {"/insert-account"})
public class InsertAccount extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("name");
        String password = req.getParameter("pass");
        String gender = req.getParameter("gender");

        Index model = new Index();
        try {
            model.insert(user,password,gender);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Register successfully!");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("showInfo.jsp");

    }
}
