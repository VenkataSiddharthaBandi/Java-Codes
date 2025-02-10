// Program to demonstrate String Tokenizer in java

import java.util.*;

public class StringTokenizerEx{
    public static void main(String[] args){
        String s = "Welcome to,core java programming";
        StringTokenizer st = new StringTokenizer(s);
        System.out.println(st.countTokens());
        
        while(st.hasMoreTokens()){
            String s1 = st.nextToken();
            System.out.println(s1 + "$");
        }

    }
}