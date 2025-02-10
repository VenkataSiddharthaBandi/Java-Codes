// Program to demonstrate JTextField, JTextArea, JCheckBox, JRadioButton, JButton in java

import javax.swing.*;
import java.awt.*;

public class SwingComponentsEx extends JFrame{

    SwingComponentsEx(){
        Container c = this.getContentPane();
        this.setLayout(null);

        JLabel nm = new JLabel("Name");
        nm.setBounds(100,100,130,25);
        c.add(nm);

        JTextField jtf = new JTextField();
        jtf.setBounds(250,100,130,35);
        c.add(jtf);

        JLabel ad = new JLabel("Address");
        ad.setBounds(100,200,130,25);
        c.add(ad);

        JTextArea jta = new JTextArea();
        jta.setBounds(250,200,230,140);
        c.add(jta);

        JLabel gd = new JLabel("Gender");
        gd.setBounds(100,400,130,25);
        c.add(gd);

        JRadioButton jrb1 = new JRadioButton("Male");
        jrb1.setBounds(250,400,75,25);
        c.add(jrb1);

        JRadioButton jrb2 = new JRadioButton("Female");
        jrb2.setBounds(335,400,75,25);
        c.add(jrb2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);

        JLabel lan = new JLabel("Languages");
        lan.setBounds(100,500,130,35);
        c.add(lan);

        JCheckBox jcb1 = new JCheckBox("Telugu");
        jcb1.setBounds(250,500,75,25);
        c.add(jcb1);

        JCheckBox jcb2 = new JCheckBox("English");
        jcb2.setBounds(335,500,75,25);
        c.add(jcb2);

    }
    public static void main(String[] args){
        SwingComponentsEx f = new SwingComponentsEx();
        f.setSize(400,300);
        f.setVisible(true);
    }
}
