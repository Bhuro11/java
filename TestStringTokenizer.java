import java.util.StringTokenizer;
public class TestStringTokenizer {
 public static void main(String args[]){
	StringTokenizer st = new StringTokenizer("Java Csharp OS Adv.Net");
	while (st.hasMoreTokens()) {
		System.out.println(st.nextToken());
	}
 }
}