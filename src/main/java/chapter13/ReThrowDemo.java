package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReThrowDemo {

    public static void main(String[] args) {
        numbersExceptionHandling();
       // createNewFileReThrow();//Fix with a try/catch block
        //or add a throws exception to the main method
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }catch(Exception ex){
            System.out.println("Directory does not exist");
            ex.printStackTrace();
        }
    }

        public static void createNewFileReThrow() throws IOException {
            File file = new File("resources/nonexistent.txt");
            file.createNewFile();
        }

    public static void numbersExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            new Scanner(file);
            while (fileReader.hasNext()) {
                double number = fileReader.nextDouble();
                System.out.println(number);
            }
            //pipe symbol style
        }catch(FileNotFoundException | InputMismatchException ex){
            ex.printStackTrace();
        }finally {
            fileReader.close();
        }
        //Longer way
//            }catch (FileNotFoundException ex){
//                ex.printStackTrace();
//            }catch(InputMismatchException ex){
//                ex.printStackTrace();
//            }catch(Exception ex){
//                ex.printStackTrace();
//            }
    }

}
