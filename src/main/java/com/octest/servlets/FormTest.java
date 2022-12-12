package com.octest.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.octest.forms.ConnectionForm;

public class FormTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FormTest() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/loginTest.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ConnectionForm form = new ConnectionForm();
        form.verifierIdentifiants(request);
        request.setAttribute("form", form);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/loginTest.jsp").forward(request, response);
    }

}

