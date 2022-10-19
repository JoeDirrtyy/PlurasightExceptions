package chapter13;

import java.io.File;
import java.io.IOException;


//creates a new file and handles exceptions that may occur
public class ExceptionalHandling {
    public static void main(String[] args) {

        createNewFile();
    }
    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }catch(IOException ex){
            System.out.println("Directory does not exist");
            ex.printStackTrace();
        }
    }
}
