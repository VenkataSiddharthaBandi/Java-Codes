import java.io.*;

public class FileWritingwholeline {
    public static void main(String[] args)throws Exception{
        FileWriter fw = new FileWriter("Siddhartha.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        char c[] = {'s','i','d','d','h','a','r','t','h','a'};
        bw.write(c,0,c.length);
        bw.close();
        fw.close();
    }
}
