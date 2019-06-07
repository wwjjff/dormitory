package studentmodle;

public class Repair {
	private String userid;
	
	private String name;
	private String area;
	private String building;
	private String hostel;
	private String time;
	private String phone;
	private String information;
	private String process;
	public void setAll(String userid,String name,String area,String building,String hostel,String time,String phone,String information,String process){
		this.userid = userid;
		this.name = name;
		this.area = area;
		this.building = building;
		this.hostel = hostel;
		this.time = time;
		this.phone = phone;
		this.information = information;
		this.process = process;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	
}
