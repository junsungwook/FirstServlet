package com.address.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.address.model.AddressDAO;
import com.address.model.AddressDTO;

/**
 * Servlet implementation class UpdateAction
 */
@WebServlet("/address/update.do")
public class UpdateAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		 int num = Integer.parseInt(request.getParameter("num"));
		 String name = request.getParameter("name");
		 String addr = request.getParameter("addr");
		 String zipcode = request.getParameter("zipcode");
		 String tel = request.getParameter("tel"); 
		 AddressDTO ad = new AddressDTO();
		 ad.setNum(num);
		 ad.setName(name);
		 ad.setAddr(addr);
		 ad.setTel(tel);
		 ad.setZipcode(zipcode);
		 AddressDAO dao = AddressDAO.getInstance();
		 dao.addressUpdate(ad);
		 response.sendRedirect("list.do");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
