package week3.day1.assign4.methodoverloading;

public class Students {
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID : "+id); //+ --> Concat
		System.out.println("Student Name : "+name);
	}
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("Email ID : "+email);
		System.out.println("Mobile Number : "+phoneNumber);
	}
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(15, "Kani");
		s.getStudentInfo("kani98@gmail.com", 9175864235l);  //long data type value end with l & for float--> f
	}
}
