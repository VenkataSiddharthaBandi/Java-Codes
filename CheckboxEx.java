// Program to demonstrate CheckBox in java45ip/*

import java.awt.*;

import java.awt.event.*;


public class CheckboxEx extends Frame implements ItemListener{
    
    CheckboxEx(){

        FlowLayout fl = new FlowLayout();
        this.setLayout(fl);

        Checkbox c1 = new Checkbox("Telugu");
        this.add(c1);
        c1.addItemListener(this);

        Checkbox c2 = new Checkbox("Hindi");
        this.add(c2);
        c2.addItemListener(this);

        Checkbox c3 = new Checkbox("English");
        this.add(c3);
        c3.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e){
    }
    public static void main(String[] args){
        CheckboxEx f = new CheckboxEx();
        f.setSize(400,300);
        f.setVisible(true);
    }
}


