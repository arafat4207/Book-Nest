import java.util.ArrayList;

public class Library{
    private ArrayList<Book>books;

    public Library(){
         books = FileManager.LoadBooks();
    }


    public void addBook(Book book){
        books.add(book);

         FileManager.saveBooks(books);

        System.out.println("Book added Successfully!");
    }


    public void addStock(String bookId, int amount){
        Book book = searchBook(bookId);
        if(book == null){
            System.out.println("Book not found.");
        }
        else{
            book.addStock( amount);
            FileManager.saveBooks(books);
            System.out.println("Stock added sucessfully. New quantity : " + book.getQuantity());
        }
    }

    // eta kinle stock komanor jonno 
    public boolean purchaseBook(String bookId){

    Book book = searchBook(bookId);

    if(book == null){

        System.out.println("Book not found.");
        return false;

    }

    if(book.getQuantity() <= 0){

        System.out.println("Book is out of stock.");
        return false;

    }

    book.setQuantity(book.getQuantity() - 1);

    FileManager.saveBooks(books);

    System.out.println("Stock reduced.");
    System.out.println("Remaining stock: " + book.getQuantity());

    return true;
}


        public void showBooks() {

        if (books.isEmpty()) {

            System.out.println("No books available.");

            return;
        }

        for (Book book : books) {

            book.displayInfo();

            System.out.println("-------------------------");
        }
    }


        public Book searchBook(String bookId) {

        for (Book book : books) {

            if (book.getBookId().equalsIgnoreCase(bookId)) {

                return book;
            }
        }

        return null;
    }
    



        public void updateBook(String bookId,
                           String title,
                           String author,
                           String category,
                           double price) {

        Book book = searchBook(bookId);

        if (book != null) {

            book.setTitle(title);
            book.setAuthor(author);
            book.setCatagory(category);
            book.setPrice(price);

            FileManager.saveBooks(books);

            System.out.println("Book updated successfully.");

        } else {

            System.out.println("Book not found.");
        }
    }



        public void deleteBook(String bookId) {

        Book book = searchBook(bookId);

        if (book != null) {

            books.remove(book);

            FileManager.saveBooks(books);

            System.out.println("Book deleted successfully.");

        } else {

            System.out.println("Book not found.");
        }
    }


       public void borrowBook(String bookId) {

    Book book = searchBook(bookId);

    if (book == null) {

        System.out.println("Book not found.");

    } else if (book.getQuantity() <= 0) {

        System.out.println("Book is out of stock.");

    } else {

        book.setQuantity(book.getQuantity() - 1);

        FileManager.saveBooks(books);

        System.out.println("Book borrowed successfully.");
        System.out.println("Remaining stock: " + book.getQuantity());
    }
}


        public void returnBook(String bookId) {

    Book book = searchBook(bookId);

    if (book == null) {

        System.out.println("Book not found.");

    } else {

        
        book.setQuantity(book.getQuantity() + 1);

        
        FileManager.saveBooks(books);

        System.out.println("Book returned successfully.");
        System.out.println("Current stock: " + book.getQuantity());
    }
}
}