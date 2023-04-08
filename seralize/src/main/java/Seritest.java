import java.io.*;
import commons.*;

public class Seritest {
    public static void main(String[] args)
    {

        try (
                // 创建一个ObjectOutputStream输入流
                var oos = new ObjectOutputStream(new FileOutputStream("mutable.txt"));
                // 创建一个ObjectInputStream输入流
                var ois = new ObjectInputStream(new FileInputStream("mutable.txt")))
        {
            //Person psn = new Person("aaaaa");
            //oos.writeObject(psn);
            //Person p2 = (Person) ois.readObject();    // ②
            Response psn = new Response("bbbbb");
            psn.s
            oos.writeObject(psn);
            Response p2 = (Response) ois.readObject();    // ②
            System.out.println(p2);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
