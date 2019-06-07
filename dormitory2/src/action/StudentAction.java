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
	
	
	//�����˺Ų�ѯ�û���Ϣ
	public String querybyid(){
		StudentDao1 std=new StudentDao1();
		 student=std.queryByUserId(student.getUserid());
		 ActionContext.getContext().getSession().put("student", student);
		// Map session=ActionContext.getContext().getSession();
		// System.out.print(session.get("student").getClass());
		return "querybyid";
	}//
	
	//��ѯˮ��
	public String queryhydropower(){
		StudentDao1 std1=new StudentDao1();	
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		Student stu = (Student)session.getAttribute("student");
		hydropower=std1.queryHydropower(stu.getArea(),stu.getBuilding(),stu.getHostel());
		 ActionContext.getContext().getSession().put("hydropower", hydropower);
		return "queryhydropower" ;
	}//
	
	//��ѯ����Υ��
	public String querypersonviolation(){
		StudentDao1 std2=new StudentDao1();	
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		Student stu = (Student)session.getAttribute("student");
		personviolation=std2.querypersonviolation(stu.getUserid());	 
		return "querypersonviolation" ;
	}//
	
	//��ѯ����Υ��
	public String querydormitoryviolation(){
		StudentDao1 std3=new StudentDao1();	
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		Student stu = (Student)session.getAttribute("student");
		dormitoryviolation=std3.querydormitoryviolation(stu.getArea(),stu.getBuilding(),stu.getHostel());	 
		return "querydormitoryviolation" ;
	}//
	
	//��ѯ������Ϣ
	public String queryrepair(){
		StudentDao1 std4=new StudentDao1();	
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();	
		Student stu = (Student)session.getAttribute("student");
		queryrepair=std4.queryrepair(stu.getArea(),stu.getBuilding(),stu.getHostel());	 
		return "queryrepair";
	}//
	
	//���ᱨ��
	public String addrepair(){
		StudentDao1 std4=new StudentDao1();	
	    repair.setAll(repair.getUserid(),repair.getName(),repair.getArea(),repair.getBuilding(),repair.getHostel(),repair.getTime(),repair.getPhone(),repair.getInformation(),"δ����");
	    std4.addrepair(repair);		 
	    return "repair";	
	}//
	
	//ע���û�
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
