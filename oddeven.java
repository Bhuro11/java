import java.util.*;
public class oddeven{
	public static void main(String argc[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int a = sc.nextInt();
		if(a%2==0)
		{
			System.out.println( a +" is even number..");
		}
		else
		{
			System.out.println( a + " is odd number..");
		}
	}
}