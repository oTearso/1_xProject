package file.zifu2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Input2 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("E:\\io输入练习\\fileinput.txt");
            byte[] bytes=new byte[10];
            int read=fileInputStream.read(bytes);
            while (read!=-1){
                System.out.println(new String(bytes,0,read));
                read=fileInputStream.read(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
