package web.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class PasswordHelper {
	
	 /**
     * 通过MD5转换后的字符串
     * @param args
     * @return 
     */
    public static  String encryptCode(String args) {
        String str = "";
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(args.getBytes());
            str = new String(byte2hexWEU(messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return str;
    }
    private static String byte2hexWEU(byte[] b){
        String hs="";
        String stmp="";
        for (int n=0; n<b.length; n++){
            stmp=(java.lang.Integer.toHexString(b[n] & 0xFF));
            if (stmp.length()==1) hs=hs+"0"+stmp;
                else hs=hs+stmp;
        }
        return hs;
    }
    
    /**
     * 
     * @param code 
     * @param prefix > if the password is new, just put "",otherwise put the encrypted password's suffix
     * @return 
     */
     public static String ssoEncrypt(String code,String prefix){
     	String encryStr = "";
     	try {
     		if(prefix == null || prefix.isEmpty()){
     			prefix = encryptCode(getCharAndNumr(10)).substring(0, 2);
     		}
         	encryStr =  encryptCode(prefix+code)+":"+prefix;
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		return encryStr;
     	
     }
 	public static String getCharAndNumr(int length) {
 		String val = "";
 		Random random = new Random();
 		for (int i = 0; i < length; i++) {
 			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num"; //letter or number
 			if ("char".equalsIgnoreCase(charOrNum)) // string
 			{
 				int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; // capital letters or small letters
 				val += (char) (choice + random.nextInt(26));
 			} else if ("num".equalsIgnoreCase(charOrNum)) //number
 			{
 				val += String.valueOf(random.nextInt(10));
 			}
 		}
 		return val;
 	}
}
