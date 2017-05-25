
public class DataKeeper {
	
	private String orig;
	private String ans;
	private SecretHash hash;
	
	public DataKeeper (string orig){
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

}
