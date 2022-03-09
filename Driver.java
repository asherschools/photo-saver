import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        try {

            // lets start with just getting a text file to move from one location to the
            // other

            // this is where the input location is gotten from user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What is the exact file path to the input folder location?");
            String inLocation = reader.readLine();

            System.out.println("What is the exact file path to the output folder location?");
            String outLocation = reader.readLine();

            // input hopefully the plugged in phone
            InputLocation input = new InputLocation(inLocation);
            ArrayList<String> files = fillFileArrayList(input);

            // output somewhere on the computer or external harddrive
            OutputLocation output = new OutputLocation(outLocation);
            moveFiles(files,output);

        } catch (IOException e) {
            System.out.println("There was an IO exception");
        }
    }

    //runs the getter for filesToMove and sets up the files to get ready to move them
    public static ArrayList<String> fillFileArrayList( InputLocation input) {
        ArrayList<String> files = input.getFilesToMove();

        return files;
    }

    //actually moves the files to the outputLocation
    public static void moveFiles(ArrayList<String> files, OutputLocation output) {

    }
}