// Program to demonstrate Regular Expressions in java

import java.util.regex.*;

public class RegularExpressionsEx1{
    public static void main(String[] args){

        // Define pattern
        Pattern p = Pattern.compile("[h]");

        // Defining the string
        String s = "I am Siddhartha";

        // Perform matching operations
        Matcher m = p.matcher(s);

        System.out.println("m.find() : " + m.find());
        System.out.println("m.find(8) : " + m.find(8));
        System.out.println("m.matches() : " + m.matches());





    }
}