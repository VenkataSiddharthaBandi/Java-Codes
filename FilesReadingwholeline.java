import java.io.*;

public class FilesReadingwholeline{
    public static void main(String[] args)throws Exception{
        FileReader fr = new FileReader("siddhartha.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null){
            System.out.println(s);
            fr.close();
            br.close();
        }
    }
}
