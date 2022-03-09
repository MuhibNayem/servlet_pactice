package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.*;

/**
 *
 * @author muhib
 */
public class RegistrationServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter wr = response.getWriter();
        String name = request.getParameter("user_name");
        String email = request.getParameter("user_email");
        String course = request.getParameter("user_course");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String condition = request.getParameter("condition");
        if (condition != null) {
            if (condition.equals("checked")) {

                wr.println("<h1>Welcome to Registration Servlet</h1>");
                wr.println("<h2>name: " + name + "</h2>");
                wr.println("<h2>email: " + email + "</h2>");
                wr.println("<h2>course: " + course + "</h2>");
                wr.println("<h2>condition: " + condition + "</h2>");
                System.out.println("user name: " + name);
                System.out.println("user email: " + email);
                System.out.println("user course: " + course);
                System.out.println("user course: " + condition);
                
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("success");
                requestDispatcher.forward(request, response);
            }
        } else {
            wr.println("<h1>condition must be accepted.</h1>");
//            include index.html page if condition not checked in form
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
            requestDispatcher.include(request, response);
        }
    }
}
