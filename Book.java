public class Book{
    String name;
    int id;
    Book(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void displayInfo(){
        System.out.println("Book Name: " + name);
        System.out.println("Book ID: " + id);
    }

}