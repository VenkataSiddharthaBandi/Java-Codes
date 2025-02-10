// Program to demonstrate GridBag Layout in java

import java.awt.*;

public class GridBagLayoutEx extends Frame{
    public static void main(String[] args){
        GridBagLayoutEx f = new GridBagLayoutEx();
        f.setSize(400,400);
        f.setVisible(true);
        f.setBackground(Color.BLUE);

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints cons = new GridBagConstraints();
        f.setLayout(gbl);

        cons.gridx = 0;
        cons.gridy = 0;
        
        cons.weightx = 0.50;
        cons.weighty = 0.30;

        Button b1 = new Button("Red");
        gbl.setConstraints(b1,cons);
        f.add(b1);

        cons.gridx = 1;
        cons.gridy = 0;

        Button b2 = new Button("Blue");
        gbl.setConstraints(b2, cons);
        f.add(b2);

        cons.gridx = 0;
        cons.gridy = 1;

        Button b3 = new Button("Green");
        gbl.setConstraints(b3, cons);
        f.add(b3);
        
        cons.gridx = 1;
        cons.gridy = 1;

        Button b4 = new Button("Violet");
        gbl.setConstraints(b4, cons);
        f.add(b4);
        }
}