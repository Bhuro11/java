//Inner class demo.
class Testinner {
 private int data=30;
	class Inner
	{
		void msg()
		{
			System.out.println("data is "+data);
		}
	}
 public static void main(String args[]){
	 Testinner obj=new Testinner();
	 Testinner.Inner in=obj.new Inner();
	 in.msg();
	}
} 
