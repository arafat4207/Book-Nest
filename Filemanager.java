import java.io.*;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_NAME = "user.dat";

    // Save Readers
    public static void saveReaders(ArrayList<Reader> readers) {

        try {

            ObjectOutputStream output =
                    new ObjectOutputStream(
                            new FileOutputStream(FILE_NAME)
                    );

            output.writeObject(readers);

            output.close();

            System.out.println("Users saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving users.");
        }
    }

    // Load Readers
    public static ArrayList<Reader> loadReaders() {

        try {

            ObjectInputStream input =
                    new ObjectInputStream(
                            new FileInputStream(FILE_NAME)
                    );

            ArrayList<Reader> readers =
                    (ArrayList<Reader>) input.readObject();

            input.close();

            return readers;

        } catch (Exception e) {

            return new ArrayList<>();
        }
    }
}