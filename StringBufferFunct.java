public class StringBufferFunct{
    public static void main(String[] args){
        StringBuffer sb =new StringBuffer("Hii");
        sb.append("Welcome");
    System.out.println(sb);
    System.out.println(sb.insert(1,"RE"));
    System.out.println(sb.delete(1,3));
    System.out.println(sb.reverse());
    System.out.println(sb.toString());
    System.out.println(sb.length());
    System.out.println(sb.indexOf("l"));
    System.out.println(sb.lastIndexOf("i"));
    sb.replace(2,4,"Hii");
    System.out.println(sb);
    System.out.println(sb.delete(2,4));
    System.out.println(sb.substring(2));
    System.out.println(sb.substring(2,6));
    System.out.println(sb);
    }
}
