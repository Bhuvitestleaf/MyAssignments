package week3.day1.assign1.org.system;
//Single Inheritance
public class Desktop extends Computer       //derived class extends base class
{
	public void desktopSize() 
	{
		System.out.println("1920 x 1080");
	}
	public static void main(String[] args) 
	{
		Desktop object1=new Desktop();   //object creation for subclass
		object1.computerModel();         //To call Base class method
		object1.desktopSize();           //To call subclass method
	}	
	}
