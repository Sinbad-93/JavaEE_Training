package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.octest.beans.Auteur;


public class TestProject2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TestProject2() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Auteur auteur = new Auteur();
		auteur.setName("Zachary");
		auteur.setFamillyName("Zacha");
		auteur.setActif(true);
		
		request.setAttribute("auteur", auteur);
		
		
		 String name = request.getParameter("name");
	       request.setAttribute("name", name);
	     String[] noms = {"Mathieu", "Robert", "François"};
	       request.setAttribute("noms", noms);
	       
	     //lier doc jsp
			this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour2.jsp").forward(request, response);}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
	}

}
