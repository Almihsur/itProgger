package itProger.Threads;

import java.io.*;

public class SetObject {
    // serialise
    private final String fn = "user.info";
    public void serialis (Object obj){
        try {
            FileOutputStream fos = new FileOutputStream(fn);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            System.out.println("Object serialise succesfool!");
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
