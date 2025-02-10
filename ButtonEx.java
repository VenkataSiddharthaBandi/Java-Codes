// Program to demonstrate button in java

import java.awt.*;
import java.awt.event.*;

public class ButtonEx extends Frame implements ActionListener{

    ButtonEx(){
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        Button b1 = new Button("Red");
        this.add(b1);
        b1.addActionListener(this);

        Button b2 = new Button("Blue");
        this.add(b2);
        b2.addActionListener(this);

        Button b3 = new Button("Green");
        this.add(b3);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        String backGroundColor = e.getActionCommand();

        if(backGroundColor.equals("Red"))
        this.setBackground(Color.RED);

        if(backGroundColor.equals("Blue"))
        this.setBackground(Color.BLUE);

        if(backGroundColor.equals("Green"))
        this.setBackground(Color.GREEN);
    }
    public static void main(String[] args){
        ButtonEx f = new ButtonEx();
        f.setSize(400,400);
        f.setVisible(true);
    }
}
