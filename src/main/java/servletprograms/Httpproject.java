package servletprograms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/httpone")
public class Httpproject extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		long contact = Long.parseLong(req.getParameter("contact"));
		String email = req.getParameter("email");
		resp.getWriter().println(contact+" *****************  "+email);

	}

}
