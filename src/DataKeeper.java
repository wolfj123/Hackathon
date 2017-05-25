
public class DataKeeper implements Comparable{
	
	private String orig;
	private String ans;
	private SecretHash hash;
	
	public DataKeeper (String orig){
		this.orig = orig;
		hash = new SecretHash();
		hash.setDifficulty(1);
		ans = hash.secretHash(orig);
	}
	
	public String getAns() {
		return ans;
	}
	public String getOrig() {
		return orig;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public void setOrig(String orig) {
		this.orig = orig;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	

}
