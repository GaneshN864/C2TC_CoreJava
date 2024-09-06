package admin.ganesh.day3;

public class accesssep1 {
         
//	Access specifier attribute
	
	int a=10;//default
	public int b=20; //public as
	private int c=30;//private
	protected int d=40;//protected
	
	
//Access specifier method
	void printdef() { //Default 
	
	   System.out.println("Default");
	}
	public void printpub() {
		 System.out.println("Public");
	}
	private void printpri() {
		 System.out.println("Private");
	}
  protected void printpro() 
  {
		 System.out.println("Protected");
	}
  
  
  public static void main(String[] args) 
  {
	    accesssep1 as =new accesssep1();
	    
	    System.out.println(as.a);
	    System.out.println(as.b);
	    System.out.println(as.c);
	    System.out.println(as.d);
	    
	    as.printdef();
	    as.printpub();
	    as.printpri();
	    as.printpro();
	    

	}

}

