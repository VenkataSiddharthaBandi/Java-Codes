import java.awt.*;
import java.awt.event.*;

public class ListenerEx {
    public static void main(String[] args){
        Frame f = new Frame("Reg Form");
        f.setSize(400,400);
        f.setVisible(true);

        f.addWindowListener(new MyListener());
    }
}

class MyListener implements WindowListener{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public void windowActivated(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
}