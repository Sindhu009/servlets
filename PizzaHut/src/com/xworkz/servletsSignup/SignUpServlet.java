package com.xworkz.servletsSignup;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlets.dao.SignUpdao;
import com.xworkz.servlets.dto.SignUpdto;

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

		


private SignUpdao signUpdao;

public void init() {
	signUpdao = new SignUpdao();
}

protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

	
}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
   // int id=Integer.parseInt("id");
    
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	int password = Integer.parseInt(request.getParameter("password"));
	int mobile = Integer.parseInt(request.getParameter("PhoneNumber"));

	SignUpdto signUpdto = new SignUpdto();
	signUpdto.setName(name);
	signUpdto.setEmail(email);
	signUpdto.setPasssword(password);
	signUpdto.setPhoneNumber(mobile);

	try {
		signUpdao.registration(signUpdto);

	} catch (Exception e) {
		e.printStackTrace();
	}
	RequestDispatcher dispatcher=request.getRequestDispatcher("MenuPage.html");
	dispatcher.forward(request, response);
}

}