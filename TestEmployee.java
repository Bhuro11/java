//Class with method
class Employee{
	 int id;
	 String name;
	 float salary;
	 void setData(int i, String n, float s) {
	 id=i;
	 name=n;
	 salary=s;
 }
 void getData() {
 System.out.println(id+" "+name+" "+salary);
 }
}
public class TestEmployee {
 public static void main(String[] args) {
	 Employee e1=new Employee();
	 Employee e2=new Employee();
	 e1.setData(101,"Bhargav",45000);
	 e2.setData(102,"Tejas",25000);
	 e1.getData();
	 e2.getData();
 } 
}