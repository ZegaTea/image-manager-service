package com.ttc.faceid.factory;

import com.ttc.faceid.base.BaseFactory;
import com.ttc.faceid.util.config.Constant;
import org.apache.commons.dbcp2.BasicDataSource;


public class MysqlConnFactory extends BaseFactory {

	private static BasicDataSource dataSource;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (Exception e) {
			eLogger.error("can't load mysql driver", e);
		}
	}

	public static BasicDataSource getDataSource() {

		if (dataSource == null) {
			dataSource = new BasicDataSource();
			dataSource.setUrl(Constant.MYSQL_URL);
			dataSource.setUsername(Constant.MYSQL_USER);
			dataSource.setPassword(Constant.MYSQL_PASSWORD);
			dataSource.setInitialSize(Constant.MYSQL_POOL_INITIAL_SIZE);
			dataSource.setMinIdle(Constant.MYSQL_POOL_MIN_IDLE);
			dataSource.setMaxIdle(Constant.MYSQL_POOL_MAX_IDLE);
			dataSource.setDefaultAutoCommit(true);
		}

		return dataSource;
	}
}