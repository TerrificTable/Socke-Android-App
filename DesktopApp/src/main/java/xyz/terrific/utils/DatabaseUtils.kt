package xyz.terrific.utils

import Resources
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*


class DatabaseUtils {
    companion object {

        private fun connMariaDB(connConfig: Properties): Connection {
            Class.forName("org.mariadb.jdbc.Driver").newInstance()
            return DriverManager.getConnection(Resources.DB_URL, connConfig)
        }
        private fun connMySQL(connConfig: Properties): Connection {
            Class.forName("com.mysql.jdbc.Driver").newInstance()
            return DriverManager.getConnection(Resources.DB_URL, connConfig)
        }

        fun connect(): Connection? {
            try{

                val connConfig = Properties()
                connConfig.setProperty("user",      Resources.DB_USER)
                connConfig.setProperty("password",  Resources.DB_PASS)

                val conn: Connection?
                if (Resources.DB_URL.contains("mariadb"))
                    conn = connMariaDB(connConfig)
                else if (Resources.DB_URL.contains("mysql"))
                    conn = connMySQL(connConfig)
                else
                    conn = null

                Logger.success("DB_Connect", "Successfully connected to: '${Resources.DB_URL}' as '${Resources.DB_USER}'")
                return conn

            } catch (e: SQLException){
                Logger.error("DB_Connect", "Failed to connect: " + e.message)
                return null
            }
        }

        fun disconnect(conn: Connection): Boolean {
            try {
                conn.close()
            } catch (e: Exception) {
                return false
            }
            return conn.isClosed
        }

    }
}
