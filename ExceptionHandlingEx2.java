// Program to demonstrate Exception Handling in java

public class ExceptionHandlingEx2{
    public static void main(String[] args){
        try{
        System.out.println((1+2));
        System.out.println((2-1));
        System.out.println((1/0));
        }

        catch(Exception e){
            System.out.println("Should not divide with zero");
        }

        // We should use finally keyword for statements which need to executed mandatorily

        finally{
            System.out.println((1*2));
        }
    }
}