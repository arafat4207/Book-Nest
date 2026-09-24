import java.io.*;
import java.util.ArrayList;

public class FileManager {
    

    // filename 

    private static final String USER_FILE = "user.dat";
    private static final String BOOK_FILE = "book.dat";
    private static final String PURCHASE_FILE = "purchase.dat";


    // Save Readers
    public static void saveReaders(ArrayList<Reader> readers) {

        try {

            ObjectOutputStream output =
                    new ObjectOutputStream(
                            new FileOutputStream(USER_FILE)
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
                            new FileInputStream(USER_FILE)
                    );

            ArrayList<Reader> readers =
                    (ArrayList<Reader>) input.readObject();

            input.close();

            return readers;

        } catch (Exception e) {

            return new ArrayList<>();
        }
    }


    // Save Books
    public static void saveBooks(ArrayList<Book> books) {

        try {

            ObjectOutputStream output =
                    new ObjectOutputStream(
                            new FileOutputStream(BOOK_FILE)
                    );

            output.writeObject(books);

            output.close();

            System.out.println("Books saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving books.");
        }
    }


    // Load Books
    public static ArrayList<Book> LoadBooks() {

        try {

            ObjectInputStream input =
                    new ObjectInputStream(
                            new FileInputStream(BOOK_FILE)
                    );

            ArrayList<Book> books =
                    (ArrayList<Book>) input.readObject();

            input.close();

            return books;

        } catch (Exception e) {

            return new ArrayList<>();
        }
    }



    // Save Purchases
    public static void savePurchases(ArrayList<Purchase> purchases) {

        try {

            ObjectOutputStream output =
                    new ObjectOutputStream(
                            new FileOutputStream(PURCHASE_FILE)
                    );

            output.writeObject(purchases);

            output.close();

            System.out.println("Purchases saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving purchases.");
        }
    }


    // Load Purchases
    public static ArrayList<Purchase> loadPurchases() {

    try {

        ObjectInputStream input =
                new ObjectInputStream(
                        new FileInputStream(PURCHASE_FILE)
                );

        ArrayList<Purchase> purchases =
                (ArrayList<Purchase>) input.readObject();

        input.close();

        return purchases;

    } catch (Exception e) {

        return new ArrayList<>();
    }
}
}