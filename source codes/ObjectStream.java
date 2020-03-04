import java.io.*;

// To store and restore objects using ObjectOutputStream and ObjectInputStream (§17.6).

public class ObjectStream {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        try (
              ObjectOutputStream output =
                      new ObjectOutputStream(new FileOutputStream("object_stream.dat"));
        ) {
            output.writeUTF("Askhat");
            output.writeDouble(90.0);
            output.writeObject(new java.util.Date());
        }

        try (
              ObjectInputStream input =
                      new ObjectInputStream(new FileInputStream("object_stream.dat"));
        ) {
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date) (input.readObject());
            System.out.println(name + " " + score + " " + date);
        }
    }
}