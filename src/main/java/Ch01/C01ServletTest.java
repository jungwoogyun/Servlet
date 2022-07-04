package Ch01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/Servlet1.do")
public class C01ServletTest extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("INIT함수 호출됨!!");
 
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service 함수 호출됨!!");
 
	}
	@Override
	public void destroy() {
		System.out.println("Destroy 함수 호출됨!!");
		
	}

	
	
	
}
