package setterandgetter.employeedetails;

public class Employee {

	private int Eid;
	private String Ename;
	private Companydetails Companydetails;
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Companydetails getAddress() {
		return Companydetails;
	}
	public void setCompanydetails(Companydetails  Companydetails) {
		this.Companydetails = Companydetails;
	}
	
	
	
}
