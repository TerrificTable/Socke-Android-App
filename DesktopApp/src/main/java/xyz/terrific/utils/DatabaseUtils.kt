package utils

import Resources
import java.sql.DriverManager
import java.sql.SQLException

class DatabaseUtils {
    companion object {

        fun connect() {
            try{
                val conn = DriverManager.getConnection(Resources.DB_URL, Resources.DB_USER, Resources.DB_PASS);
                Logger.success("DB_Connect", "Successfully connected to: '${Resources.DB_URL}' as '${Resources.DB_USER}'")
            }
            catch (e: SQLException){
                Logger.error("DB_Connect", "Failed to connect: " + e.message);
            }
        }

    }
}
