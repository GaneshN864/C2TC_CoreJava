package admin.ganesh.day2;

import java.util.Scanner;

public class conifelselader {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m;
		System.out.println("Enter your mark");
		m=scan.nextInt();
		if(m<100 && m>0)
		{
			if(m<=100 && m>=90)
			   System.out.println("GRADE-A");
			else if(m<=89 && m>=80)
				System.out.println("GRADE-B");
			else if(m<=79 && m>=70)
				System.out.println("GRADE-C");
			else if(m<=69 && m>=60)
				System.out.println("GRADE-D");
			else if(m<=59 && m>=50)
				System.out.println("GRADE-E");
			else
				System.out.println("FAIL");
		}

	}

}
