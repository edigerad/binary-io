import java.io.*;

// To filter data using the base classes FilterInputStream and FilterOutputStream (§17.4.2).

public class FilterStream {
    public static void main(String[] args) throws IOException {
        File data = new File("filter_stream.txt");

        FileOutputStream file_out = new FileOutputStream(data);
        FilterOutputStream filter_out = new FilterOutputStream(file_out);
        String s = "Hello World";
        byte b[] = s.getBytes();
        filter_out.write(b);
        filter_out.close();
        filter_out.close();
        System.out.println("Success...");

        FileInputStream file_in = new FileInputStream(data);
        FilterInputStream filter_in = new BufferedInputStream(file_in);
        int k = 0;
        while ((k = filter_in.read()) != -1) {
            System.out.println((char) k);
        }
        file_in.close();
        filter_in.close();
    }
}