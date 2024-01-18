package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogic;

@WebServlet("/HealthCheckController")
public class HealthCheckController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 初めにTop(Index)画面にフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/healthCheckIndex.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// IndexのFormタグからのリクエストパラメータを取得
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		
		// 入力値をプロパティに設定
		Health health = new Health();
		health.setHeight(Double.parseDouble(height));
		health.setWeight(Double.parseDouble(weight));
		
		// 健康診断を実行し結果を設定
		HealthCheckLogic healthCheckLogic = new HealthCheckLogic();
		healthCheckLogic.execute(health);
		
		// リクエストスコープに保存
		request.setAttribute("health", health);

		// フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/healthCheckResult.jsp");
		dispatcher.forward(request, response);
	}

}
