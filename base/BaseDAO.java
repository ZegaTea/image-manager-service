package com.ttc.faceid.base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by tudv on 2019/09/11
 */
public abstract class BaseDAO extends Base {
    protected void releaseResource(PreparedStatement ps, ResultSet rs) {
        try {
            if (ps != null) {
                ps.clearBatch();
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {

        }
    }

    protected void releaseConn(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            eLogger.error("ERROR closing conn ", e);
        }
    }

    protected abstract Connection getConnection(boolean autoCommit);

    protected abstract Connection getConnection();
}
