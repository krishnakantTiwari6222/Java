package FileHandling.Input.Output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class outputStream {
    public static void main(String[] args) {
        OutputStream os = System.out;
        // os.write(emoji); is not in range

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("Hello");
            osw.write(10);
            osw.write('A');
            osw.write(0);
            osw.write("null", 0, 0);
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }

}
