package com.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Adder extends HttpServlet{
	//get방식일떄는 doGet
	//post방식일 때는 doPost
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int sum = num1+num2;
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head><title>덧셈 프로그램</title>");
		out.println("<body>");
		out.println("첫번째 : " + num1 + "<br>");
		out.println("두번째 : " + num2 + "<br>");
		out.println("합계 : " + sum + "<br>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
	}
}
