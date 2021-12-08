package file.zijie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {


    public static void main(String[] args) {
        readno();
    }
    public static void readMore(){
        //字节输入流
        FileInputStream fileInputStream=null;
        try {
             fileInputStream=new FileInputStream("E:\\io输入练习\\fileinput.txt");
            int available = fileInputStream.available();
             byte[] bytes=new byte[available];
            int read = fileInputStream.read(bytes);
            String s=new String(bytes,0,read);
            System.out.println(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

            public static  void readno(){
        FileInputStream fileInputStream=null;

                try {
                    fileInputStream=new FileInputStream("E:\\io输入练习\\fileinput.txt");
                    int read=fileInputStream.read();
                    while (read!=-1){
                        System.out.println(read);
                        read=fileInputStream.read();
                    }


                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }





}
