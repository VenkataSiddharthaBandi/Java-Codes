// Program to demonstrate Flow Layout using Button in java

import java.awt.*;

public class FlowLayoutEx extends Frame{
    public static void main(String[] args){
        FlowLayoutEx f = new FlowLayoutEx();
        f.setSize(400,400);
        f.setVisible(true);

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT,10,20);
        f.setBackground(Color.blue);
        f.setLayout(fl);
        Button b1 = new Button("Red");
        f.add(b1);
        Button b2 = new Button("Brown");
        f.add(b2);
        Button b3 = new Button("Green");
        f.add(b3);
        Button b4 = new Button("Violet");
        f.add(b4);
        Button b5 = new Button("Grey");
        f.add(b5);
        
    }
}