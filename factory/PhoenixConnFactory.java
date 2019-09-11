//package com.ttc.faceid.factory;
//
//import com.ttc.faceid.util.config.Constant;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Properties;
//
///**
// * Created by robert on 26/03/2017.
// */
//public class PhoenixConnFactory extends BaseFactory {
//    private static PhoenixConnFactory instance = new PhoenixConnFactory();
//
//    private PhoenixConnFactory() {
//    }
//
//    public static PhoenixConnFactory getInstance() {
//        return instance;
//    }
//
//    public Connection getPhoenixConn(Boolean autoCommit) throws SQLException {
//        Connection conn = DriverManager.getConnection(Constant.PHOENIX_URL);
//        conn.setAutoCommit(autoCommit);
//        return conn;
//    }
//
//    public Connection getPhoenixConn(Boolean autoCommit, String tenantId) throws SQLException {
//        Properties pros = new Properties();
//        pros.setProperty("TenantId", tenantId);
//        Connection conn = DriverManager.getConnection(Constant.PHOENIX_URL, pros);
//        cLogger.debug("Connect successfully to " + Constant.PHOENIX_URL);
//        conn.setAutoCommit(autoCommit);
//        return conn;
//    }
//
//
//    public void releaseConn(Connection conn) {
//        try {
//            if (conn != null) {
//                conn.close();
//            }
//        } catch (SQLException e) {
//            eLogger.error("ERROR closing conn PhoenixConnFactory", e);
//        }
//    }
//}
