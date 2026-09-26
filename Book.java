import java.io.Serializable;
public class Book implements Serializable{
    private String bookId;
    private String title;
    private String author;
    private String catagory;
    private double price;
     private boolean available;
    private int quantity;

    public Book(String bookId, String title, String author, String catagory, double price, int quantity) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.catagory = catagory;
        this.price = price;
        this.available = true;
        this.quantity = quantity;
    }
    public String getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getCatagory() {
        return catagory;
    }
    public double getPrice() {
        return price;
    }
   public boolean isAvailable() {
        return available;
   }
    public int getQuantity(){
        return quantity;
    }

    public void addStock(int amount){
        this.quantity = this.quantity+amount;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void displayInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + catagory);
        System.out.println("Price: " + price);
       // System.out.println("Available: " + available);
        System.out.println("Quantity: " + quantity);
    }


   

}