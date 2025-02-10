// Program to demonstrate JButton in java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JComponentsEx extends JFrame implements ActionListener {

    JButton jb1;
    JLabel jl1;

    JComponentsEx(){
        
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
        Container c = this.getContentPane();
        
        jl1 = new JLabel();
        c.add(jl1);
        

        jb1 = new JButton("Click me");
        jb1.addActionListener(this);
        c.add(jb1);
    }

    public void actionPerformed(ActionEvent e){
        jl1.setText("Button clicked at " + new Date());
    }
    public static void main(String[] args){
        JComponentsEx f = new JComponentsEx();
        f.setSize(400,300);
        f.setVisible(true);
    }
}
