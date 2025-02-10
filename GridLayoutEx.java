// Program to demonstrate Grid Layout using Buttons in java

import java.awt.*;

public class GridLayoutEx extends Frame{
    public static void main(String[] args){
        GridLayoutEx f = new GridLayoutEx();
        f.setSize(400,400);
        f.setVisible(true);
        f.setBackground(Color.BLUE);

        GridLayout gl = new GridLayout(3,2,12,24);
        f.setLayout(gl);
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