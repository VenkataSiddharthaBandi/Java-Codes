// Program to demonstrate using Regular Expressions for finding an email pattern in java

import java.util.regex.*;

public class RegularExpressionsEx2{
    public static void main(String[] args){
        boolean result = Pattern.matches("\\w+@\\w+[.]\\+","siddhartha@gmail.com");
        System.out.println("result is : " + result);
    }

}
