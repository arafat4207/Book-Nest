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

        } else if (!book.isAvailable()) {

            System.out.println("Book is already borrowed.");

        } else {

            book.setAvailable(false);

            FileManager.saveBooks(books);

            System.out.println("Book borrowed successfully.");
        }
    }

    


        public void returnBook(String bookId) {

        Book book = searchBook(bookId);

        if (book == null) {

            System.out.println("Book not found.");

        } else if (book.isAvailable()) {

            System.out.println("This book is already available.");

        } else {

            book.setAvailable(true);

            FileManager.saveBooks(books);

            System.out.println("Book returned successfully.");
        }
    }
}