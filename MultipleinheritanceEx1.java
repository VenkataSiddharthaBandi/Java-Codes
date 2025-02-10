// Program to demonstrate Multiple Inheritance using Interfaces

interface Ad{
    int a = 1;
}

interface Bd{
    int b = 2;
}

class Cc implements Ad,Bd{
    int c = 3;
    void show(){
        System.out.println("a,b and c values are: " + (a+","+b+","+c));
    }
    void add(){
        System.out.println("Addition result is: " + (a+b+c));
    }
}

public class MultipleinheritanceEx1{
    public static void main(String[] args){
        Cc obj = new Cc();
        obj.show();
        obj.add();
    }
}
