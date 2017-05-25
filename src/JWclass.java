import java.util.ArrayList;
import java.util.Comparator;

public class JWclass {

	public static void main(String[] args) {
		SecretHash hash = new SecretHash();
		hash.setDifficulty(0);
		String s1 = hash.secretHash("hackathon");
		String s2 = hash.secretHash("hackathon105");
		String s3 = hash.secretHash("hackathon105aaa");
	
		print(s1);
		print(s2);
		print(s3);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(s1);list.add(s2);list.add(s3);
		
		list.sort(new StringComparator());
		
		
		print(list.get(0));
	}
	
	public static void print(String s){
		System.out.println(s);
	}
	
	
	
	public void sortStringArray(ArrayList<String> list){
		Comparator c = new StringComparator();
		list.sort(c);
	}
	
	
}
