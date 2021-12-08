package file.zijie;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Output {
    public static void main(String[] args) {
output();
    }
public static  void output(){
    FileOutputStream fileOutputStream=null;
    String s="这是写进电脑的一句话";
    try {
        fileOutputStream=new FileOutputStream("E:\\io输入练习\\fileout.txt");
        byte[] bytes=s.getBytes();
        fileOutputStream.write(bytes);
        fileOutputStream.flush();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        if(fileOutputStream!=null){
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}




}
