package week3.day1.assignments;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println(" This is Axis Bank deposit acount");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();

	}

}
