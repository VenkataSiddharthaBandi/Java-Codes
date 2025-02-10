//Example for call by value

class meth{
    void add(int a,int b){
        System.out.println("a and b values before intiliazing "+ a +"," + b);
        System.out.println("Addition result is " + (a+b));
        a = 42;
        b = 54;
        System.out.println("a and b values after intializing are " + a + "," + b);
        System.out.println("Addition result after intializing a,b values are " + (a+b));
    }
}
public class CallbyvalueEx{
    public static void main(String[] args){
        int p = 2;
        int q = 3;
        meth obj = new meth();
        System.out.println("p and q values before intiliazing :" + p + "," + q);
        obj.add(p,q);
        System.out.println("p and q values after initializing :" + p + "," + q);
    }
}