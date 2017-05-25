import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collider {
	
	String id = "105";
	SecretHash hasher;
	
	
	public Collider(){
		hasher = new SecretHash();
	}
	
	
	public void collide(String prefix, int difficulty){
		collide(prefix,difficulty, "");
	}
	
	public void collide(String prefix, int difficulty, String init){
		hasher.setDifficulty(difficulty);
		Map<String,String> map = new HashMap<String,String>();
		
		boolean foundMatch = false;
		String input=prefix+id+init;
		String output="";
		
		while(!foundMatch){
			output = hasher.secretHash(prefix+id+input);
			
			foundMatch = map.containsKey(output); 	
			
			if(foundMatch){
				print(prefix+id+input);
				print(prefix+id+map.get(output));
			}
			else{
				map.put(output, input);
			}
			input=output;		
		}
	}
	
	
	public static void print(String s){
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		
		Scanner MyScanner = new Scanner(System.in);
		Collider collider = new Collider();
		
		while(true){
			print("What is the Prefix?");
			String prefix = MyScanner.next();
			
			print("What is the Difficulty?");
			int diff = MyScanner.nextInt();
			collider.collide(prefix, diff);
		}
		
		
	}

	private Boolean testString(String s1, String s2){

		String output1 = hasher.secretHash(s1);
		String output2 = hasher.secretHash(s2);
		print(output1);print(output2);
		return output1.equals(output2);
	}
	
}
