public class Stringsareimmutable {
    public static void main(String[] args){
        String s = "Hello";
        System.out.println("Before updation the value is: "+s);
        System.out.println("Before updation the string hashcode is : "+s.hashCode());
        s = "Hii";
        System.out.println("After udate the value is : "+s);
        System.out.println("After udate the string hashcode is : "+s.hashCode());
    }
}
