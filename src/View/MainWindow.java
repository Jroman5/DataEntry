package View;

import View.Panels.HomePanel;

import javax.swing.*;

public class MainWindow {
    private JFrame frame;
    public MainWindow() {
        frame = new JFrame("DataEntry");
        //button = new JButton("ok");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.getContentPane().add(new HomePanel().render());
        frame.setVisible(true);
    }

}
