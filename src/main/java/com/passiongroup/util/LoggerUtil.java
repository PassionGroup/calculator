package com.passiongroup.util;

import org.apache.log4j.Logger;

/**
 * Created by longhuai.hlh on 2016/11/29.
 */
public class LoggerUtil {
    private static final Logger LOGGER = Logger.getLogger("Calculator");

    public static void info(String message){
        LOGGER.info(message);
    }
    public static void warn(String message){
        LOGGER.warn(message);
    }
    public static void error(String message){
        LOGGER.error(message);
    }
}
