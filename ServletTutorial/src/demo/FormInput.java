package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormInput extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	        String name = req.getParameter("name");
	        String age = req.getParameter("age");
	        
	        resp.setContentType("text/html");
	        PrintWriter printWriter = resp.getWriter();
	        printWriter.print("<html>");
	        printWriter.print("<body>");
	        
	        printWriter.print("<h1>Student Information</h1>");
	        printWriter.print("<p> Name :: " + name + "</p>");
	        printWriter.print("<p> Age :: " + age + "</p>");
	       
	        printWriter.print("</body>");
	        printWriter.print("</html>");
	        printWriter.close();
	      
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse   response) throws ServletException, IOException {
        doPost(request, response);
	}
}
