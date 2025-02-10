// Program to demonstrate Hash Maps in java
// Note: Hah Maps doesn't follow any Synchronization

import java.util.*;

public class HashMapEx{
    public static void main(String[] args){
        HashMap<String,String> lang = new HashMap<String,String>();
        lang.put("Fl","Telugu");
        lang.put("Sl"," Hindi");
        lang.put("Tl","English");
        if(lang.isEmpty()){
            System.out.println("The list is still empty");
        }
        else{
            System.out.println("The size of Hash Map is : " + lang.size());
        }
        System.out.println("The keys present in this Hash Map are : " + lang.keySet());
        System.out.println("The values present in this Hash Map are : " + lang.values());
        System.out.println("The value of Fl is : " + lang.get("Fl"));
        System.out.println("The key value pairs present in this Hash Map are : " + lang.entrySet());
        System.out.println("Is Sl key available in the given Hash Map? : " + lang.containsKey("Sl"));
        System.out.println("Is English value available in the given Hash Map? : " + lang.containsValue("English"));
    }
}