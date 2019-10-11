package com.ttc.faceid.base;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by tudv on 2019/09/14
 */
public abstract class BaseService extends Base {
    protected void releaseConn(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            eLogger.error("ERROR closing conn ", e);
        }
    }
}
