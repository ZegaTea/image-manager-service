package com.ttc.faceid.util;

import java.io.File;

/**
 * Created by tudv on 2019/10/05
 */
public class FileUtils {
    public static void createDirectory(String directory) {
        File file = new File(directory);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
}
