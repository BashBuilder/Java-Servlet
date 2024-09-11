package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/square")
public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int num = Integer.parseInt(req.getParameter("num"));
		HttpSession session = req.getSession();
		int num = (int) session.getAttribute("num");
		
		int result = num * num;
		PrintWriter outPrintWriter = res.getWriter();
		outPrintWriter.println("The result is " + result);
		
	}
}
