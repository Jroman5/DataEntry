package View.Panels;

import javax.swing.*;
import java.awt.*;

public abstract class Panel {
    JPanel mainPanel;
    LayoutManager lm;
    public Panel(){
        this.mainPanel = new JPanel();
        this.lm = new BorderLayout();
        this.mainPanel.setLayout(this.lm);
    }

    public JPanel render(){
        return mainPanel;
    }
}
