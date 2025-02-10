// Program to demonstrate Building an User Reg Form using Label, TextField, TextArea, Choices, 

import java.awt.*;

public class RegFormEx extends Frame{

    Label l1,l2,l3,l4,l5;
    TextField tf1,tf2;
    TextArea ta1;
    Choice ch1;
    List lt1;

    RegFormEx(){
        this.setLayout(null);
        l1 = new Label("Name");
        l1.setBounds(30,30,80,20);
        this.add(l1);

        tf1 = new TextField("Enter name",20);
        tf1.setBounds(150,30,80,20);
        this.add(tf1);

        l2 = new Label("Password");
        l2.setBounds(30,80,80,20);
        this.add(l2);

        tf2 = new TextField("Enter pass",20);
        tf2.setBounds(150,80,80,20);
        this.add(tf2);

        l3 = new Label("Address");
        l3.setBounds(30,120,80,20);
        this.add(l3);

        ta1 = new TextArea(" ",50,50,TextArea.SCROLLBARS_BOTH);
        ta1.setBounds(150,120,80,80);
        this.add(ta1);

        l4 = new Label("Country");
        l4.setBounds(30,200,80,20);
        this.add(l4);

        ch1 = new Choice();
        ch1.add("India");
        ch1.add("USA");
        ch1.add("UK");
        ch1.add("AUSTRALIA");
        ch1.setBounds(150,220,80,80);
        this.add(ch1);

        l5 = new Label("Hobbies");
        l5.setBounds(30,270,80,20);
        this.add(l5);

        lt1 = new List(3,true);
        lt1.add("Reading Books");
        lt1.add("Surfing Internet");
        lt1.add("Playing Games");
        lt1.setBounds(150,270,90,40);
        this.add(lt1);
    }
    
    public static void main(String[] args){
        RegFormEx f = new RegFormEx();
        f.setSize(400,300);
        f.setVisible(true);
    }
}