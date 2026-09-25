import javax.swing.*;
import java.util.ArrayList;

public class LibraryGUI {

        static ArrayList<Reader> readers =
            FileManager.loadReaders();

            public static boolean login() {

             System.out.println();
             System.out.println("========== LOGIN ==========");

             String username = JOptionPane.showInputDialog("Enter Username:");

         String password =JOptionPane.showInputDialog( "Enter Password:");

          if (username == null || password == null) {
              return false;
        }

        for (Reader reader : readers) {

              if (reader.getuserName().equals(username) && reader.getPassword().equals(password)) {

            JOptionPane.showMessageDialog( null,"Login Successful!\nWelcome "+ reader.getfullname() );

            return true;
        }
    }

           JOptionPane.showMessageDialog(null, "Wrong username or password!");

              return false;
}

  

    public static void signUp() {

        System.out.println();
        System.out.println("========== SIGN UP ==========");

        String fullName =JOptionPane.showInputDialog("Enter Full Name:");

        String username =JOptionPane.showInputDialog("Enter Username:");

        String password =JOptionPane.showInputDialog("Enter Password:");

        if (fullName == null || username == null || password == null) {

            return;
        }

        if (fullName.isEmpty()|| username.isEmpty()|| password.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please fill all fields!");

            return;
        }

        for (Reader reader : readers) {

            if (reader.getuserName().equals(username)) {

                JOptionPane.showMessageDialog( null,"Username already exists!");

                return;
            }
        }

        Reader reader =
                new Reader(
                        fullName,
                        username,
                        password
                );

        readers.add(reader);

        FileManager.saveReaders(readers);

        JOptionPane.showMessageDialog(
                null,
                "Sign Up Successful!"
        );
    }
}