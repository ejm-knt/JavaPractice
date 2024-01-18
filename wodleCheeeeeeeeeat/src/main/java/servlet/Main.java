package servlet;

import java.io.IOException;
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
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //リクエストパラメータの取得
	    request.setCharacterEncoding("UTF-8");
	    HttpSession session = request.getSession();
	    String[] greenSpells = (String[]) session.getAttribute("greenSpells");
	    List<YellowSpell> yellowSpellList = (List<YellowSpell>) session.getAttribute("yellowSpellList");
	    
	    // 緑分の入力内容を保存。無記名は除く。
	    for (int i = 0; i < greenSpells.length;i++) {
	        String parameter = request.getParameter("greenSpell_"+(i+1));
	        if(parameter != null && !parameter.isEmpty()) {
	            greenSpells[i] = parameter;
	        }else if(parameter != "_") {
	        	greenSpells[i] = greenSpells[i];
	        } else {
	        	greenSpells[i] = "_";	        	
	        }
	    }
	    
	    // Save the updated greenSpells array in the session scope
	    session.setAttribute("greenSpells", greenSpells);
	    
	    // 黄色分の入力内容をYELLOWSPELLクラスを使ってリスト格納
	    String getAddCount = request.getParameter("count");
	    
	    if(getAddCount != null) {	    
	    	int count = Integer.parseInt(getAddCount);

		    for(int i = 0; i < count;i++) {
		    String changeInt = request.getParameter("yellowPosition_"+(i+1));

		    int yellowPosition = Integer.parseInt(changeInt);
		    String yellowAlphabet = request.getParameter("yellowAlphabet_"+(i+1));
		    YellowSpell yellowSpell = new YellowSpell(yellowPosition, yellowAlphabet);
		    yellowSpellList.add(yellowSpell);
		    }
	    }
	    
	    // Save the updated greenSpells array in the session scope
	    session.setAttribute("yellowSpellList", yellowSpellList);
	    
	    // 灰色分の入力内容を
	    String graySpell = (String)session.getAttribute("graySpell");
	    graySpell += request.getParameter("graySpell");
	    session.setAttribute("graySpell", graySpell);
	    
	    CreateCustomSQL createCustomSql = new CreateCustomSQL(greenSpells,yellowSpellList,graySpell);
		String sql = createCustomSql.SeachSQL(greenSpells, yellowSpellList, graySpell);
		
		// 作成されたSQL文を元にDBリストを作成
		GetWordleWordListLogic getWordleWordsListLogic = new GetWordleWordListLogic();
		List<WordleWords> wordleWordList = getWordleWordsListLogic.execute(sql);
		
		// リクエストスコープでメイン画面へフォワード
		request.setAttribute("wordleWordList", wordleWordList);
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
	    dispatcher.forward(request, response);
		
	}

}
