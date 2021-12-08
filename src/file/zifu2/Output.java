package file.zifu2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("E:\\io输入练习\\fileout.txt");
            String s="写进去的一句话";
            byte[] bytes=s.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
