package week2.day2;
public class Mathclass {
	public int add(int a,int b){  return a+b;
	}
	public int sub(int a,int b) { return a-b;
	}
	public int mul(int a,int b) { return a*b;
	}
	public int div(int a,int b) { return a/b;
	}
	public static void main(String[] args) 
	{ // TODO Auto-generated method stub
	Mathclass m=new Mathclass();
	System.out.println(m.add(10,20));
	System.out.println(m.sub(50,20));
	int mul=20;
	System.out.println(m.mul(mul,2));
	System.out.println(m.div(25,5));
	}
}
