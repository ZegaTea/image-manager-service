package com.ttc.faceid.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by tudv on 2019/09/11
 */
public abstract class Base {
    protected static final Logger eLogger = LogManager.getLogger("ErrorLog");
    protected static final Logger logger = LogManager.getLogger("CommonLog");
}
