package com.exam;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam/ServletCycle")
public class ServletCycle extends HttpServlet{
	public ServletCycle() {
		System.out.println("»ý¼ºÀÚ");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
		
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service");
		super.service(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");
		String param = req.getParameter("test")==null?"guest":req.getParameter("test");
		System.out.println(param);
		System.out.println("--------------");
		resp.sendRedirect("test.jsp");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
	}
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
}
