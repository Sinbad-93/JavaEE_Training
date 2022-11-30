package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class TestProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TestProject() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*response.setContentType("text/html");
		response.setCharacterEncoding("UTF8");
		
		PrintWriter out = response.getWriter();
		out.println("Bonjour");*/
		
		String message = "Au revoir";
		// send to jsp
		request.setAttribute("variable", message);
		request.setAttribute("heure", "jour");
		
		//lier doc jsp
		this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
	}

}
