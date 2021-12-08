package file.zifu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
reader();
    }

public static  void  reader(){
    FileReader fileReader=null;
    try {
        fileReader=new FileReader("E:\\io输入练习\\filereader.txt");

        char[] chars=new char[100];
        int read = fileReader.read(chars);
        while (read!=-1){
           //将读到的字符转换为字符串
            System.out.println(new String(chars,0,read));
            read=fileReader.read(chars);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }finally {
        if (fileReader != null) {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
}
