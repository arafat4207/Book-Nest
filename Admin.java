public class Admin extends User {

    public Admin(String Fullname,String username, String password) {

    super(Fullname, username, password);
    }

    @Override
    public String getRole() {
        return "Admin";
    }

    
    public void displayInformation() {

   System.out.println();
   System.out.println("===== ADMIN MENU =====");
   System.out.println("1. Add Book");
   System.out.println("2. Show Books");
   System.out.println("3. Search Book");
   System.out.println("4. Update Book");
   System.out.println("5. Delete Book");
   System.out.println("6. Borrow Book");
   System.out.println("7. Return Book");
   System.out.println("0. Exit");
    }
}