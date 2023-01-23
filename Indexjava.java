

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Indexjava")
public class Indexjava extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Indexjava() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Cookies//
		
//		String name=request.getParameter("uname");
//		String password=request.getParameter("password");
//		PrintWriter out=response.getWriter();
//		out.println("Name:"+name+"\nPassword:"+password);
//		Cookie cookie=new Cookie("password",password);
//		response.addCookie(cookie);
//		response.sendRedirect("Indexjavacookie");
		
		
		// URL Rewritting //
		
//		try {
//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		String url=request.getParameter("uname");
//		out.println("<a href='Indexjavacookie?uname="+url+"'>Click here</a>");
//		out.close();
//		}catch(Exception e) {e.printStackTrace();}
//		//RequestDispatcher rs=request.getRequestDispatcher("Indexjavacookie");

		//Hidden Fields //
		try {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("uname");
		
		out.print("<form action='Indexjavacookie'>");
		out.print("<input type='hidden' name='uname' value='"+username+"'>");
		out.print("<input type='submit'>");
		out.print("</form>");  
	    out.close();  
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
