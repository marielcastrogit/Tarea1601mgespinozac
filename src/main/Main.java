
package main;

import javax.swing.JFrame;
import views.MainFrame;


public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mf = new MainFrame();
                mf.setVisible(true);
                mf.setResizable(true);
                //mf.setLocationRelativeTo(null);
                mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }
    }
    
