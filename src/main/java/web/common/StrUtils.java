package web.common;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class StrUtils {
	
	 private final static String DES = "DES";

	    private static Pattern emailer;

	    /**
	     * 若为null,则转成"" (source != null) ? source : ""; 等同于Orocle的nvl
	     */
	    public static String nvl(String source) {
	        return (source != null) ? source.trim() : "";
	    }

	    /**
	     * 若为null,则转成指定的字串 (source != null) ? source : ""; 等同于Orocle的nvl
	     */
	    public static String nvl(String source, String defaultString) {
	        return (source != null) ? source.trim() : defaultString;
	    }

	    /**
	     * 将字符串转换成UTF-8编码形式
	     */
	    public static String toUtf8(String src) {
	        byte[] b = src.getBytes();
	        char[] c = new char[b.length];
	        for (int i = 0; i < b.length; i++) {
	            c[i] = (char) (b[i] & 0x00FF);
	        }
	        return new String(c);
	    }

	    /**
	     * 判断一个字符串是否为空，空格作非空处理。 StringUtils.isEmpty(null) = true
	     * StringUtils.isEmpty("") = true StringUtils.isEmpty(" ") = true
	     * StringUtils.isEmpty("bob") = false StringUtils.isEmpty(" bob ") = false
	     * 
	     * @author apache jakarta commons-lang 2.1
	     */
	    public static boolean isEmpty(String str) {
	        return ((str == null) || (str.trim().length() == 0));
	    }

	    /**
	     * 判断一个字符串是否非空，空格作非空处理. StringUtils.isNotEmpty(null) = false
	     * StringUtils.isNotEmpty("") = false StringUtils.isNotEmpty(" ") = false
	     * StringUtils.isNotEmpty("bob") = true StringUtils.isNotEmpty(" bob ") =
	     * true
	     * 
	     * @author apache jakarta commons-lang 2.1
	     */
	    public static boolean isNotEmpty(String str) {
	        return ((str != null) && (str.trim().length() > 0));
	    }

	    /**
	     * 判断一个字符串是否非空，空格作空处理. StringUtils.isNotBlank(null) = false
	     * StringUtils.isNotBlank("") = false StringUtils.isNotBlank(" ") = false
	     * StringUtils.isNotBlank("bob") = true StringUtils.isNotBlank(" bob ") =
	     * true
	     * 
	     * @author apache jakarta commons-lang 2.1
	     */
	    public static boolean isNotBlank(String str) {
	        int strLen;
	        if ((str == null) || ((strLen = str.length()) == 0)) {
	            return false;
	        }
	        for (int i = 0; i < strLen; i++) {
	            if ((!Character.isWhitespace(str.charAt(i)))) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static String trim(String str) {
	        return ((str == null) ? null : str.trim());
	    }

	    /**
	     * 判断是不是一个合法的电子邮件地址
	     * 
	     * @return
	     */
	    public static boolean isEmail(String email) {
	        String check = "^\\w+([-+.]*\\w+)*[-.]*@\\w+([-.]*\\w+)*(\\.\\w+)+$";
	        emailer = Pattern.compile(check);
	        Matcher matcher = emailer.matcher(email);
	        return matcher.matches();
	    }

	    /**
	     * 加密
	     * 
	     * @param src
	     *            数据源
	     * @param key
	     *            密钥，长度必须是8的倍数
	     * @return 返回加密后的数据
	     * @throws Exception
	     */
	    public static byte[] encrypt(byte[] src, byte[] key) throws Exception {
	        // DES算法要求有一个可信任的随机数源
	        SecureRandom sr = new SecureRandom();
	        // 从原始密匙数据创建DESKeySpec对象
	        DESKeySpec dks = new DESKeySpec(key);
	        // 创建一个密匙工厂，然后用它把DESKeySpec转换成
	        // 一个SecretKey对象
	        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
	        SecretKey securekey = keyFactory.generateSecret(dks);
	        // Cipher对象实际完成加密操作
	        Cipher cipher = Cipher.getInstance(DES);
	        // 用密匙初始化Cipher对象
	        cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
	        // 现在，获取数据并加密
	        // 正式执行加密操作
	        return cipher.doFinal(src);
	    }

	    /**
	     * 解密
	     * 
	     * @param src
	     *            数据源
	     * @param key
	     *            密钥，长度必须是8的倍数
	     * @return 返回解密后的原始数据
	     * @throws Exception
	     */
	    public static byte[] decrypt(byte[] src, byte[] key) throws Exception {
	        // DES算法要求有一个可信任的随机数源
	        SecureRandom sr = new SecureRandom();
	        // 从原始密匙数据创建一个DESKeySpec对象
	        DESKeySpec dks = new DESKeySpec(key);
	        // 创建一个密匙工厂，然后用它把DESKeySpec对象转换成
	        // 一个SecretKey对象
	        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
	        SecretKey securekey = keyFactory.generateSecret(dks);
	        // Cipher对象实际完成解密操作
	        Cipher cipher = Cipher.getInstance(DES);
	        // 用密匙初始化Cipher对象
	        cipher.init(Cipher.DECRYPT_MODE, securekey, sr);
	        // 现在，获取数据并解密
	        // 正式执行解密操作
	        return cipher.doFinal(src);
	    }

	    /**
	     * 全角转半角 (如果传入的参数为NULL或""，则直接返回"")
	     * 
	     * @param String
	     *            input
	     */
	    public static String ToDBC(String input) {
	        if (input == null || input.equals("")) {
	            return "";
	        }
	        char[] c = input.toCharArray();
	        for (int i = 0; i < c.length; i++) {
	            if (c[i] == 12288) {
	                c[i] = (char) 32;
	                continue;
	            }
	            if (c[i] > 65280 && c[i] < 65375)
	                c[i] = (char) (c[i] - 65248);
	        }
	        return new String(c).trim();
	    }
	    /**
	     * true:cyclo
	     * false:not cyclo
	     * @param sn
	     * @return
	     */
	    public static boolean checkSNisDigit(String sn){
	    	BigInteger check = null;
			try {
				check = new BigInteger(sn);
			} catch (Exception e) {
				check = null;
			}
	    	if (sn == null || check == null) {
				return false;
			}else{
				return true;
			}
	    }
	    public static String getFullSN(String sn){
			if (!checkSNisDigit(sn) || sn.length() != 11) {
				return sn;
			} else {
				int[] snlist = new int[sn.toCharArray().length];
				int sumEven = 0;
				int sumOdd = 0;
				for (int i = 0; i < sn.toCharArray().length; i++) {
					snlist[i] = Integer.parseInt(String.valueOf(sn.charAt(i)));
					if (i % 2 == 0) {
						sumEven = sumEven + snlist[i];
					} else {
						sumOdd = sumOdd + snlist[i];
					}
				}
				int last = (10 - ((sumEven * 3 + sumOdd) % 10)) % 10;
				return sn + last;
			}
		}
}
