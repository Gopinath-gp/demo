package servletprograms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s4")
public class Httpthree  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("kn", "hello");//
		resp.sendRedirect("https://youtube.com");//it create the new request object and it does not send existing request and respose(do get as a method)
		
	}

}
