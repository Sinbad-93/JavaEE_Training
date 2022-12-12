package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Accueil() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String message = "Bienvenue";
		// send to jsp
		request.setAttribute("variable", message);

		//lier doc jsp
		this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//test du session storage
				String nom = request.getParameter("nom");
		        String prenom = request.getParameter("prenom");
		        
		        HttpSession session = request.getSession();

		        session.setAttribute("nom", nom);
		        session.setAttribute("prenom", prenom);


				//lier doc jsp
				this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
		
	}

}
