package FileHandling.Input;

import java.io.IOException;
import java.io.InputStreamReader;

public class inputstream {
    public static void main(String[] args) {
        try( InputStreamReader isr = new InputStreamReader(System.in)){
        System.out.println("Enter something");
        int letters = isr.read();
        while(isr.ready()){
            System.out.println((char) letters);
            letters = isr.read();
        }
        isr.close();
        System.out.println();
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
    }
}

// So here we are taking the byte data from the input and getting it as the character data
