public class CreatingStringBuffer {
    public static void main(String[] args){

        //Method 1 of creating a StringBuffer

        StringBuffer SB = new StringBuffer("Hello");

        //Method 2 of creating a StringBuffer

        StringBuffer sb = new StringBuffer();
        sb.append("Hii");
        
        //Method 3 of creating a StringBuffer

        StringBuffer Sb = new StringBuffer(100);
        System.out.println(SB);
        System.out.println(sb);
        System.out.println(Sb.length());
    }
}

