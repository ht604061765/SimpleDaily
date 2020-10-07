package com.hunter.base.common.utils;

import java.util.UUID;

/**
 * @author Administrator
 * @date 2020/10/7
 **/
public class RandomUtils {

    public static String getUUID() {
        UUID id = UUID.randomUUID();        return id.toString().replace("-", "");

    }

}
