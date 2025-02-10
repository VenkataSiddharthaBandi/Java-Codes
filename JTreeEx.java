// Program to demonstrate JTree in java

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;

public class JTreeEx extends JFrame{

    JTreeEx(){
        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        Container c = this.getContentPane();

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Object");
        DefaultMutableTreeNode comp = new DefaultMutableTreeNode("Component");
        root.add(comp);
        DefaultMutableTreeNode cont = new DefaultMutableTreeNode("Container");
        comp.add(cont);
        JTree t = new JTree(root);
        c.add(t);
    }
    public static void main(String[] args){
        JTreeEx f = new JTreeEx();
        f.setSize(400,300);
        f.setVisible(true);
    }
}
