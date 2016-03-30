package com.edmondmalone.coffeepicker;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CoffeePickerServlet
 */
@WebServlet("/CoffeePickerServlet")
public class CoffeePickerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CoffeePickerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//set response type 
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		String  roast=request.getParameter("roast");
		
		try{	
			 if(roast.equals("blonde")){
				out.println("<h2>Light-bodied & Mellow</h2>");
				out.println("<a href=coffee-picker.jsp> Back</a> ");
			}
			else if (roast.equals("medium")){
				out.println("<h2>Balanced,Smoth & Rich</h2>");
				out.println("<a href=coffee-picker.jsp> Back</a> ");
			}
			else if(roast.equals("dark")){
				out.println("<h2>Full-bodied & bold</h2>");
				out.println("<a href=coffee-picker.jsp> Back</a> ");
			}
			else if(roast.equals("flavored")){
				out.println("<h2>Naturally Flavored</h2>");
				out.println("<a href=coffee-picker.jsp> Back </a> ");
			}
		}catch(NullPointerException e){
			e.printStackTrace();
			out.println("<h2>You are not a coffee drinker </h2>");
			out.println("<a href=coffee-picker.jsp> Back</a> ");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
