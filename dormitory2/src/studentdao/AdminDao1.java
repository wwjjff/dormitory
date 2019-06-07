package studentdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import studentmodle.DormitoryViolation;
import studentmodle.PersonViolation;

public class AdminDao1 extends BaseDao1 {
	// 查询单调数据
	public PersonViolation getPersonBynb(String uid) {
		String sql = "select * from personviolation where number =?";
		PersonViolation person = new PersonViolation();
		try {
			conn = this.getConn();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
                person.setNumber(rs.getString("number"));
				person.setUserid(rs.getString("userid"));
				person.setName(rs.getString("name"));
				person.setArea(rs.getString("area"));
				person.setBuilding(rs.getString("building"));
				person.setHostel(rs.getString("hostel"));
				person.setTime(rs.getString("time"));
				person.setSex(rs.getString("sex"));
				person.setInformation(rs.getString("information"));
				person.setResult(rs.getString("result"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return person;
	}//
	
	

	// 查询个人所有违纪
	public ArrayList<PersonViolation> querypersonviolation(String a) {
		ArrayList<PersonViolation> list = new ArrayList<PersonViolation>();
		boolean flag = false;
		this.conn = getConn();
		this.stmt = getStmt();
		String sql = "select * from personviolation where userid ='" + a + "'";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs != null && rs.next()) {
				PersonViolation person = new PersonViolation();
				person.setNumber(rs.getString("number"));
				person.setUserid(rs.getString("userid"));
				person.setSex(rs.getString("sex"));
				person.setName(rs.getString("name"));
				person.setArea(rs.getString("area"));
				person.setBuilding(rs.getString("building"));
				person.setHostel(rs.getString("hostel"));
				person.setTime(rs.getString("time"));
				person.setInformation(rs.getString("information"));
				person.setResult(rs.getString("result"));
				list.add(person);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}//
	

	// 修改个人违纪
	public int modifypersonviolation(String a, String b, String c, String d,
			String f, String g, String h, String i, String j,String k) {
		String sql = "update personviolation  set userid=?,name=?, area=?,building=?,hostel=?,time=?,sex=?,information=?,result=? where number=?";
		this.conn = getConn();
		int flag = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a);
			pstmt.setString(2, b);
			pstmt.setString(3, c);
			pstmt.setString(4, d);
			pstmt.setString(5, f);
			pstmt.setString(6, g);
			pstmt.setString(7, h);
			pstmt.setString(8, i);
			pstmt.setString(9, j);
			pstmt.setString(10, k);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	

	// 个人违纪增加
	public boolean addpersonviolation(PersonViolation p) {
		boolean flag = false;
		this.conn = getConn();
		this.stmt = getStmt();
		String sql = "insert into personviolation (number,userid,name,area,building,hostel,time,sex,information,result) values ('"
			    +p.getNumber()
			    + "','" 
			    + p.getUserid()
				+ "','"
				+ p.getName()
				+ "','"
				+ p.getArea()
				+ "','"
				+ p.getBuilding()
				+ "','"
				+ p.getHostel()
				+ "','"
				+ p.getTime()
				+ "','"
				+ p.getSex()
				+ "','"
				+ p.getInformation()
				+ "','" + p.getResult() + "')";
		try {
			int num = stmt.executeUpdate(sql);
			if (num == 1)
				System.out.print(num);
			flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}//
	

	// 删除个人违纪
	public boolean deletepersonviolation(String a) {
		boolean flag = false;
		this.conn = getConn();
		String sql = "delete from personviolation where number ='" + a + "'";
		try {
			PreparedStatement pstmt = null;
			pstmt = conn.prepareStatement(sql);
			int num = pstmt.executeUpdate();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}
	

	// 查宿舍单条数据
	public DormitoryViolation getdormitoryBynb(String a) {
		    
//		String sql = "select * from dormitoryviolation where number ='" + a+ "'";					
//		try {
//			conn = this.getConn();
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
		
			String sql = "select * from dormitoryviolation where number =?";
			DormitoryViolation dormitory = new DormitoryViolation();
			try {
				conn = this.getConn();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, a);
				rs = pstmt.executeQuery();	
			if (rs.next()) {
				dormitory.setNumber(rs.getString("number"));
				dormitory.setArea(rs.getString("area"));
				dormitory.setBuilding(rs.getString("building"));
				dormitory.setHostel(rs.getString("hostel"));
				dormitory.setTime(rs.getString("time"));
				dormitory.setPhone(rs.getString("phone"));
				dormitory.setInformation(rs.getString("information"));
				dormitory.setResult(rs.getString("result"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dormitory;
	}//
	

	// 查宿舍全部违规记录
	public ArrayList<DormitoryViolation> querydormitoryviolation(String a,
			String b, String c) {
		ArrayList<DormitoryViolation> list1 = new ArrayList<DormitoryViolation>();
		boolean flag = false;
		this.conn = getConn();
		this.stmt = getStmt();
		String sql = "select * from dormitoryviolation where area ='" + a
				+ "'and building='" + b + "'and hostel='" + c + "'";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs != null && rs.next()) {
				DormitoryViolation dormitory = new DormitoryViolation();
				dormitory.setNumber(rs.getString("number"));
				dormitory.setArea(rs.getString("area"));
				dormitory.setBuilding(rs.getString("building"));
				dormitory.setHostel(rs.getString("hostel"));
				dormitory.setTime(rs.getString("time"));
				dormitory.setPhone(rs.getString("phone"));
				dormitory.setInformation(rs.getString("information"));
				dormitory.setResult(rs.getString("result"));
				list1.add(dormitory);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list1;
	}//
	

	// 增加宿舍违纪
	public boolean adddormitoryviolation(DormitoryViolation p) {
		boolean flag = false;
		this.conn = getConn();
		this.stmt = getStmt();
		String sql = "insert into dormitoryviolation (number,area,building,hostel,time,phone,information,result) values ('"
			    +p.getNumber()
			    + "','"
			    + p.getArea()
				+ "','"
				+ p.getBuilding()
				+ "','"
				+ p.getHostel()
				+ "','"
				+ p.getTime()
				+ "','"
				+ p.getPhone()
				+ "','"
				+ p.getInformation()
				+ "','" 
				+ p.getResult() + "')";
		try {
			int num = stmt.executeUpdate(sql);
			if (num == 1)
				System.out.print(num);
			flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}//
	
	

	// 修改宿舍违纪
	public int modifydormitoryviolation(String a, String b, String c, String d,
			String f, String g, String h,String i) {
		String sql = "update dormitoryviolation  set area=?,building=?,hostel=?,time=?,phone=?,information=?,result=? where number=?";
		this.conn = getConn();

		PreparedStatement pstmt = null;

		int flag = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a);
			pstmt.setString(2, b);
			pstmt.setString(3, c);
			pstmt.setString(4, d);
			pstmt.setString(5, f);
			pstmt.setString(6, g);
			pstmt.setString(7, h);
			pstmt.setString(8, i);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}//
	

	// 删除宿舍违纪
	public boolean deletedormitoryviolation(String a) {
		boolean flag = false;
		this.conn = getConn();
		String sql = "delete from dormitoryviolation where number ='" + a + "'";
		try {
			PreparedStatement pstmt = null;
			pstmt = conn.prepareStatement(sql);
			int num = pstmt.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}//

	
}
