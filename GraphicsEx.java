// Program to demonstrate Graphics in java

import java.awt.*;

public class GraphicsEx extends Frame{
    public void paint(Graphics g){
        
        g.setColor(Color.GREEN);
        g.drawLine(40,80,130,240);
        g.setColor(Color.BLUE);
        g.drawRect(100,200,230,240);
        g.setColor(Color.MAGENTA);
        g.drawString("Hello",200,230);
        g.setColor(Color.CYAN);
        g.drawOval(300,400,340,240);
        g.setColor(Color.YELLOW);
        g.fillOval(300,400,340,240);
    }
    public static void main(String[] args){
        GraphicsEx f = new GraphicsEx();
        f.setSize(400,400);
        f.setVisible(true);
    }
}