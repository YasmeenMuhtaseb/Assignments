package com.SimpleProject.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String favoriteLanguage = request.getParameter("favoriteLanguage");
		String homeTown = request.getParameter("homeTown");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if(firstName != null && lastName != null) {
            out.write("<h1>Hello World, from " + firstName + " "+lastName+"</h1>");
        }
        else if(firstName == null && lastName !=null){
            out.write("<h1>Hello World, from " + "UnKown" + " "+lastName+"</h1>");
        }
        else if(lastName == null && firstName !=null) {
            out.write("<h1>Hello World, from " + firstName + " "+"Unkown"+"</h1>");
        }
        else {
            out.write("<h1>Hello World, from Unkown</h1>");
        }
        if(favoriteLanguage != null) {
        out.write("Your favorite language is: " +favoriteLanguage+"<br><br>");
        }
        else {
            out.write("Your favorite language is: Unkown <br><br>");
        }
        if(homeTown != null) {
            out.write("Your hometown is: "+homeTown);
        }
        else {
            out.write("Your hometown is: Unknown");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
