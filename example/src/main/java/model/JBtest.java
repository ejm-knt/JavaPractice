package model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JBtest
 */
@WebServlet("/JBtest")
public class JBtest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストスコープに保存するインスタンスの作成
		Human human = new Human("湊雄輔",23);
		
		// リクエストスコープにインスタンスを保存
		request.setAttribute("human",human);
	
		// リクエストスコープからインスタンス取得
		Human h = (Human)request.getAttribute("human");
	}
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
//	}

}
