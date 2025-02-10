public class Stringfunctions {
public static void main(String[] args)throws Exception{
    String s = "hello everyone";
    String s1 = s.concat("This is Siddhartha");
    System.out.println(s1);
    String s2= "HELLO EVERYONE";
    System.out.println(s2.charAt(8));
    System.out.println(s2.length());
    System.out.println("compareTo output is "+s.compareTo(s2));
    System.out.println(s.compareToIgnoreCase(s2));
    System.out.println(s.equals(s2));
    System.out.println(s.equalsIgnoreCase(s2));
    System.out.println(s2.startsWith("HEL"));
    System.out.println(s.endsWith("one"));
    System.out.println(s.indexOf("l"));
    System.out.println(s.lastIndexOf("e"));
    System.out.println(s.replace('h','c'));
    System.out.println(s.substring(3));
    System.out.println(s.substring(4,9));
    System.out.println(s2.toLowerCase());
    System.out.println(s.toUpperCase());
    System.out.println(s1.trim());
    String result[] = s.split("");
    System.out.println(result.length);
    for(int i = 0;i<result.length;i++){
        System.out.println(result[i]);
        char arr[] = new char[30];
        s1.getChars(5,12,arr,0);
    System.out.println(arr[7]);
    }
}
}