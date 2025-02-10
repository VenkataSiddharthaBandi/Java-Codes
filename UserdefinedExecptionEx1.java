// Program to demonstrate User Defined Exceptions in java

class MyException extends Exception{
    MyException(){
        System.out.println("Children under 10 years are only allowed");
    }

    // We are parameterized constructor for proper exception message
    MyException(String s){
        super(s);
    }
}


public class UserdefinedExecptionEx1{
        public static void main(String[] args)throws Exception{
        
        try{
        int age = 11;
        if (age > 10){
            throw new MyException("Children age should not exceed 10 years");
        }
    }
    catch(Exception e){
        System.out.println("Children age should not exceed 10 years");
    }

    // If we do not use try and catch block then we cannot run the remaining program after the exception block
    
        try{
        String name = "sid";
        if (name.length() < 4){
            throw new MyException("Children name should not contain less than 4 characters");
        }
    }
    
    catch(Exception me){
        System.out.println("Children name should not contain less than 4 characters");
    }
    
    }
}
