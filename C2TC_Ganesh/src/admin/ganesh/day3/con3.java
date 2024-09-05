package admin.ganesh.day3;
import java.util.Scanner; 

public class con3 {
	int a;
	String name;
	public con3() {
		System.out.println("Your ID is" +a);
		System.out.println("Your name is" + name);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		con3 c=new con3();
		System.out.println("Enter your name");
		c.name=sc.nextLine();
		System.out.println("Enter your id");
		c.a=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name");
		c.name=sc.nextLine();

//		System.out.println("Your name is" +c.a);
		con3 c=new con3();
		
	}

}
