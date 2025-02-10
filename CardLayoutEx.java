// Program to demonstrate Card Layout using Buttons in java

import java.awt.*;

public class CardLayoutEx extends Frame{
    public static void main(String[] args){
        CardLayoutEx f = new CardLayoutEx();
        f.setSize(400,400);
        f.setVisible(true);
        f.setBackground(Color.BLUE);

        CardLayout cl = new CardLayout();
        f.setLayout(cl);
        Button b1 = new Button("Red");
        f.add(b1,"Red");
        Button b2 = new Button("Brown");
        f.add(b2,"Blue");
        Button b3 = new Button("Green");
        f.add(b3,"Green");
        Button b4 = new Button("Violet");
        f.add(b4,"Violet");
        Button b5 = new Button("Grey");
        f.add(b5,"Grey");
        cl.previous(f);
        cl.next(f);
        cl.next(f);
        cl.last(f);
        cl.previous(f);
        cl.show(f,"Green");
        
    }
}
