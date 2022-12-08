	public class Main {
   static void myMethod(String nm) {
    System.out.println("Welcome" + " " + nm);
  }
  static int addMethodInt(int x, int y) {
    return x + y;
  }
  
  static int subMethodInt(int x, int y) {
    return x - y;
  }
  
  static int mulMethodInt(int x, int y){
	return x * y;
  }
  
   static int divMethodInt(int x, int y){
	return	x / y;
  }
  
   static int modMethodInt(int x, int y){
	return x % y;
  }
  
  public static void main(String[] args) {
	myMethod("bhargav");
    myMethod("tejas");
    int myNum1 = addMethodInt(25,5);
    int myNum2 = subMethodInt(314,300);
    int myNum3 = mulMethodInt(5,6);
    int myNum4 = divMethodInt(25,5);
    int myNum5 = modMethodInt(25,4);
    System.out.println("Addition: " + myNum1);
    System.out.println("Subtraction: " + myNum2);
    System.out.println("Multiplication: " + myNum3);
    System.out.println("Divison: " + myNum4);
    System.out.println("Module: " + myNum5);
  }
}
