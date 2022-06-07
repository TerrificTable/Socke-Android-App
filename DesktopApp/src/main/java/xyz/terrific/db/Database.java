package xyz.terrific.db;

import xyz.terrific.utils.DatabaseUtils;

import java.sql.Connection;

public class Database {

    public Database() {  }

    public Connection connect() {
        return DatabaseUtils.Companion.connect();
    }

    public void disconnect(Connection conn) {
        if (conn == null) return;
        DatabaseUtils.Companion.disconnect(conn);
    }

}
