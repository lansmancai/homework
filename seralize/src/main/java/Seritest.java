import java.io.*;
import commons.*;

public class Seritest {
    public static void main(String[] args)
    {

        try (
                // ����һ��ObjectOutputStream������
                var oos = new ObjectOutputStream(new FileOutputStream("mutable.txt"));
                // ����һ��ObjectInputStream������
                var ois = new ObjectInputStream(new FileInputStream("mutable.txt")))
        {
            //Person psn = new Person("aaaaa");
            //oos.writeObject(psn);
            //Person p2 = (Person) ois.readObject();    // ��
            Response psn = new Response("bbbbb");
            psn.s
            oos.writeObject(psn);
            Response p2 = (Response) ois.readObject();    // ��
            System.out.println(p2);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
