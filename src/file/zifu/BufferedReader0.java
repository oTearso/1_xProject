package file.zifu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader0 {
    public static void main(String[] args) {
buff();
    }

    public static  void buff(){
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader=new FileReader("E:\\io输入练习\\fileinput.txt");
            bufferedReader=new BufferedReader(fileReader);
            String s=bufferedReader.readLine();
            while (s!=null){
                System.out.println(s+"\n");
                s=bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
public  static  void  buff2(){
    FileReader fileReader=null;
    BufferedReader bufferedReader=null;
    try {
        fileReader=new FileReader("E:\\io输入练习\\fileinput.txt");
        bufferedReader=new BufferedReader(fileReader);
      char[] chars=new char[10];
      bufferedReader.read();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}


}
