package web.common;

import java.util.UUID;

public class UUIDUtils {
	
	/**
	 * 生成主键UUID且去除"-"的静态方法
	 * @return
	 */
	public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
   }
}
