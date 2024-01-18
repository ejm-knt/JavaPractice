package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex.InputCount;

/**
 * Servlet implementation class EngelsCoefficientServlet
 */
@WebServlet("/EngelsCoefficientServlet")
public class EngelsCoefficientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/EngelsCoefficientIndex.jsp");
		dispatcher.forward(request, response);
		
		// IndexのFormタグからの項目作成数リクエストパラメータを取得
		String count = request.getParameter("makeInputbox");
		
		InputCount inputCount = new InputCount();
		inputCount.setInputCount(Integer.parseInt(count));
				
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
