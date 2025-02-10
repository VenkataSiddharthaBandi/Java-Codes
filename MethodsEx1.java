//Methods with no parameters

class methods{
    //creating instance variables
    int a;
    int b;
    //creating instance methods
    void add(){
        System.out.println("Addition result is " + (a+b));
    }
    void mul(){
        System.out.println("Multiplication result is " + (a*b));
    }
}
//Driver class
public class MethodsEx1 {
    public static void main(String[] args){
        int p = 2;
        int q = 3;
        methods obj = new methods();
        obj.a = p;
        obj.b = q;
        obj.add();
        obj.mul();
    }
}
