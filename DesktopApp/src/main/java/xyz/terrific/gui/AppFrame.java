/*
 * Created by JFormDesigner on Mon Jun 06 17:07:54 CEST 2022
 */

package xyz.terrific.gui;

import xyz.terrific.gui.notification.DisplayNotification;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class AppFrame extends JFrame {
    public AppFrame() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        this.dispose();
        System.exit(0);
    }

    private void thisWindowDeactivated(WindowEvent e) {
        new DisplayNotification("Minimized to tray icon!");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        ResourceBundle bundle = ResourceBundle.getBundle("AppFrame");
        btn_exit = new JButton();

        //======== this ========
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent e) {
                thisWindowDeactivated(e);
            }
        });
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- btn_exit ----
        btn_exit.setText(bundle.getString("AppFrame.btn_exit.text"));
        btn_exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });
        contentPane.add(btn_exit);
        btn_exit.setBounds(755, 410, 110, 35);

        contentPane.setPreferredSize(new Dimension(900, 480));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    public JButton btn_exit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
