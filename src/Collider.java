import java.util.HashMap;
import java.util.Map;

public class Collider {
	
	String id = "105";
	SecretHash hasher;
	
	
	public Collider(){
		hasher = new SecretHash();
	}
	
	
	public void collide(String prefix, int difficulty){
		hasher.setDifficulty(difficulty);
		Map<String,String> map = new HashMap<String,String>();
		
		boolean foundMatch = false;
		String input=prefix+id;
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
	
	
	public double getBirthday(int length){
		return Math.pow(2, Math.pow(16,length));
	}
	
	
	public static void print(String s){
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		Collider col = new Collider();
		col.collide("3CA848", 0);
		
		
		
		/*
		String s1 = "hackathon1054B98F9";
		String s2 = "hackathon10554FC70";
		
		print(col.testString(s1,s2).toString());
		*/
	}

	private Boolean testString(String s1, String s2){

		String output1 = hasher.secretHash(s1);
		String output2 = hasher.secretHash(s2);
		print(output1);print(output2);
		return output1.equals(output2);
	}
	
}
