package com.company.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.company.model.SelectExpert;
import java.util.*;
public class Select extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        SelectExpert selectExpert= new SelectExpert();

        String nickname = request.getParameter("name");
        List result = selectExpert.getSelect(nickname);
        request.setAttribute("styles", result);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request,response);
//        Iterator se = result.iterator();
//        while (se.hasNext()){
//            printWriter.println("<br>try: "+se.next());
//        }
    }
}
