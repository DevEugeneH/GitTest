package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDetailSale;
import org.project.dto.MemberSaleDto;
import org.project.dto.Member_tbl_02;

public class MemberDao {
	private static class singleton {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	private MemberDao() {

	}

	public static MemberDao getInstance() {
		return singleton.INSTANCE;
	}

	public ArrayList<Member_tbl_02> member() {
		ArrayList<Member_tbl_02> member = new ArrayList<Member_tbl_02>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member_tbl_02";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			while (rs.next()) {
				int custNo = rs.getInt(1);
				String custName = rs.getString(2);
				String phone = rs.getString(3);
				String address = rs.getString(4);
				Date joinDate = rs.getDate(5);
				String grade = rs.getString(6);
				String city = rs.getString(7);

				member.add(new Member_tbl_02(custNo, custName, phone, address, joinDate, grade, city));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
		}

		return member;
	}

	public int joinCommand(int custNo, String custName, String phone, String address, String joinDate, String grade,
			String city) {
		int rs = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member_tbl_02 values(?,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, custNo);
			pstm.setString(2, custName);
			pstm.setString(3, phone);
			pstm.setString(4, address);
			pstm.setString(5, joinDate);
			pstm.setString(6, grade);
			pstm.setString(7, city);

			rs = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
		}

		return rs;
	}

	public Member_tbl_02 detail(int custNo) {
		Member_tbl_02 detail = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member_tbl_02 where custNo=?";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, custNo);

			rs = pstm.executeQuery();

			if (rs.next()) {
				int custNo2 = rs.getInt(1);
				String custName = rs.getString(2);
				String phone = rs.getString(3);
				String address = rs.getString(4);
				Date joinDate = rs.getDate(5);
				String grade = rs.getString(6);
				String city = rs.getString(7);

				detail = new Member_tbl_02(custNo2, custName, phone, address, joinDate, grade, city);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
		}

		return detail;
	}

	public int updateDo(int custNo, String custName, String phone, String address, String joinDate, String grade,
			String city) {
		int rs = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update member_tbl_02 set custName=?, phone=?, address=?, joinDate=?, grade=?, city=? where custNo=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, custName);
			pstm.setString(2, phone);
			pstm.setString(3, address);
			pstm.setString(4, joinDate);
			pstm.setString(5, grade);
			pstm.setString(6, city);
			pstm.setInt(7, custNo);
			rs = pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
		}

		return rs;
	}

	public int custNoMax() {
		int custNo = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select max(custNo)+1 from member_tbl_02";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();
			if (rs.next()) {
				custNo = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
		}

		return custNo;
	}

	public ArrayList<MemberSaleDto> sale() {
		ArrayList<MemberSaleDto> sale = new ArrayList<MemberSaleDto>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select m1.custNo, m1.custName, m1.grade, sum(m2.price) sumT from member_tbl_02 m1 inner join money_tbl_02 m2 on m1.custNo=m2.custNo group by(m1.custNo, m1.custName, m1.grade) order by sumT desc";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			while (rs.next()) {
				int custNo = rs.getInt(1);
				String custName = rs.getString(2);
				String grade = rs.getString(3);
				int price = rs.getInt(4);

				sale.add(new MemberSaleDto(custNo, custName, grade, price));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {

			}
		}

		return sale;
	}

	public ArrayList<MemberDetailSale> dSale(int custNo) {
		ArrayList<MemberDetailSale> dSale = new ArrayList<MemberDetailSale>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select m1.custNo, m2.salenol, m2.pcode ,m2.price from member_tbl_02 m1 inner join money_tbl_02 m2 on m1.custNo=m2.custNo where m1.custNo=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, custNo);

			rs = pstm.executeQuery();

			while (rs.next()) {
				int custNo2 = rs.getInt(1);
				int saleNol = rs.getInt(2);
				String pCode = rs.getString(3);
				int price = rs.getInt(4);

				dSale.add(new MemberDetailSale(custNo2, saleNol, pCode, price));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				
			}
		}

		return dSale;
	}
}
