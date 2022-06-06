package utils

import Resources
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*


class DatabaseUtils {
    companion object {

        fun connect() {
            try{

                val connConfig = Properties()
                connConfig.setProperty("user",      Resources.DB_USER)
                connConfig.setProperty("password",  Resources.DB_PASS)

                val conn = DriverManager.getConnection(Resources.DB_URL, connConfig)
                Logger.success("DB_Connect", "Successfully connected to: '${Resources.DB_URL}' as '${Resources.DB_USER}'")
            }
            catch (e: SQLException){
                Logger.error("DB_Connect", "Failed to connect: " + e.message);
            }
        }

    }
}
