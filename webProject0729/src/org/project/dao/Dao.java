package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.Member0729;

public class Dao {
	private static class singleton {
		private static final Dao INSTANCE = new Dao();
	}

	private Dao() {
	}

	public static Dao getInstance() {
		return singleton.INSTANCE;
	}

	public int insert(String userId, String userAge, String userName) {
		int rs = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member0729 values(?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userAge);
			pstm.setString(3, userName);

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

	public ArrayList<Member0729> list() {
		ArrayList<Member0729> list = new ArrayList<Member0729>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member0729";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			while (rs.next()) {
				String userId = rs.getString(1);
				String userAge = rs.getString(2);
				String userName = rs.getString(3);

				list.add(new Member0729(userId, userAge, userName));
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

		return list;
	}
}
