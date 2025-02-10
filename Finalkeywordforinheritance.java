// Program to demonstrate "final" keyword for creating an class that avoids creating an Sub Classes-Inheritance

final class Ab{

    /* Here we have declared the above class using the final keyword
       So if we try to create an sub class for this it will return an error message */

    int a = 2;
    void show(){
        System.out.println("a value is: " + a);
    }
}


public class Finalkeywordforinheritance {
    public static void main(String[] args){
        Ab obj = new Ab();
        obj.show();
    }
}
