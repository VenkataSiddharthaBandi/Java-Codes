// Program to demonstrate JTable in java

import javax.swing.*;
import java.awt.*;

public class JTableEx extends JFrame{

    JTableEx(){
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        Container c = this.getContentPane();

        String rows[][] = {{"1","Siddhartha","19"},{"2","Chetan","20"}};
        String cols[] = {"Sno","Name","Age"};
        JTable jt1 = new JTable(rows,cols);
        JScrollPane jsp = new JScrollPane(jt1);
        c.add(jsp);
    }
    public static void main(String[] args){
        JTableEx f = new JTableEx();
        f.setSize(400,300);
        f.setVisible(true);
    }
}