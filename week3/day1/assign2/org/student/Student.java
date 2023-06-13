package week3.day1.assign2.org.student;
import week3.day1.assign2.org.department.*;  //import sub class1 package          
                                             //In multilevel import base class package is not necessary
public class Student extends Department          //subclass 2 for multilevel inheritance (Execution class) 
                                                //Subclass 2 having both the behavior of base & subclass1
{
public void studentName()      // Method declaration
{
	System.out.println("Kavitha");       // Method definition i.e. implementation part
	}
public void studentDept() {
	System.out.println("Department : CSE-A");
	}
public void studentId() {
	System.out.println("ID is CSEA016");
	}
	public static void main(String[] args) {
		Student s1=new Student();        //object creation
		s1.collegeName();    // call Base class methods
		s1.collegeCode();
		s1.collegeRank();
		s1.deptName();        //Call subclass 1 method
		s1.studentName();     //Execution or child class method
		s1.studentDept();
		s1.studentId();
		}
}
