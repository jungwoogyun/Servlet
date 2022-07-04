package Ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetTest.do")
public class C02DoGetTest extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//파라미터 받기
		String userid = req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		
		//헤더 추가(한글깨짐 방지, Html코드 적용)
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		//브라우저로 보낼 out객체 꺼내기
		PrintWriter out =   resp.getWriter();
		
		//브라우저로 Code 전송 
		out.println("USERID : " + userid+"<br>");
		out.println("PWD : " + pwd);
		
	}
	
	
}
