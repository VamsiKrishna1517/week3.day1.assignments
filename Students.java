package week3.day1.assignments;

public class Students {
	
	int studentId;
	String name;
	String email;
	long phoneNumber;
	
	public void  getStudentInfo()
	{
		System.out.println("This is student information");
	}
	public void getStudentInfo (int Id)
	{
		this.studentId = Id;
		System.out.println("This is student id is :- "+this.studentId);
	}
	public void  getStudentInfo(int Id,String Name)
	{
		this.studentId = Id;
		this.name = Name;
		
		System.out.println("This is student id is :-"+this.studentId);
		System.out.println("This is student name is :-"+this.name);
	}
	public void  getStudentInfo(String emailId,long PhoneNmber)
	{
		this.email = emailId;
		this.phoneNumber = PhoneNmber;
		System.out.println("This is student email id is :- "+this.email);
		System.out.println("This is student phone number is :- "+this.phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Students std = new Students();
        std.getStudentInfo();
        std.getStudentInfo(2345);
        std.getStudentInfo(34578, "Krishna");
        std.getStudentInfo("vamshi2371@gmail.com",9731431948l);
        
	}

}
