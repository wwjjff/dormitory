package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import studentdao.AdminDao1;
import studentdao.StudentDao1;
import studentmodle.DormitoryViolation;
import studentmodle.PersonViolation;
import studentmodle.Student;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{
	public PersonViolation person;
	public DormitoryViolation dormitory;
	public ArrayList<PersonViolation> personviolation;
    public ArrayList<DormitoryViolation> dormitoryviolation;
    
    public String login(){
		return "SUCCESSS";
	}
    
    //查看单条个人违纪
    public String personBynb(){
		AdminDao1 adm=new AdminDao1();
		person=adm.getPersonBynb(person.getNumber());
		return "personBynb";
		
	}  
  //查询个人所有违纪 
    public String querypersonviolation2(){
		AdminDao1 adm=new AdminDao1();		
		personviolation=adm.querypersonviolation(person.getUserid());	 
		return "querypersonviolation2" ;
	}//
    //增加个人违纪
    public String addpersonviolation(){
		AdminDao1 adm=new AdminDao1();		
		person.setAll(person.getNumber(),person.getUserid(),person.getName(),person.getArea(), person.getBuilding(),person.getHostel(), person.getTime(), person.getSex(), person.getInformation(), person.getResult());
		adm.addpersonviolation(person);
		return "addpersonviolation" ;
	}//
    
    //修改个人违纪
     public String modipersonviolation(){
    	 AdminDao1 adm=new AdminDao1();
    	 adm.modifypersonviolation(person.getUserid(), person.getName(), person.getArea(), person.getBuilding(), person.getHostel(), person.getTime(), person.getSex(), person.getInformation(), person.getResult(),person.getNumber());
		return "modipersonviolation";
     }
    //删除个人违纪
     public String deleteperviolation(){
    		AdminDao1 adm=new AdminDao1();	
    		adm.deletepersonviolation(person.getNumber());
    	 return "deleteperviolation";
     }
     
     
	
	//查询所有宿舍违纪
	public String querydormitoryviolation2(){
		AdminDao1 adm=new AdminDao1();			
		dormitoryviolation=adm.querydormitoryviolation(dormitory.getArea(),dormitory.getBuilding(),dormitory.getHostel());	 
		return "querydormitoryviolation2" ;
	}//
	//查单条宿舍违纪
	public String dormitoryBynb(){
		AdminDao1 adm=new AdminDao1();
		dormitory=adm.getdormitoryBynb(dormitory.getNumber());	
		return "dormitoryBynb";
		
	}
	//增加宿舍违纪
	 public String adddormitoryviolation(){
			AdminDao1 adm=new AdminDao1();		
			dormitory.setAll(dormitory.getNumber(),dormitory.getArea(),dormitory.getBuilding() ,dormitory.getHostel(), dormitory.getTime(),dormitory.getPhone(), dormitory.getInformation(), dormitory.getResult());
			adm.adddormitoryviolation(dormitory);
			return "adddormitoryviolation" ;
		}//
	 
	    //修改宿舍违纪
	     public String modidormitoryviolation(){
	    	 AdminDao1 adm=new AdminDao1();
	    	 adm.modifydormitoryviolation(dormitory.getArea(), dormitory.getBuilding(), dormitory.getHostel(), dormitory.getTime(), dormitory.getPhone(), dormitory.getInformation(), dormitory.getResult(),dormitory.getNumber());
			return "modidormitoryviolation";
	     }//
	     
	     //删除宿舍违纪
	     public String deletedorviolation(){
	    	 AdminDao1 adm=new AdminDao1();
	    	 adm.deletedormitoryviolation(dormitory.getNumber());
	    	 return "deletedorviolation";
	     }
	
	public PersonViolation getPerson() {
		return person;
	}

	public void setPerson(PersonViolation person) {
		this.person = person;
	}

	public DormitoryViolation getDormitory() {
		return dormitory;
	}

	public void setDormitory(DormitoryViolation dormitory) {
		this.dormitory = dormitory;
	}

	public ArrayList<PersonViolation> getPersonviolation() {
		return personviolation;
	}

	public void setPersonviolation(ArrayList<PersonViolation> personviolation) {
		this.personviolation = personviolation;
	}

	public ArrayList<DormitoryViolation> getDormitoryviolation() {
		return dormitoryviolation;
	}

	public void setDormitoryviolation(
			ArrayList<DormitoryViolation> dormitoryviolation) {
		this.dormitoryviolation = dormitoryviolation;
	}
}
