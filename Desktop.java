package week3.day1.assignments;

public class Desktop extends Computer {
	//Single inheritance
	
	public void desktopSize() 
	{
		System.out.println("The desktop size is 21 inch");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Desktop obj = new Desktop();
        obj.computerModel();// calling computer model method
        obj.desktopSize();// Calling Desktop method
        
	}

}
