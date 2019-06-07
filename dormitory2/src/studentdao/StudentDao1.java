package studentdao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import studentmodle.DormitoryViolation;
import studentmodle.Hydropower;
import studentmodle.PersonViolation;
import studentmodle.Repair;
import studentmodle.Student;

public class StudentDao1 extends BaseDao1 {
    
	//刚登录时显示用户信息
	public Student queryByUserId(String userId) {
			Student student=null;
			boolean flag = false;
			this.conn = getConn();
			this.stmt = getStmt();
			String sql = "select * from student where userid ='"+userId+"'";
			try {
				ResultSet rs = stmt.executeQuery(sql);
				if (rs!=null &&rs.next()){
					student=new Student();
					student.setUserid(userId);
					student.setName(rs.getString("name"));
					student.setPasswd(rs.getString("passwd"));
					student.setGrade(rs.getString("grade"));
					student.setIp(rs.getString("ip"));
					student.setArea(rs.getString("area"));
					student.setBuilding(rs.getString("building"));
					student.setHostel(rs.getString("hostel"));					
					student.setHousemaster(rs.getString("housemaster"));
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			finally {
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
			return student;
		}//
	
	//水电查询
	public Hydropower queryHydropower(String a,String b,String c) {
		Hydropower hydropower=null;
		boolean flag = false;
		this.conn = getConn();
		this.stmt = getStmt();
		String sql = "select * from hydropower where area ='"+a+"'and building='"+b+"'and hostel='"+c+"'";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			if (rs!=null &&rs.next()){
				hydropower=new Hydropower();
				hydropower.setArea(a);
				hydropower.setBuilding(b);
				hydropower.setHostel(c);
				hydropower.setPower(rs.getString("power"));
				hydropower.setWater(rs.getString("water"));
				hydropower.setState(rs.getString("state"));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally {
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
		return hydropower;
	}//
	
	//个人违纪记录
	public ArrayList<PersonViolation> querypersonviolation(String a) {
		ArrayList<PersonViolation> list = new ArrayList<PersonViolation>();
		boolean flag = false;
		this.conn = getConn();
		this.stmt = getStmt();
		String sql = "select * from personviolation where userid ='"+a+"'";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs != null && rs.next()) {
				PersonViolation  person= new PersonViolation();
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
		}
		finally {
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
	
	//宿舍违规记录
	public ArrayList<DormitoryViolation> querydormitoryviolation(String a,String b,String c) {
		ArrayList<DormitoryViolation> list1 = new ArrayList<DormitoryViolation>();
		boolean flag = false;
		this.conn = getConn();
		this.stmt = getStmt();
		String sql = "select * from dormitoryviolation where area ='"+a+"'and building='"+b+"'and hostel='"+c+"'";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs != null && rs.next()) {
			DormitoryViolation  dormitory= new DormitoryViolation();				
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
		}
		finally {
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
	
    //宿舍报修
	public boolean addrepair(Repair p){
		boolean flag = false;
		this.conn = getConn();
		this.stmt = getStmt();
		String sql = "insert into repair (userid,name,area,building,hostel,time,phone,information,process) values ('"
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
			+ p.getPhone()
			+ "','"
			+ p.getInformation()
			+ "','"
			+ p.getProcess() + "')";
		try {			
			int num = stmt.executeUpdate(sql);
			if (num == 1)
				System.out.print(num);
				flag = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
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
	
	//报修查询
	public ArrayList<Repair> queryrepair(String a,String b,String c) {
		ArrayList<Repair> list2 = new ArrayList<Repair>();
		boolean flag = false;
		this.conn = getConn();
		this.stmt = getStmt();
		String sql = "select * from repair where area ='"+a+"'and building='"+b+"'and hostel='"+c+"'";
		try {
			ResultSet rs = stmt.executeQuery(sql);
			while (rs != null && rs.next()) {
			    Repair  repair=new Repair();	
			    repair.setUserid(rs.getString("userid"));
			    repair.setName(rs.getString("name"));
			    repair.setArea(rs.getString("area"));
			    repair.setBuilding(rs.getString("building"));
			    repair.setHostel(rs.getString("hostel"));
			    repair.setTime(rs.getString("time"));
			    repair.setPhone(rs.getString("phone"));
			    repair.setInformation(rs.getString("information"));
			    repair.setProcess(rs.getString("process"));
				list2.add(repair);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
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
		return list2;
	}//
	
	//
	
}
