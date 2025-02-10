// Using "final" keyword to declare methods to avoid METHOD OVERRIDING

class Abcd{
    final void show(){
        System.out.println("This is show method in class A");
    }
    // Here we had created an method using final keyword

}

class Bc extends Abcd{
    void show(int a){
        System.out.println("This is show method in class B");

        /* Here we cannot create a method with same name name and parameter it will return an error message */
    }
}


public class Finalkeywordformethods {
    public static void main(String[] args){
        Bc obj = new Bc();
        obj.show();
        obj.show(1);
    }
}
