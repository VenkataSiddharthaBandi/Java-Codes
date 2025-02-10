// Multiple Inheritance using interfaces with one parent as an class and remaining as interfaces

class Ae{
    int a = 1;
}

interface Be{
    int b = 2;
}

interface C{
    int c = 3;
}

class D extends Ae implements Be,C{
    int d = 4;
    public void show(){
        System.out.println("a,b and c values are: " + (a+","+b+","+c+","+d));
    }
    void add(){
        System.out.println("Addition result is: " + (a+b+c+d));
    }
}

public class MultipleinheritanceEx2{
    public static void main(String[] args){
        D obj = new D();
        obj.show();
        obj.add();
    }
}
