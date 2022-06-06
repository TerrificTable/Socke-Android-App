package xyz.terrific;

import gui.AppFrame;
import utils.Logger;
import xyz.terrific.theme.FrameTheme;

import javax.swing.*;

public class Main {

    public static AppFrame frame        = new AppFrame();
    public static String resourceDir    = "src/main/resources/";
    public static Logger logger;


    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        logger = new Logger("Main");
        logger.info("Started");

        frame.setTitle("Socke ToDo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false);
        // frame.setIconImage(new ImageIcon(resourceDir + "images/icon.png").getImage());


        UIManager.setLookAndFeel(new FrameTheme());
        SwingUtilities.updateComponentTreeUI(frame);
        logger.success("JFrame successfully created");


        frame.setVisible(true);
    }
}
