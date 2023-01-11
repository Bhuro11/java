//Final Class
final class ParentClass
//class ParentClass
{
 void showData()
 {
	System.out.println("This is a method of final Parent class");
 }
}
//It will throw compilation error
class ChildClass extends ParentClass
{
 void showData()
 {
	System.out.println("This is a method of Child class");
 }
}
class TestFinal
{
 public static void main(String arg[])
 {
	 ParentClass obj = new ChildClass();
	 obj.showData();
 }
} 
