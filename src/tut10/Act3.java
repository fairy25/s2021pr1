package tut10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Act3 {
    public static void main(String[] args) {
        System.out.println("data.bin contains:");
        try {
            // this constructor may throw FileNotFoundException
            FileInputStream fis = new FileInputStream("src\\tut10\\data.bin");
            // this constructor may throw IOException
            ObjectInputStream ois = new ObjectInputStream(fis);
            /*
             readObject() may throw ClassNotFoundException
             We have to cast Object into ArrayList<String>
             because readObject() always returns Object
             */
            ArrayList<String> arList = (ArrayList<String>) ois.readObject();
            for (String s : arList) {
                System.out.println(s);
            }
            // close() may throw IOException
            ois.close();
        } catch (Exception e) { // will catch any kind of Exception
            System.out.println(e.getMessage());
        }
    }
}
