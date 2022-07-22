package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto0711;


public class MemberDao {
	private static class singleton {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	private MemberDao() {
	}

	public static MemberDao getInstance() {
		return singleton.INSTANCE;
	}

	public int insertDo(String userId, int userAge, String userName) {
		int rs = 0;

		Connection conn = null;
		PreparedStatement pstm = null;

		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "insert into member0711 values(?,?,?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setInt(2, userAge);
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

	public ArrayList<MemberDto0711> lists() {
		ArrayList<MemberDto0711> lists = new ArrayList<MemberDto0711>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member0711";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			while (rs.next()) {
				String userId = rs.getString(1);
				int userAge = rs.getInt(2);
				String userName = rs.getString(3);

				lists.add(new MemberDto0711(userId, userAge, userName));
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

		return lists;
	}

	public MemberDto0711 memberView(String userId) {
		MemberDto0711 member = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from member0711 where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			rs = pstm.executeQuery();

			if (rs.next()) {
				member = new MemberDto0711(rs.getString(1), rs.getInt(2), rs.getString(3));
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

	public int updateDO(String userId, int userAge, String userName) {
		int rs = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "update member0711 set userAge=?, userName=? where userid=?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, userAge);
			pstm.setString(2, userName);
			pstm.setString(3, userId);

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

	public int deleteDo(String userId) {
		int rs = 0;

		Connection conn = null;
		PreparedStatement pstm = null;

		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from member0711 where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
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

	public int deleteDo2(String userId, String userName) {
		int rs = 0;

		Connection conn = null;
		PreparedStatement pstm = null;

		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "delete from member0711 where userId=? and userName=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userName);

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

	public MemberDto0711 memberViewCheck(String userId, String userName) {

		MemberDto0711 member = null;
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		String query = "";

		try {
			query = "select * from member0711 where userId=? and userName=?";
			conn = DBConnect.getConnection();
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			pstm.setString(2, userName);

			rs = pstm.executeQuery();

			if (rs.next()) {
				member = new MemberDto0711(rs.getString(1), rs.getInt(2), rs.getString(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					if (rs != null)
						rs.close();
				pstm.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
			}
		}

		return member;
	}

	public int idChecked(String userId) {
		int member = 0;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		String query = "";
		try {
			conn = DBConnect.getConnection();
			query = "select count(*) from member0711 where userId=?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userId);
			member = pstm.executeUpdate();

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
		
		return member;
	}
}
