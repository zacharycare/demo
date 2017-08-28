package com.nageu.base.util;

import java.io.InputStream;
import java.util.Properties;

public class CommonUtils {
    /**
     * @apiNote 获取properties文件中key对应的value
     * @param Key key
     * @return
     */
    public static String getPropertiesValue(String Key){
        String value = null;
        try {
            Properties properties = new Properties();
            InputStream is = CommonUtils.class.getResourceAsStream(Constants.SYSCONFIG_PROPERTIES);
            properties.load(is);
            value = properties.getProperty(Key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value==null||"".equals(value)?null:value.trim();
    }
}
