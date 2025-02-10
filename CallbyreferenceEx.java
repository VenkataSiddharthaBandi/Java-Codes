// Call by reference Example
class hello{
    int v1;
    int v2;
    void check(hello obj){
        obj.v1 = 6;
        obj.v2 = 8;
    }
}

public class CallbyreferenceEx{
    public static void main(String[] args){
        hello obj = new hello();
        obj.v1 = 2;
        obj.v2 = 3;
        System.out.println(obj.v1+","+obj.v2);
        obj.check(obj);
        System.out.println(obj.v1+","+obj.v2);
    }

}