import java.util.Scanner;

public class Main {

    public static void main (String []args ){
        Scanner input = new Scanner (System.in);
       boolean login = true ;
        while (login) {
             
            System.out.println("\n======= Book Nest =======\n");
            System.out.println("\n1. Login ");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");

            System.out.println("\nEnter your choice : ");

            int number = input.nextInt();

            switch (number) {
                case 1:
                    LibraryGUI.login();
                    break;
                case 2:
                    LibraryGUI.signUp();
                    break;
                case 3:
                    login = false ;
                    System.out.println("Thank You !");
                    break;
            
                default:
                    System.out.println("\nInvalid choice");
                    break;
            }



            
        }
    
    }
}
