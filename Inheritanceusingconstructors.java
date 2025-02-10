// Inheritance using constructors example program

class inheritance{
    int p;
    inheritance(){}
    inheritance(int a){
        p = a;
    }
}

class sb extends inheritance{
    int q;
    sb(){}
    sb(int a , int b) {
        p = a;
        q = b;
    }
    void me(){
    System.out.println(p + "," + q);
    }
}

public class Inheritanceusingconstructors{
    public static void main(String[] args){
        sb obj = new sb(1,2);
        obj.me();
    }
}