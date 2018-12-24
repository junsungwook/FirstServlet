package com.exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Bbs1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		req.setAttribute("name", name);
		req.setAttribute("title", title);
		req.setAttribute("content", content);
		
		resp.setContentType("text/html;charset=utf-8");
		RequestDispatcher rd = req.getRequestDispatcher("bbsResult.jsp");
		rd.forward(req, resp);
	}
}
