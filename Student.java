package week3.day1.assignments;

public class Student extends Department {
	//Multi -level inheritance
	public void studentName()
	{
		System.out.println("Student name is Vamshi");
	}
	public void studentDept()
	{
		System.out.println("Student Department is Engineering");
	}
	public void studentId()
	{
		System.out.println("Student is 89257");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.collegeName();
		st.collegeCode(); // calling collge(Grand Parent) methods
		st.collegeRank();
		st.deptName();// calling Department(Parent) method
		st.studentId();
		st.studentName();// calling student methods
		st.studentDept();
		

	}

}
