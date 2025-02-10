// Hierarichal Inheritance example program

// Class A is parent class B
class Hierarichalinheritance{
    int a;
    Hierarichalinheritance(){}
    Hierarichalinheritance(int a){
    }
}

// Class B is sub class of class A
class sub extends Hierarichalinheritance{
    int b;
    sub(){}
    sub(int a,int b){
        this.a = a;
        this.b = b;
    }
    void s(){
        System.out.println(a + "," + b);
    }
}

// Class C is sub class of class A
class sub1 extends Hierarichalinheritance{
    int c;
    sub1(){}
    sub1(int a,int c){
        this.a = a;
        this.c = c;
    }
    void s1(){
        System.out.println(a + "," + c);
    }
}


public class HierarichalinheritanceEx{
    public static void main(String[] args){
        sub obj = new sub(1,2);
        obj.s();
        sub1 obj1 = new sub1(1,3);
        obj1.s1();
    }
}