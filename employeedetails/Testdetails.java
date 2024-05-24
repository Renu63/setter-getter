package setterandgetter.employeedetails;

public class Testdetails {
	
	public static void main(String[] args) 
	{
		Companydetails c=new Companydetails();
		c.setcompanyName("ABC International");
		c.setCityName("Pune");
		c.setPincode(456789);
		
		Employee e=new Employee();
		System.out.print("Employee id:- ");
		e.setEid(101);
		
		e.setEname("Rani");
		e.setCompanydetails(c);
		
	//	System.out.println("Employee Details:- ");
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getAddress().getcompanyName());
		System.out.println(e.getAddress().getCityName());
		System.out.println(e.getAddress().getPincode());
		
	/*	System.out.println("---------------");
		
		Employee e1=new Employee();
		e1.setEid(102);
		e1.setEname("Rutu");
		e1.setCompanydetails(c);
		
		System.out.println("Employee Details:- ");
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getAddress().getcompanyName());
		System.out.println(e1.getAddress().getCityName());
		System.out.println(e1.getAddress().getPincode());
		
        System.out.println("---------------");
		
		Employee e2=new Employee();
		e2.setEid(103);
		e2.setEname("Nups");
		e2.setCompanydetails(c);
		
		System.out.println("Employee Details:- ");
		System.out.println(e2.getEid());
		System.out.println(e2.getEname());
		System.out.println(e2.getAddress().getcompanyName());
		System.out.println(e2.getAddress().getCityName());
		System.out.println(e2.getAddress().getPincode());
		
        System.out.println("---------------");
		
		Employee e3=new Employee();
		e3.setEid(104);
		e3.setEname("Preeti");
		e3.setCompanydetails(c);
		
		System.out.println("Employee Details:- ");
		System.out.println(e3.getEid());
		System.out.println(e3.getEname());
		System.out.println(e3.getAddress().getcompanyName());
		System.out.println(e3.getAddress().getCityName());
		System.out.println(e3.getAddress().getPincode());
		
		System.out.println("---------------");
		
		Employee e4=new Employee();
		e4.setEid(105);
		e4.setEname("Ishu");
		e4.setCompanydetails(c);
		
		System.out.println("Employee Details:- ");
		System.out.println(e4.getEid());
		System.out.println(e4.getEname());
		System.out.println(e4.getAddress().getcompanyName());
		System.out.println(e4.getAddress().getCityName());
		System.out.println(e4.getAddress().getPincode());
	}
	*/
	}
}
