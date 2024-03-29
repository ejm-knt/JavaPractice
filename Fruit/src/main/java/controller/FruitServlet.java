package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex.Fruit;

/**
 * Servlet implementation class FruitServlet
 */
@WebServlet("/FruitServlet")
public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fruit fruit = new Fruit("いちご",700);
		
		// リクエストスコープ
		//request.setAttribute("fruit", fruit);
		
		// アプリケーションスコープ
		ServletContext application = this.getServletContext();
		application.setAttribute("fruit", fruit);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/fruit.jsp");
		dispatcher.forward(request, response);
		
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
