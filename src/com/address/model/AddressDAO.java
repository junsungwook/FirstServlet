package com.address.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AddressDAO {
	private static AddressDAO instance;
	public static AddressDAO getInstance() {
		if(instance==null) {
			instance = new AddressDAO();
		}
		return instance;
	}
	private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/jsp");
		return ds.getConnection();
	}
	//Ãß°¡
	public void addressInsert(AddressDTO ad) {
		Connection con = null;
		PreparedStatement ps = null;	
		try {
			con = getConnection();
			String sql = "insert into addressdb values(addressdb_seq.nextval,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, ad.getName());
			ps.setString(2, ad.getAddr());
			ps.setString(3, ad.getZipcode());
			ps.setString(4, ad.getTel());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeCon(con,ps);
		}

	}
	private void closeCon(Connection con, PreparedStatement ps) {
		try {
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
