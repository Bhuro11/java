import java.util.Scanner;
class Switch{
	private static Scanner sc;
	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		System.out.println("Hello..");
		System.out.println("Welcome to  Arithmetic Calculator..");
		System.out.println("Enter Two Value:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a =" +a+"\nb ="+b);
		System.out.println("\n..Enter Your Choice(+,-,*,/,%)");
		String ch = sc.next();
		System.out.println("Result = ");
		
		switch(ch)
		{
			case "+":
			System.out.println(a+b);
			break;
			case "-":
			System.out.println(a-b);
			break;
			case "*":
			System.out.println(a*b);
			break;
			case "/":
			System.out.println(a/b);
			break;
			case "%":
			System.out.println(a%b);
			break;
			default:
			System.out.println("Somthing is wrong! try again");
			break;
		}
	}
}