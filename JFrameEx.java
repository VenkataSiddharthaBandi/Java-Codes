// Program to demonstrate creating an JFrame in java

import javax.swing.*;
import java.awt.*;

public class JFrameEx{
    public static void main(String[] args){
        JFrame f = new JFrame("My Swing");
        f.setSize(400,300);
        f.setVisible(true);

        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        Container c = f.getContentPane();
        JButton b1 = new JButton("Click me");
        c.add(b1);
    }
}