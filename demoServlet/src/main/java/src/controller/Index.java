package src.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;

import static src.model.Index.*;

@WebServlet(urlPatterns = {"/index"})
public class Index extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
//        PrintWriter printWriter = resp.getWriter();
//        printWriter.println("hello");
//        printWriter.close();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println(username+ " "+password);

        int check =checkLogin(username,password);
        if (check==0) {
            resp.sendRedirect("index.jsp");
        }
        else {
            resp.sendRedirect("showInfo.jsp");
            printWriter.println("hello");
        }
        printWriter.close();
    }
    public ResultSet showAllUser() throws SQLException {
        ResultSet res =getAllAccount();
        return res;
    }
}
