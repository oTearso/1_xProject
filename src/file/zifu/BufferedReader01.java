package file.zifu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader01 {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("E:\\io输入练习\\fileinput.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
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
}
