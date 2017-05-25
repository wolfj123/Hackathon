import java.util.ArrayList;
import java.util.Comparator;

public class JWclass {

	public static void main(String[] args) {
		exc1();
		
		print("");
		
		exc3();
	}
	
	
	
	public static void exc1(){
		SecretHash hash = new SecretHash();
		hash.setDifficulty(1);
		String s1 = hash.secretHash("hackathon");
		String s2 = hash.secretHash("hackathon105");
		String s3 = hash.secretHash("hackathon105pizza");
		
		print(s1);print(s2);print(s3);
	}
	
	public static void exc3(){
		SecretHash hash = new SecretHash();
		hash.setDifficulty(0);
		String s2 = hash.secretHash("hackathon105");

		print(s2);
	}
	
	public static void exc4(){
		SecretHash hash = new SecretHash();
		hash.setDifficulty(0);
		
		String s1 = hash.secretHash("");
		String s2 = hash.secretHash("");

		print(s2);
	}
	
	public static void print(String s){
		System.out.println(s);
	}
	
	
	
	public void sortStringArray(ArrayList<String> list){
		Comparator c = new StringComparator();
		list.sort(c);
	}
	
	
}
