package com.address.model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	//추가
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
	public ArrayList<AddressDTO> addressList() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<AddressDTO> arr = new ArrayList<>();
		try {
			con = getConnection();
			String sql = "select * from addressdb";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				AddressDTO ad = new AddressDTO();
				ad.setNum(rs.getInt("num"));
				ad.setName(rs.getString("name"));
				ad.setAddr(rs.getString("addr"));
				ad.setZipcode(rs.getString("zipcode"));
				ad.setTel(rs.getString("tel"));
				arr.add(ad);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeCon(con, st, rs);
		}
		return arr;
	}
	//우편번호 검색
	public ArrayList<ZipcodeDTO> zipSearch(String dong) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<ZipcodeDTO> arr = new ArrayList<>();
		try {
			con = getConnection();
			String sql = "select * from zipcode where DONG like '%"+dong+"%'";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ZipcodeDTO z = new ZipcodeDTO();
				z.setZipcode(rs.getString("zipcode"));
				z.setSido(rs.getString("sido"));
				z.setGugun(rs.getString("gugun"));
				z.setDong(rs.getString("dong"));
				z.setBunji(rs.getString("bunji")); 
				z.setSeq(rs.getInt("seq")); 
				arr.add(z);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(st!=null) st.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return arr;
	}
	//삭제
	public void addressDelete(int num) {
		Connection con = null;
		Statement st = null;
		try {
			con = getConnection();
			st = con.createStatement();
			String sql = "delete from addressdb where num="+num;
			st.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeCon(con,st);
		}
	}
	//각각 검색하기
	public ArrayList<AddressDTO> addressSearch(String what,String str) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<AddressDTO> arr = new ArrayList<>();
		try {
			con = getConnection();
			String sql = "select * from addressdb where "+what+" like '%"+str+"%'";
			System.out.println(sql);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				AddressDTO ad = new AddressDTO();
				ad.setNum(rs.getInt("num"));
				ad.setName(rs.getString("name"));
				ad.setAddr(rs.getString("addr"));
				ad.setZipcode(rs.getString("zipcode"));
				ad.setTel(rs.getString("tel"));
				arr.add(ad);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeCon(con, st, rs);
		}
		return arr;
	}

	//수정
	public void addressUpdate(AddressDTO ad) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			String sql = "update addressdb set name=?, addr=?, zipcode=?, tel=? where num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, ad.getName());
			ps.setString(2, ad.getAddr());
			ps.setString(3, ad.getZipcode());
			ps.setString(4, ad.getTel());
			ps.setInt(5, ad.getNum());
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeCon(con,ps);
		}
	}
	//상세보기
	public AddressDTO addressView(int num) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		AddressDTO ad = null;
		try {
			con = getConnection();
			String sql = "select * from addressdb where num="+num;
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				ad = new AddressDTO();
				ad.setNum(rs.getInt("num"));
				ad.setName(rs.getString("name"));
				ad.setAddr(rs.getString("addr"));
				ad.setZipcode(rs.getString("zipcode"));
				ad.setTel(rs.getString("tel"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeCon(con, st, rs);
		}
		return ad;
	}

	private void closeCon(Connection con, PreparedStatement ps) {

		try {
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void closeCon(Connection con, Statement st,ResultSet rs) {
		try {
			if(st!=null) st.close();
			if(con!=null) con.close();
			if(rs!=null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	private void closeCon(Connection con, Statement st) {
		try {
			if(st!=null) st.close();
			if(con!=null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
