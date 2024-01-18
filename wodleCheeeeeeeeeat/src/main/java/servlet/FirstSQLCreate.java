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

import model.CreateCustomSQL;
import model.GetWordleWordListLogic;
import model.WordleWords;
import model.YellowSpell;

/**
 * Servlet implementation class index
 */
@WebServlet("/FirstSQLCreate")
public class FirstSQLCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 緑、黄色、灰色の状態を完全初期化
		String[] greenSpells = {"_","_","_","_","_"};
		List<YellowSpell> yellowSpellList = new ArrayList<>();
		String graySpell = "";
		
		// 緑、黄色、灰色の格納状態を元にSQL文を作成する
		CreateCustomSQL createCustomSql = new CreateCustomSQL(greenSpells,yellowSpellList,graySpell);
		String sql = createCustomSql.SeachSQL(greenSpells, yellowSpellList, graySpell);
		
		// 作成されたSQL文を元にDBリストを作成
		GetWordleWordListLogic getWordleWordsListLogic = new GetWordleWordListLogic();
		List<WordleWords> wordleWordList = getWordleWordsListLogic.execute(sql);
		
		// リクエストスコープでメイン画面へフォワード
		request.setAttribute("wordleWordList", wordleWordList);
		
		// セッションスコープで黄色分リスト内容を保存
		HttpSession session = request.getSession();
		
		session.setAttribute("greenSpells", greenSpells);
		
		session.setAttribute("yellowSpellList", yellowSpellList);
		
		session.setAttribute("graySpell", graySpell);
		
		// SQL文デバック
		request.setAttribute("sql", sql);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
		dispatcher.forward(request, response);
	}

}





