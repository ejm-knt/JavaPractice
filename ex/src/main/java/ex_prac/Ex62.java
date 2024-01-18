package ex_prac;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex62")
public class Ex62 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rand = new Random().nextInt(10);
		
		if(rand % 2 == 0) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("fowarded.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("redirected.jsp");
		}
		
	}

}
