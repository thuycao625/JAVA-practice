package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListStudent extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static List<Student> listStudent = new ArrayList<>();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String age = request.getParameter("age");

		Student student = new Student();

		student.setName(name);
		student.setAge(Integer.parseInt(age));

		listStudent.add(student);

		displayHomeView(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		displayHomeView(request, response);
	}
	
	public void displayHomeView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("data", listStudent);
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/view/home.jsp");
		dispatcher.forward(request, response);
	}
}
