package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registerForm.jsp");
			dispatcher.forward(request, response);
		} else {
			HttpSession session = request.getSession();
			session.removeAttribute("");
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registerDone.jsp");
			dispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String errorMsg = null;
		
		User user = new User(name,pass);
		
		if (user.getName().equals(null) || user.getName().length()==0) {
			errorMsg = "名前が入力されていません。<br>";
		} 
		
		if (errorMsg != null) {
			request.setAttribute("errorMsg", errorMsg);
		}
		
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/registerResult.jsp");
		dispatcher.forward(request, response);
		
	}

}
