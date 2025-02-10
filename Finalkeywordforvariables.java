// Program to demonstrate "final" keyword in java

// Using final keyword to declare variables as constants

class Aa{
    final int a = 10;
    
    /* After declaring any constant as an final we cant change its value
    If we try to change its value then it may return an error statement*/

    void show(){
        System.out.println("a value is: " + a);
    }

}


public class Finalkeywordforvariables {
    public static void main(String[] args){
        Aa obj = new Aa();
        obj.show();
    }

}
