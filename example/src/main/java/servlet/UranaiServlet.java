package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class UranaiServlet
 */
@WebServlet("/UranaiServlet")
public class UranaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ランダムに運勢決定
//		String[] luckArray = {"超スッキリ","スッキリ","最悪"};
		String[] luckArray = {"superLucky","lucky","bad"};
		
		int index = (int)(Math.random() * 3);
		String luck = luckArray[index];
		
		//実行日を取得
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
		String today = sdf.format(date);
		
		//HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter().append(request.getContextPath());
		

		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\" />");
		
//		out.println("<title>スッキリ占い</title>");
		out.println("<title>fortune telling</title>");
		
		out.println("</head>");
		out.println("<body>");
		
		out.println("<p>" + today + "の運勢は「" + luck + "」です。 </p>");
		out.println("<p>The fortune for " + today + " is " + luck + ". </p>");
		
		out.println("</body>");
		out.println("</html>");
		
	}

}
