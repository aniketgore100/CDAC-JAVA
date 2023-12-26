package day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Todo {

    public static void main(String[] args) {
        String file = "./src/day8/todo";
        StringBuilder str = new StringBuilder();

        try (FileInputStream fin = new FileInputStream(file)) {
            while (true) {
                int data = fin.read();
                if (data == -1)
                    break;
                char ch = (char) data;
                str.append(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String filePath = "ice.txt";
        String icedata = str.toString();
        try (FileOutputStream fout = new FileOutputStream(filePath)) {
            byte[] iceinfo = icedata.getBytes();
            fout.write(iceinfo);
            System.out.println("Data has been written to file");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
