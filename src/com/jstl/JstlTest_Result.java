package com.jstl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JstlTest_Result extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
	String id =	req.getParameter("id");
	String color = req.getParameter("color");
	req.setAttribute("id", id);
	req.setAttribute("color", color);
	
		resp.setContentType("text/html;charset=utf-8");
		RequestDispatcher rd = req.getRequestDispatcher("jstlTest01_Result02.jsp");
		rd.forward(req, resp);
	}
}
