// Program to demonstrate JComboBox in java

import javax.swing.*;
import java.awt.*;


public class JComboBoxEx extends JFrame{


    JComboBoxEx(){
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
        Container c = this.getContentPane();
        String Countries[] = {"India","UK","US"};
        JComboBox<String> jcb1 = new JComboBox<String>(Countries);
        c.add(jcb1);


    }
    public static void main(String[] args){
        JComboBoxEx f = new JComboBoxEx();
        f.setSize(400,300);
        f.setVisible(true);
    }
}