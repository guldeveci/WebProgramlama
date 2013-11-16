package com.search_engine;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Arama_Motoru
 */
@WebServlet("/Arama_Motoru")
public class Arama_Motoru extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Arama_Motoru() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// TODO Auto-generated method stub
		
		PrintWriter out= response.getWriter();
		out.println("<!DOCTYPE html>" +
		"<HTML>\n" +
		"<HEAD><TITLE>Search Engine</TITLE></HEAD>\n"+
		
		
		"<BODY style='background-color:lightblue'>\n" +
		"<FORM action='Search' "
		+ "method='Get'>"+
		"Aranicak kelimeyi giriniz : <input type='text' name='searchWord'</br>"+
		
		
		
		"<p> Bir arama motoru secin...</p></br>"+
		"<input type='radio' name='engine' value='Google'>Google</br>"+
		"<input type='radio' name='engine' value='Bing'>Bing</br>"+
		"<input type='radio' name='engine' value='Ask'>Ask</br>"+
		"<input type='radio' name='engine' value='Yahoo'>Yahoo</br>"+
		"<input type='radio' name='engine' value='Yandex'>Yandex</br>"+
		
		"<input type='submit' value='ARA'>"+
		"</FORM></br>"+
		
		
		"</BODY>"+
		"</HTML>");
		
			
			
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
