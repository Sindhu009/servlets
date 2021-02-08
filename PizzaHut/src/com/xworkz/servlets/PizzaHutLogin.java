package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 public class PizzaHutLogin extends HttpServlet{
	

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   System.out.println("Recived GET request from client");
	    
	   
		PrintWriter out = resp.getWriter();

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		System.out.println("username recieved is " + username);
		System.out.println("password recieved is " + password);

//		StringBuilder str = new StringBuilder();
//		str.append("<!DOCTYPE html><html><head><title>PizzaHut</title></head> <body>");
//		if (username.equals("sindhu")) {
//			str.append(" <h1>Welcome " + username + " Login Here </h1>");
//
//		} else {
//			str.append("<h1>Invalid username or password</h1>");
//			str.append("<h3> <a href='Login.html'>Back and TryAgain</h3>");
//		}
//		str.append("</body>" + "</html>");
//		out.print(str);
		if(username.equals("sindhu")&&(password.equals("sin123"))) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("MenuPage.html");
			dispatcher.forward(req, resp);
		}
			else {
				//StringBuilder str = new StringBuilder();
				//str.append("<h1>Invalid username or password</h1>");
				//str.append("<h3> <a href='Login.html'>Back and TryAgain</h3>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
				dispatcher.forward(req, resp);
			}

		


	             	  
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		System.out.println("Recived POST request from client");
	      
		   // protected void doPost
					//PrintWriter out = resp.getWriter();

					String username = req.getParameter("username");
					String password = req.getParameter("password");

					System.out.println("username recieved is " + username);
					System.out.println("password recieved is " + password);

//					StringBuilder str = new StringBuilder();
//			str.append("<!DOCTYPE html><html><head><title>Pizza Hut</title></head> <body>");
//					if (username.equals("sindhu")) {
//						str.append(" <h1>Welcome " + username + "</h1>");
//
//					} else {
//						str.append("<h1> Invalid username or password</h1>");
//						str.append("<h3> <a href='Login.html'>Back and TryAgain</a></h3>");
//					}
//					str.append("</body>" + "</html>");
//					out.print(str);   
		
					if(username.equals("sindhu")&&(password.equals("sin123"))) {
						RequestDispatcher dispatcher=req.getRequestDispatcher("MenuPage.html");
						dispatcher.forward(req, resp);
					}
						else {
							RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
							dispatcher.forward(req, resp);
						}	
	
	}
	}