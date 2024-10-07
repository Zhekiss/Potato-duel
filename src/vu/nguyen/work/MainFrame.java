package vu.nguyen.work;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class MainFrame extends JDialog{
    private JPanel contentPane;
    private JButton buttonCancel;
    private JButton buttonOK;
    private JPanel areaPanel;
    private DrawPanel dp;

    public MainFrame(){
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        dp = new DrawPanel();
        areaPanel.add(dp);
    }

    public static void main(String[] args){
        MainFrame dialog = new MainFrame();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }


}
