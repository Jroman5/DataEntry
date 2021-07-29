package View.Panels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class HomePanel extends Panel{
    LayoutManager nestedLM;
    JPanel nestedPanel;
    JButton masCuenta;
    JButton mujerAmujer;
    JLabel center;
    JLabel north;
    JLabel south;
    JLabel east;
    public HomePanel(){
        super();
        this.nestedPanel = new JPanel();
        this.nestedLM = new BoxLayout(nestedPanel, BoxLayout.Y_AXIS);
        this.nestedPanel.setLayout(nestedLM);
        this.mainPanel.add(nestedPanel, BorderLayout.WEST);
        this.masCuenta = new JButton("Mas Cuenta");
        this.mujerAmujer = new JButton("Mujer a Mujer");
        this.nestedPanel.add(masCuenta);
        this.nestedPanel.add(mujerAmujer);
        this.nestedPanel.setVisible(true);

        this.center = new JLabel("Center");
        this.east = new JLabel("East");
        this.north = new JLabel("North");
        this.south = new JLabel("South");

        this.mainPanel.add(this.south, BorderLayout.SOUTH);
        this.mainPanel.add(this.east, BorderLayout.EAST);
        this.mainPanel.add(this.north,BorderLayout.NORTH);
        this.mainPanel.add(this.center,BorderLayout.CENTER);


    }
    public JPanel render() {
        return mainPanel;
    }
}
