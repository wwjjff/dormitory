package action;



import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import studentdao.StudentDao1;
import studentmodle.DormitoryViolation;
import studentmodle.Hydropower;
import studentmodle.PersonViolation;
import studentmodle.Repair;
import studentmodle.Student;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport{
   public  Student student;
   public Hydropower hydropower; 
   public Repair repair;
   public ArrayList<PersonViolation> personviolation;
   public ArrayList<DormitoryViolation> dormitoryviolation;
   public ArrayList<Repair> queryrepair;
	
	public String login(){
		return "SUCCESSS";
	}
	
	
	//根据账号查询用户信息
	public String querybyid(){
		StudentDao1 std=new StudentDao1();
		 student=std.queryByUserId(student.getUserid());
		 ActionContext.getContext().getSession().put("student", student);
		// Map session=ActionContext.getContext().getSession();
		// System.out.print(session.get("student").getClass());
		return "querybyid";
	}//
	
	//查询水电
	public String queryhydropower(){
		StudentDao1 std1=new StudentDao1();	
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		Student stu = (Student)session.getAttribute("student");
		hydropower=std1.queryHydropower(stu.getArea(),stu.getBuilding(),stu.getHostel());
		 ActionContext.getContext().getSession().put("hydropower", hydropower);
		return "queryhydropower" ;
	}//
	
	//查询个人违纪
	public String querypersonviolation(){
		StudentDao1 std2=new StudentDao1();	
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		Student stu = (Student)session.getAttribute("student");
		personviolation=std2.querypersonviolation(stu.getUserid());	 
		return "querypersonviolation" ;
	}//
	
	//查询宿舍违纪
	public String querydormitoryviolation(){
		StudentDao1 std3=new StudentDao1();	
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		Student stu = (Student)session.getAttribute("student");
		dormitoryviolation=std3.querydormitoryviolation(stu.getArea(),stu.getBuilding(),stu.getHostel());	 
		return "querydormitoryviolation" ;
	}//
	
	//查询报修信息
	public String queryrepair(){
		StudentDao1 std4=new StudentDao1();	
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		Student stu = (Student)session.getAttribute("student");
		queryrepair=std4.queryrepair(stu.getArea(),stu.getBuilding(),stu.getHostel());	 
		return "queryrepair";
	}//
	
	//宿舍报修
	public String addrepair(){
		StudentDao1 std4=new StudentDao1();	
	    repair.setAll(repair.getUserid(),repair.getName(),repair.getArea(),repair.getBuilding(),repair.getHostel(),repair.getTime(),repair.getPhone(),repair.getInformation(),"未处理");
	    std4.addrepair(repair);		 
	    return "repair";	
	}//
	
	//注销用户
	public String invalidate(){
		ServletActionContext.getRequest().getSession().invalidate();
		return "logout";
	}
	
	    public Student getStudent() {
			return student;
		}

		public void setStudent(Student student) {
			this.student = student;
		}

		public Hydropower getHydropower() {
			return hydropower;
		}

		public void setHydropower(Hydropower hydropower) {
			this.hydropower = hydropower;
		}	
		public ArrayList<PersonViolation> getPersonviolation() {
			return personviolation;
		}
		public Repair getRepair() {
				return repair;
			}
		public void setRepair(Repair repair) {
				this.repair = repair;
			}
		public void setPersonviolation(ArrayList<PersonViolation> personviolation) {
			this.personviolation = personviolation;
		}
		public ArrayList<DormitoryViolation> getDormitoryviolation() {
			return dormitoryviolation;
		}
		public void setDormitoryviolation(ArrayList<DormitoryViolation> dormitoryviolation) {
			this.dormitoryviolation = dormitoryviolation;
		}
		public ArrayList<Repair> getQueryrepair() {
			return queryrepair;
		}
		public void setQueryrepair(ArrayList<Repair> queryrepair) {
			this.queryrepair = queryrepair;
		}
		//
}
