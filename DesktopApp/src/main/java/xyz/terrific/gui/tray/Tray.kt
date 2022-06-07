package xyz.terrific.gui.tray

import xyz.terrific.Main
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.ImageIcon

class Tray {
    companion object {

        lateinit var trayIcon: TrayIcon

        fun createTray(): SystemTray? {
            if (SystemTray.isSupported()) {
                val tray = SystemTray.getSystemTray()
                val popup = PopupMenu(Main.appName)
                val menuExit = MenuItem("Quit")
                val image = ImageIcon(Main.resourceDir + "images/icon.png").image
                trayIcon = TrayIcon(image, "My program", popup)

                val mouseListener: MouseListener = object : MouseListener {
                    override fun mouseClicked(e: MouseEvent) {
                        if (e.button == MouseEvent.BUTTON1) {
                            Main.frame.isVisible = true
                        }
                    }

                    override fun mouseEntered(e: MouseEvent) {}
                    override fun mouseExited(e: MouseEvent) {}
                    override fun mousePressed(e: MouseEvent) {}
                    override fun mouseReleased(e: MouseEvent) {}
                }
                val exitListener = ActionListener { e: ActionEvent? ->
                    Main.frame.dispose()
                    Main.db.disconnect(Main.conn)
                    System.exit(0)
                }

                menuExit.addActionListener(exitListener)
                popup.add(menuExit)
                trayIcon.isImageAutoSize = true
                trayIcon.addMouseListener(mouseListener)

                try {
                    tray.add(trayIcon)
                } catch (e: AWTException) {
                    Main.logger.error("TrayIcon could not be added.")
                }

                return tray;
            }

            return null;
        }

    }
}
