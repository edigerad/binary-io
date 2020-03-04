import java.io.*;

public class FileStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("file_stream.dat");
        output.write(190);
        FileInputStream input = new FileInputStream("file_stream.dat");
        System.out.println(input.read());
    }
}