package servletprograms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

@WebServlet("/SessionOne")
public class SessionOne extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String mail = req.getParameter("email");
		String pass = req.getParameter("password");
		if (mail.equals("Abcd@123") && pass.equals("abcde")) {
			HttpSession session = req.getSession();
			session.setAttribute("k1", mail);
			resp.sendRedirect("SessionTwo");

		} else {
			resp.getWriter().print("Invalid");
		}
	}
}
