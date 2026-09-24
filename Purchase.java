import java.io.Serializable;

public class Purchase implements Serializable{

    private String purchaseid ;
    private String bookid ;
    private String booktitle;
    private String customername;
    private double price;

    public Purchase(String purchaseid , String bookid ,String booktitle ,String customername , double price ){
       this.purchaseid = purchaseid ;
        this.bookid = bookid ;
        this.booktitle = booktitle ;
        this.customername = customername ;
        this.price =price ;
        


    }

    public String getPurchaseId() {
        return purchaseid;
    }

    public String getBookId() {
        return bookid;
    }

    public String getBookTitle() {
        return booktitle;
    }

    public String getCustomerName() {
        return customername;
    }

    public double getPrice() {
        return price;
    }

    public void displayPurchase() {

        System.out.println("\n========== Purchase Information ==========");
        System.out.println("Purchase ID   : " + purchaseid);
        System.out.println("Book ID       : " + bookid);
        System.out.println("Book Title    : " + booktitle);
        System.out.println("Customer Name : " + customername);
        System.out.println("Price         : " + price);
    }
}

