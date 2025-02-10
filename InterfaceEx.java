// Program to demonstrate Interfaces

interface Ac{
    //static variables
    int a = 3;
    int b = 5;
    //static methods
    void show();
    void add();
}

//We should use implements keyword for subclasses whose parent is an interface
class Bb implements Ac{
    //public access modifier should be used here
    public void show(){
        System.out.println("a and b value is: " + a + "," + b);
    }
    public void add(){
        System.out.println("Addition result is: " + (a+b));
    }
}

public class InterfaceEx {
    public static void main(String[] args){
        Bb obj = new Bb();
        obj.show();
        obj.add();
    }
}
