package xyz.terrific.gui.notification

import xyz.terrific.gui.tray.Tray
import java.awt.TrayIcon

class DisplayNotification {
    constructor(name: String, message: String) {
        this.display(name, message)
    }

    constructor(message: String) {
        this.display("", message)
    }


    private fun display(name: String, message: String) {
        Tray.trayIcon.displayMessage(
            xyz.terrific.Main.appName + (if (name.isEmpty()) "" else (" - $name")),
            message,
            TrayIcon.MessageType.INFO
        )
    }
}
