// Program to demonstrate JMenuBar in java

import javax.swing.*;
import java.awt.*;

public class JMenuBarEx extends JFrame{

    JMenuBarEx(){
        BorderLayout bl = new BorderLayout();
        this.setLayout(bl);
        Container c = this.getContentPane();

        JMenuBar jmb = new JMenuBar();
        c.add("North",jmb);
        JMenu fl = new JMenu("File");
        jmb.add(fl);
        JMenu ed = new JMenu("Edit");
        jmb.add(ed);

        JMenuItem n = new JMenuItem("New");
        JMenuItem o = new JMenuItem("Open");
        JMenuItem s = new JMenuItem("Save");

        fl.add(n);
        fl.add(o);
        fl.add(s);

        JMenuItem ct = new JMenuItem("Cut");
        JMenuItem cp = new JMenuItem("Copy");
        JMenuItem ps = new JMenuItem("Paste");

        ed.add(ct);
        ed.add(cp);
        ed.add(ps);
    }
    public static void main(String[] args){
        JMenuBarEx f = new JMenuBarEx();
        f.setSize(400,300);
        f.setVisible(true);
    }
}