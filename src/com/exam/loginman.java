package com.exam;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginman  extends HttpServlet{
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 req.setCharacterEncoding("utf-8");
		 String id = req.getParameter("id");
		 String passwd = req.getParameter("passwd");
		 req.setAttribute("id", id);
		 req.setAttribute("passwd", passwd);
		 resp.setContentType("text/html;charset=utf-8");
		 RequestDispatcher rd = req.getRequestDispatcher("loginView.jsp");
		 rd.forward(req, resp);
	}
}
