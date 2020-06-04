package demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowImage extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletOutputStream out = response.getOutputStream();

		out.println("<html>");
		out.println("<head><title>Hello Servlet</title></head>");

		out.println("<body>");

		out.println("<br><a href='./hello'><button type=\"button\">Return</button></a>");

		out.println(
				"<img src='https://thuthuatnhanh.com/wp-content/uploads/2020/03/hinh-ve-de-thuong-cute.jpg' alt='image' />");

		out.println("</body>");
		out.println("<html>");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
