
	import java.security.MessageDigest;
	import java.util.Scanner;
	
	
	public class SecretHash {
	
		private int difficulty =0;
		private int length = 3;
		private int shortner=0xFF;
	 
	
	    
	    public String secretHash(String data) {
	
	        String result = null;
	
	        try {
	
		    //Get SHA256(data) as bytes
	            MessageDigest digest = MessageDigest.getInstance("SHA-256");
	            byte[] hash = digest.digest(data.getBytes("UTF-8"));
	            
	            //???
	            byte[] shortHash = new byte[length];
	            for (int i=0;i<length;i++)
	            	shortHash[i]=hash[i];

	            shortHash[length-1]&=shortner;///???	
	            
	            
	            return bytesToHex(shortHash); // make it printable by transforming from bytes to hexidecimal.
	
	        }catch(Exception ex) {
	
	            ex.printStackTrace();
	
	        }
	
	        return result;
	    }
	    
	    /**
	    *  Changes representation from bytes to hexidecimal. 
	    **/
	    public String bytesToHex(byte[] bytes) 
	    {
	        final char[] hexArray = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	        char[] hexChars = new char[bytes.length * 2];
	        int v;
	        for ( int j = 0; j < bytes.length; j++ ) {
	            v = bytes[j] & 0xFF;
	            hexChars[j * 2] = hexArray[v >>> 4];
	            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
	        }
	        return new String(hexChars);
	    }
	    
	    
	    /**
	    *	Sets the difficulty
	    **/
	    public void setDifficulty(int d)
	    {
		difficulty=d;
	        switch(difficulty)
	        {
		case 0:
		      length=3;
		      shortner=0xFF;
		      break;
		case 1:
		      length=5;
		      shortner=0xFF;
		      break;
		case 2:
		      length=6;
		      shortner=0x80;
		      break;
		case 3:
		      length=6;
		      shortner=0xC0;
		      break;
		case 4:
		      length=6;
		      shortner=0xE0;
		      break;
		case 5:
		      length=6;
		      shortner=0xF0;
		      break;
		case 6:
		      length=6;
		      shortner=0xF8;
		      break;
		case 7:
		      length=6;
		      shortner=0xFC;
		      break;
		case 8:
		      length=6;
		      shortner=0xFE;
		      break;
		case 9:
		      length=6;
		      shortner=0xFF;
		      break;
		case 10:
		default:
		      length=7;
		      shortner=0xFF;
		      break;
	        }
	    }
}
