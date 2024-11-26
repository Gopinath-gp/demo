package servletprograms;

import java.io.IOException;
import java.lang.foreign.AddressLayout;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookieone")
public class Cookieone extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mail=req.getParameter("email");
        String pass=req.getParameter("password");
        
        Cookie cookie1=new Cookie("k1","mail");
        Cookie cookie2=new Cookie("k2","pass");
        
       resp.addCookie(cookie1);
       resp.addCookie(cookie2);
       
   	req.getRequestDispatcher("cookietwo").forward(req, resp);
	
        
        
	}}
