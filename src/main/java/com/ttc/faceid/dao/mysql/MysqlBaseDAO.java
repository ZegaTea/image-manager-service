package com.ttc.faceid.dao.mysql;

import com.ttc.faceid.base.BaseDAO;
import com.ttc.faceid.factory.MysqlConnFactory;

import java.sql.Connection;

/**
 * Created by tudv on 2019/08/28
 */
public abstract class MysqlBaseDAO extends BaseDAO {

    @Override
    protected Connection getConnection(boolean autoCommit) {
        try {
            return MysqlConnFactory.getDataSource().getConnection();
        } catch (Exception e) {
            eLogger.error("error when get connection", e);
            return null;
        }
    }

    @Override
    protected Connection getConnection() {
        return getConnection(true);
    }
}
