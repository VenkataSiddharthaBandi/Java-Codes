// Program to demonstrate JSplitPane in java

import javax.swing.*;
import java.awt.*;

public class JSplitPaneEx extends JFrame{

    JSplitPaneEx(){
        Container c = this.getContentPane();

        JButton jb = new JButton("Click me");
        JCheckBox jcb = new JCheckBox("Button Clicked");
        JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jb,jcb);
        c.add(jsp);
    }
    public static void main(String[] args){
        JSplitPaneEx f = new JSplitPaneEx();
        f.setSize(400,300);
        f.setVisible(true);
        
    }
}