package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	public void doGet( HttpServletRequest req, HttpServletResponse res ) throws IOException, ServletException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int result = num1 + num2;
		
		System.out.print(result);
		
		PrintWriter outPrintWriter = res.getWriter();
		
		HttpSession session = req.getSession();
		session.setAttribute("num", result);
		
		
		res.sendRedirect("square?num="+result);
		
		outPrintWriter.println(result);		
	}
}
