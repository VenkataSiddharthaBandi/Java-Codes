package package2;

public class A{
    int a = 1;
    public int b = 2;
    protected int c = 3;
    private int d = 4;

    public void show(){
        System.out.println("a,b,c,d values are: " + a+","+b+","+c+","+d);
    }
    public void add(){
        System.out.println("Addition result is: " + (a+b+c+d));
    }


    public A(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


