import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;

class TextIO {
    public static void main(String[] args) throws IOException {
        PrintWriter output = new PrintWriter("text_io.txt");
        output.print("Hello World");
        output.close();

        Scanner input = new Scanner(new File("text_io.txt"));
        System.out.println(input.nextLine());
        input.close();

    }
}