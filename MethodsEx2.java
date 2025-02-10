//Methods with "Parameters"
//This program is also an example for "Method Overloading"

class Ex{
    //instance variables
    int a;
    int b;
    //instance methods
    void add(){
        System.out.println(a);
    }
    void add(int a){
        System.out.println(a+2);
    }
    void add(float a){
        System.out.println(a+3.2);
    }
    void add(float a, float b){
        System.out.println(a+b);
}
}


public class MethodsEx2 {
    public static void main(String[] args){
    int p = 2;
    int q = 3;
    Ex obj = new Ex();
    obj.a = p;
    obj.b = q;
    obj.add();
    obj.add(1);
    obj.add(1.2f);
    obj.add(2.3f,6.4f);
    }
}
