package com.address.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.address.model.AddressDAO;
import com.address.model.AddressDTO;

/**
 * Servlet implementation class SearchAction
 */
@WebServlet("/address/search2.do")
public class SearchAction2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAction2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String what = request.getParameter("what");
		String str = request.getParameter("str");
		AddressDAO dao = AddressDAO.getInstance();
		ArrayList<AddressDTO> ad = dao.addressSearch(what,str);
		int count = dao.addressCount(what,str);
		JSONArray jarr = new JSONArray();
		for(AddressDTO z : ad){
			JSONObject obj = new JSONObject();
			obj.put("num",z.getNum());
			obj.put("name",z.getName());
			obj.put("addr",z.getAddr());
			obj.put("zipcode",z.getZipcode());
			obj.put("tel",z.getTel());
			jarr.add(obj);
		}
		JSONObject obj = new JSONObject();
		obj.put("count", count);
		jarr.add(obj);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
