package admin.ganesh.day4;


	class A{
		int a=12,b=23;
		

}
class B extends A{
	int c;
	
	void add1() 
	{
	c=a+b;
	System.out.println("the added value " + c);
	}
	
} 

public class Singleinherit{
	public static void main(String []args) {
		B b=new B();
		b.add1();
		
		
	}

}
