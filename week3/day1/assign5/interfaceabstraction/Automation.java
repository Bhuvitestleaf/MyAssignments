package week3.day1.assign5.interfaceabstraction;

public class Automation extends MultipleLanguage  //execution class extends abstract class
{
	public void java()    //implemented
	{
		System.out.println("Java is Platform independent, OOPs language");
	}
	public void selenium() {
		System.out.println("Selenium is open source tool that automates web browsers");	
	}
	public void ruby() 
	{
		System.out.println("Ruby mainly used to build web applications");		
	}
	public static void main(String[] args) {
		Automation test=new Automation();
		test.java();
		test.selenium();
		test.python();
		test.ruby();
	}
}
