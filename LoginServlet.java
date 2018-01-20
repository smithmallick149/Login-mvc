import java.io.*;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException  {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname");
		String pass = request.getParameter("upass");
		LoginBean bean = new LoginBean();
		bean.setName(name);
		bean.setPass(pass);
		boolean status = false;
		
	try {
		status = bean.validate(name, pass);
	}catch(Exception ee) {
		ee.printStackTrace();
		
	}
	if(status) {
		RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
		rd.include(request, response);
	}else {
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.include(request,response);
		out.println("<center><br>invalid Name or Password</center>");
	}
		
	}
}