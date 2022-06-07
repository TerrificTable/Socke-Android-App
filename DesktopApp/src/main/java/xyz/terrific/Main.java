package xyz.terrific;

import xyz.terrific.db.Database;
import xyz.terrific.gui.AppFrame;
import xyz.terrific.gui.tray.Tray;
import xyz.terrific.theme.FrameTheme;
import xyz.terrific.utils.Logger;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;

public class Main {

    public static String appName = "Socke ToDo";

    public static String resourceDir    = "src/main/resources/";
    public static boolean debug;

    public static Connection conn;
    public static Database db;

    public static AppFrame frame;
    public static Logger logger;
    public static SystemTray tray;


    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        logger = new Logger("Main");
        logger.info("Started");

        // ENABLE DEBUG
        toggleDebug();

        // Database
        db = new Database();
        conn = db.connect();

        frame = new AppFrame();
        frame.setTitle(Main.appName);
        // frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


        // Tray Icon
        tray = Tray.Companion.createTray();


        // Connect to database
        conn = db.connect();


        UIManager.setLookAndFeel(new FrameTheme());
        SwingUtilities.updateComponentTreeUI(frame);
        logger.success("JFrame successfully created");


        frame.setVisible(true);
    }

    public static void toggleDebug() {
        debug = !debug;
    }

    public static void setDebug(boolean state) {
        debug = state;
    }
}
