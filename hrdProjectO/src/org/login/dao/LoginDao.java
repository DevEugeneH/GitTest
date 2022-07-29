package org.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.login.dbconnect.DBConnect;

public class LoginDao {
	private static class singleton {
		private static final LoginDao INSTNACE = new LoginDao();
	}

	private LoginDao() {

	}

	public static LoginDao getInstance() {
		return singleton.INSTNACE;
	}

	public int join(String userId, String userPw) {
		int rs = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into login values(?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userPw);

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

	public int login(String userId, String userPw) {
		int login = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from login where userId=? and userPw=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userPw);

			rs = pstm.executeQuery();

			while (rs.next()) {
				login = rs.getInt(1);
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

		return login;
	}
}
