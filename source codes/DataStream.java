import java.io.*;
// To read and write primitive values and strings using DataInputStream and DataOutputStream (§17.4.3).
public class DataStream {
    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream data_output =
                        new DataOutputStream(new FileOutputStream("data_stream.dat"));
        ) {
            data_output.writeUTF("Askhat");
            data_output.writeDouble(70.5);
            data_output.writeUTF("Kurmangazy");
            data_output.writeDouble(80.5);
            data_output.writeUTF("Bakdaulet");
            data_output.writeDouble(90.5);
        }

        try (
                DataInputStream data_input =
                        new DataInputStream(new FileInputStream("data_stream.dat"));
        ) {
            System.out.println(data_input.readUTF() + " " + data_input.readDouble());
            System.out.println(data_input.readUTF() + " " + data_input.readDouble());
            System.out.println(data_input.readUTF() + " " + data_input.readDouble());
        }
    }
}