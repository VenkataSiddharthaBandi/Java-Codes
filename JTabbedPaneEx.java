// Program to demonstrate JTabbedPane in java

import javax.swing.*;
import java.awt.*;

public class JTabbedPaneEx extends JFrame{

    JTabbedPaneEx(){

        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);
        
        JTabbedPane jtp1 = new JTabbedPane(JTabbedPane.TOP);
        jtp1.add("One",new Home());
        jtp1.add("Two",new View());
        this.add(jtp1);
    }

    public static void main(String[] args){
        JTabbedPaneEx f = new JTabbedPaneEx();
        f.setSize(400,300);
        f.setVisible(true);
    }

    class Home extends JPanel{
        Home(){
            JButton jb1 = new JButton("ClickBoard");
            JButton jb2 = new JButton("Image");
            JButton jb3 = new JButton("Tools");
            JButton jb4 = new JButton("Shapes");
            JButton jb5 = new JButton("Colors");

            this.add(jb1);
            this.add(jb2);
            this.add(jb3);
            this.add(jb4);
            this.add(jb5);
        }
    }

    class View extends JPanel{
        View(){
            JButton jb1 = new JButton("Zoom");
            JButton jb2 = new JButton("Show or Hide");
            JButton jb3 = new JButton("Display");

            this.add(jb1);
            this.add(jb2);
            this.add(jb3);
        }
    }
}