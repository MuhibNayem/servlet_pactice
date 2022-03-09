package com.practice;

/**
 *
 * @author muhib
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class myServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        System.out.println("this is get method from httpServlet.....");
        
        response.setContentType("text/html");
        PrintWriter wr = response.getWriter();
        wr.println("<h1>this is get from myServlet class with httpServlet</h1>");
        
    }
}
