package itProger.Threads;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class GetObject {
    private final String fn = "user.info";
    public void serialis (Object obj){
        try {
            FileInputStream fis = new FileInputStream(fn);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //obj = (GetUserInfo)ois.readObject();
            ois.close();
            System.out.println("Object serialise succesfool!");
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
