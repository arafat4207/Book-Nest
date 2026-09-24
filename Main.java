//import java.lang.classfile.instruction.SwitchCase;
import java.util.ArrayList;
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
            input.nextLine();

            switch (number) {
                case 1:
                    LibraryGUI.login();

                    Library library = new Library();
                    ArrayList<Purchase> purchases = FileManager.loadPurchases();

            boolean running = true ;
             while (running) {

                System.out.println("\n========== Library Managment System ==========\n");
                System.out.println("1. Add Book");
                System.out.println("2. Show Books");
                System.out.println("3. Search Book");
                System.out.println("4. Update Book");
                System.out.println("5. Delete Book");
                System.out.println("6. Borrow Book");
                System.out.println("7. Return Book");
                System.out.println("8. Purchase Book");
                System.out.println("9. Exit");
                System.out.print("\nEnter your choice: ");

                int choice =input.nextInt();
                input.nextLine();
                

                switch (choice) {

                    case 1:
                        System.out.println("Enter Book ID :");
                        String id = input.nextLine();

                        System.out.println("Enter Title :");
                        String title = input.nextLine();

                        System.out.println("Enter Author :");
                        String author = input.nextLine();

                        System.out.println("Enter Category : ");
                        String category = input.nextLine();

                        System.out.println("Enter Price :");
                        double price = input.nextDouble();

                        input.nextLine();

                        Book b1 = new Book(id, title, author,category, price);
                        
                        library.addBook(b1);
                        break;
                    
                    case 2:
                         library.showBooks();
                         break;
                    
                    case 3:
                        System.out.println("Enter Book Id :");
                        String find = input.nextLine();
                        Book f1 = library.searchBook(find);
                        if (f1!=null){
                            f1.displayInfo();
                        }
                        else {
                             System.out.println("Book not found.");
                        }
                        break;

                    case 4:
                        
                        System.out.println("Enter Book ID :");
                        String newid = input.nextLine();

                        System.out.println("Enter Title :");
                        String newtitle = input.nextLine();

                        System.out.println("Enter Author :");
                        String newauthor = input.nextLine();

                        System.out.println("Enter Category : ");
                        String newcategory = input.nextLine();

                        System.out.println("Enter Price :");
                        double newprice = input.nextDouble();

                        input.nextLine();

                        library.updateBook(newid, newtitle, newauthor, newcategory, newprice);

                        break;

                    case 5:

                         System.out.print("Enter Book ID: ");

                         String dId = input.nextLine();

                        library.deleteBook(dId);

                        break;

                    case 6:

                        System.out.print("Enter Book ID: ");

                        String bId = input.nextLine();

                        library.borrowBook(bId);

                        break;

                    case 7:

                        System.out.print("Enter Book ID: ");

                        String returnId = input.nextLine();

                        library.returnBook(returnId);

                        break;

                    case 8:

                        // System.out.print("Enter Purchase ID: ");
                        // String purchaseid = input.nextLine();
                        String purchaseid = "P" + (purchases.size() + 101);

                        System.out.print("Enter Book ID: ");
                        String purchasebookid = input.nextLine();

                        Book p1book =library.searchBook(purchasebookid);

                                if (p1book != null) {

                                    System.out.print("Enter Customer Name: ");
                                    String customerName = input.nextLine();

                                    System.out.print("Enter Price: ");
                                    double purchasePrice =input.nextDouble();

                                    input.nextLine();

                                    Purchase p1 = new Purchase(
                                            purchaseid ,
                                            purchasebookid,
                                            p1book.getTitle(),
                                            customerName,
                                            purchasePrice
                                    );

                                    purchases.add(p1);

                                    FileManager.savePurchases(purchases);

                                    System.out.println("\nPurchase successful!" );

                                    p1.displayPurchase();

                                } else {

                                    System.out.println(
                                            "\nBook not found."
                                    );
                                }

                                break;

                    case 9 :
                        running = false ;
                        System.out.println("Thank You!");
                        break;


                
                    default:
                        System.out.println("Invalid Input.");
                        break;
                    }
                }

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

                   input.close();
             }
             

            
        }
    

