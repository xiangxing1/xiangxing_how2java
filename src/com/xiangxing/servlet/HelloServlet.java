package com.xiangxing.servlet;

/*import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class HelloServlet extends HttpServlet{
 
    public void doGet(HttpServletRequest request, HttpServletResponse response){
         
        try {
            response.getWriter().println("<h1>Hello Servlet xiangxing!</h1>");
            response.getWriter().println(new Date().toLocaleString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void init(ServletConfig config){
        System.out.println("init of Hello Servlet");
    }
     
}*/

import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
 
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class HelloServlet extends HttpServlet{
     
    public void init(ServletConfig config){
        System.out.println("init of Hello Servlet");
    }
 
    public void doGet(HttpServletRequest request, HttpServletResponse response){
     
    	response.setContentType("text/html; charset=UTF-8");
         
        try {
            response.getWriter().println("<h1>Hello Servlet! À²À²´ó¼Ò·ç·¶</h1>");
            response.getWriter().println(new Date().toLocaleString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     
}