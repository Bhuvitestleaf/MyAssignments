package week3.day1.assign3.methodoverride;
//Method Overriding
public class AxisBank extends BankInfo                // subclass extends superclass -- execution class
{
	public void deposit()  // method overridden
	{
		System.out.println("Fund was deposited in Axis bank");
	}
	public static void main(String[] args)   //without main method we can't run any program
	{
		BankInfo axis=new AxisBank();  //Object for subclass
		axis.saving();    //calling function using object
		axis.fixed();
		axis.deposit();
		axis=new BankInfo();    // same object for base class using new keyword
		axis.deposit();
	}
}
