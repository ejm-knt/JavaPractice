package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class test_JSP_doGet
 */
@WebServlet("/SendForm")
public class SendForm extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータの取得
		HttpSession session = request.getSession();
		request.setCharacterEncoding("UTF-8");	
		// 試した単語をセッションスコープに保存
		
		// trywordをListに格納
	    List<String> tryWordList = (List<String>)session.getAttribute("tryWordList");
	    String tryWord = request.getParameter("tryWord");
	   
	    
	    if (tryWordList == null) {
	    	tryWordList= new ArrayList<>();
	    	// tryWordをセッションに保存
	    }
	    
	    tryWordList.add(tryWord);
	    
	    session.setAttribute("tryWord", tryWord);
    	session.setAttribute("tryWordList", tryWordList);
		
		// 緑分の内容は配列で繰り返し使うため、セッションスコープを定義
	    String[] greenSpells = (String[]) session.getAttribute("greenSpells");

	    if (greenSpells == null) {
	        greenSpells = new String[5];
	        session.setAttribute("greenSpells", greenSpells);
	    }

	    RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/addQueryCommandForm.jsp");
	    dispatcher.forward(request, response);
	    
	
	}
}