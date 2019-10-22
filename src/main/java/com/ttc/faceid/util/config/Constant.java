package com.ttc.faceid.util.config;

import com.ttc.faceid.util.ConfigurationManager;

/**
 * Created by tudv on 2019/09/11
 */
public class Constant {
    public static int SERVICE_PORT = ConfigurationManager.getInstance().getInt("server.port");

    public static String PHOENIX_URL = ConfigurationManager.getInstance().getString("phoenix.url");

    public static String IMAGE_STORAGE = ConfigurationManager.getInstance().getString("image.storage");
    public static String IMAGE_ROOT_DIR = ConfigurationManager.getInstance().getString("image.rootDir");

}
