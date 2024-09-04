package admin.ganesh.day2;
import java.util.Scanner;
public class condition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age=scan.nextInt();
		if(age<=18)
		{
			System.out.println("Not Eligible for Voting ");
		}
		else
		{
			System.out.println(" Eligible for Voting ");
		}
	}

}
