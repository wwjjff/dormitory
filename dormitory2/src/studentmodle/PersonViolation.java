package studentmodle;

public class PersonViolation {
	private String number;
	private String area;
	private String building;
	private String hostel;
	private String userid;
	private String name;
	private String sex;
	private String time;
	private String information;
	private String result;
	
	public void setAll(String number,String userid,String name,String area,String building,String hostel,String time,String sex,String information,String result){
		this.number=number;
		this.userid = userid;
		this.name = name;
		this.area = area;
		this.building = building;
		this.hostel = hostel;
		this.time = time;
		this.sex = sex;
		this.information = information;
		this.result = result;
	}
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getHostel() {
		return hostel;
	}
	public void setHostel(String hostel) {
		this.hostel = hostel;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
   
}
