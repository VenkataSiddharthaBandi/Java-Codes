// Program to demonstrate Exception Handling in java

class A{
    int arr[] = {1,2,3,4,5};
    String s = "twg";
}


public class ExceptionHandlingEx1 {
    public static void main(String[] args){
        A obj = new A();

        // The exception message should be written in the try block

        try{
            System.out.println(obj.arr[5]);
            System.out.println(obj.arr[1]);
        }

        // There must be an catch block or finally block after the try block

        catch(Exception e){
            System.out.println();
        }
        
    }
}

