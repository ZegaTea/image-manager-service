package com.ttc.faceid.util;

import java.util.Base64;
import java.util.zip.CRC32;

/**
 * Created by tudv on 2019/09/27
 */
public class EncryptUtils {

    public static String crc32Data(String input) {
        CRC32 crc32 = new CRC32();
        crc32.update(input.getBytes());
        return Long.toHexString(crc32.getValue());
    }

    public static String decodeString(String data) {
        byte[] decodedBytes = Base64.getDecoder().decode(data);
        String dataDecode = new String(decodedBytes);
        return dataDecode;
    }
}
