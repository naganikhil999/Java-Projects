import java.util.*;

class Book{
    String title;
    String author;
    String publisher;
    int quantity;

    //Constructor for Book class
    public Book(String title , String author, String publisher, int quantity){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

class Library{
    ArrayList<Book> books;
    HashMap<String , Integer> bookIndex;

    //Constructor for Library class
    public Library(){
        books = new ArrayList<Book>();
        bookIndex = new HashMap<String , Integer>();
    }

    //Method to add book into library
    public void addBook(String title, String author, String publisher, int quantity){
        Book book = new Book(title, author, publisher, quantity);
        books.add(book);
        bookIndex.put(title, books.size() - 1);
    }

    //Method to remove book from library
    public void removeBook(String title){
        int index = bookIndex.get(title);
        books.remove(index);
        bookIndex.remove(title);
    }

    //Method to update quantity of book
    public void updateBook(String title, int quantity){
        int index = bookIndex.get(title);
        books.get(index).quantity = quantity;
    }

    //Method decreases quantity by 1 when a book took out
    public void checkOutBook(String title){
        int index = bookIndex.get(title);
        books.get(index).quantity--;
    }

    //Method increases quantity by 1 when a book to library
    public void checkInBook(String title){
        int index = bookIndex.get(title);
        books.get(index).quantity++;
    }

    //Method to list all books
    public void listBooks(){
        for(Book book:books){
            System.out.println(book.title + "by" + book.author + "published by" + book.publisher + " ( " + book.quantity + " copies availabe)");
        }
    }
}


public class Main{
    public static void main(String[] args){
        Library library = new Library();

        //Adding a book to library
        library.addBook("The India Way", "Dr.Jaya Shankar", "Amazon", 5);
        library.addBook("Think Like a Monk", "Jay Shetty", "Flipkart", 4);

        //listing all books
        library.listBooks();
        
        //checkingout a book
        library.checkOutBook("The India Way");
        
        library.listBooks();
    }
}
