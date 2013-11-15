package com.search_engine;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String engine = request.getParameter("engine");
		String scw=request.getParameter("searchWord");
		if ((scw == " ")||(scw==null)||(scw=="")){
			response.sendError(HttpServletResponse.SC_NOT_FOUND, 
					"Arama kelimesi girilmedi.");
			
			
		}else if(engine==null){
			response.sendError(HttpServletResponse.SC_NOT_FOUND, 
					"Arama motoru seçilmedi.");
			
		}
		
		else{
			if(engine.equals("Google"))	response.sendRedirect("https://www.google.com.tr/?gws_rd=cr&ei=LjqFUteiIciK4ASQ-oDoCA#q="+scw);
			if(engine.equals("Bing"))	response.sendRedirect("http://www.bing.com/search?q="+scw+"&qs=n&form=QBLH&filt=all&pq=dj&sc=8-2&sp=-1&sk=");
			if(engine.equals("Ask"))	response.sendRedirect("http://www.ask.com/web?qsrc=1&o=0&l=dir&q="+scw);
			if(engine.equals("Yahoo"))	response.sendRedirect("http://tr.search.yahoo.com/search;_ylt=AoRa0Wkt1t7uow7EOR8HYAUhl7x_;_ylc=X1MDMjE0MzA2NTg4OQRfcgMyBGZyA3lmcC10LTcyMwRuX2dwcwMxMARvcmlnaW4DdHIueWFob28uY29tBHF1ZXJ5A2ZhY2Vib29rBHNhbwMxBHRlc3QDNzIzBHZlcnNpb24DbGVnbw--?p="+scw+"&toggle=1&cop=mss&ei=UTF-8&fr=yfp-t-723");
			if(engine.equals("Yandex"))	response.sendRedirect("http://www.yandex.com.tr/yandsearch?msid=22861.4372.1384463416.26448&text="+scw);
		}
				
		
		
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
