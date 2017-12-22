package web.common;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import web.common.ConfigSet;

public class ConfigSet {
	
	private static Properties prop = new Properties();
	private static final Log log = LogFactory.getLog(ConfigSet.class);

    static {
       try {    	   
           prop.load(ConfigSet.class.getResourceAsStream("/config/configSet.properties"));
       } catch (Exception e) {
          	log.error("execute ConfigSet() failed:", e);
       }

    }

    public static String getConfig(String confInfo) {
       return (String) prop.get(confInfo);
    }
}
