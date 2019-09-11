package com.ttc.faceid.util.config;

import com.ttc.faceid.util.ConfigurationManager;

/**
 * Created by tudv on 2019/09/11
 */
public class Constant {
    public static int SERVICE_PORT = ConfigurationManager.getInstance().getInt("server.port");

    public static String PHOENIX_URL = ConfigurationManager.getInstance().getString("phoenix.url");

    public static String MYSQL_URL = ConfigurationManager.getInstance().getString("mysql.url");
    public static String MYSQL_USER = ConfigurationManager.getInstance().getString("mysql.user");
    public static String MYSQL_PASSWORD = ConfigurationManager.getInstance().getString("mysql.pass");
    public static int MYSQL_POOL_INITIAL_SIZE = ConfigurationManager.getInstance().getInt("mysql.pool.initial.size");
    public static int MYSQL_POOL_MIN_IDLE = ConfigurationManager.getInstance().getInt("mysql.pool.min.idle");
    public static int MYSQL_POOL_MAX_IDLE = ConfigurationManager.getInstance().getInt("mysql.pool.max.idle");

}
