package file.zifu2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("E:\\io输入练习\\fileinput.txt");
            int available = fileInputStream.available();
            byte[] bytes=new byte[available];
            int read = fileInputStream.read(bytes);
            String s=new String(bytes,0,available);
            System.out.println(available);
            System.out.println(read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
