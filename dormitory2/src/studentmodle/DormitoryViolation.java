package studentmodle;

public class DormitoryViolation {
	private String number;	
	private String area;
	private String building;
	private String hostel;
	private String phone;
	private String time;
	private String information;
	private String result;
	
	public void setAll(String number,String area,String building,String hostel,String time,String phone,String information,String result){	
		this.number=number;
		this.area = area;
		this.building = building;
		this.hostel = hostel;
		this.time = time;
		this.phone = phone;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
