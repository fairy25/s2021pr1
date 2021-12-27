package tut10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Please delete the file data.bin before running
 * in order to see the effect
 */
public class Act2 {
    public static void main(String[] args) throws IOException {
        // first, we need to create an ObjectOutputStream
        // but it requires a FileOutputStream so we create FileOutputStream before that
        // data.bin will be under the same folder as this source file
        FileOutputStream fos = new FileOutputStream("src\\tut10\\data.bin");
        // make sure to use data.bin as file name (just because requirement says so)
        // the statement to create a FileOutputStream throws FileNotFoundException
        // so we have to do something about it
        // declare main to throws the exception will ignore it
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // the statement to create ObjectOutputStream throws an IOException
        // so we need to either handle it or declare to throw it on main
        // because FileNotFoundException is a subtype of IOException
        // so, declare to throw only IOException is enough for both

        // create an ArrayList of Strings
        ArrayList<String> a = new ArrayList<>();
        a.add("David");
        a.add("Daisy");
        a.add("Emily");

        // now, use the oos to write the ArrayList object to file
        oos.writeObject(a);

        // close the oos
        oos.close();
    }
}
