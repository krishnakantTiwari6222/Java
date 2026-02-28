package FileHandling.Input;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileReader {
    public static void main(String[] args) {
        try( FileReader fr = new FileReader("C:\\Users\\ASUS\\OneDrive\\System\\OneDrive\\Desktop\\IAAMZKP\\Java Exception Handling\\FileHandling\\Input\\notes.txt")){
        int letters = fr.read();
        while(fr.ready()){
            System.out.print((char) letters);
            letters = fr.read();
        }
        fr.close();
        // System.out.println();
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
    }
}

// In FileReader Class we can read all the data from a file and simply read it from console
