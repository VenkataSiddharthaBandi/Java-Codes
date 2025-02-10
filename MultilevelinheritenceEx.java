// Multiple Inheritance example program

// Class A parent class of class B
class multilevelnheritance{
    int p;
}

// Class B parent class of Class C
class sb1 extends multilevelnheritance{
    int q;
}

// Class C sub class of class B
class sub2 extends sb1{
    int r;
    sub2(int a,int b,int c){
        p = a;
        q = b;
        r = c;
    }
    void add(){
        System.out.println("p,q and r values are: " +p+","+q+","+r);
        System.out.println("sum is: " + (p+q+r));
    }
}

// Driver class
public class MultilevelinheritenceEx{
    public static void main(String[] args){
        sub2 obj = new sub2(1, 2, 3);
        obj.add();
    }
    
}