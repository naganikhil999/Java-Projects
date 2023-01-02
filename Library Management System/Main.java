import java.util.*;

class Book{
    String title;
    String author;
    String publisher;
    int quantity;

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

    public Library(){
        books = new ArrayList<Book>();
        bookIndex = new HashMap<String , Integer>();
    }

    public void addBook(String title, String author, String publisher, int quantity){
        Book book = new Book(title, author, publisher, quantity);
        books.add(book);
        bookIndex.put(title, books.size() - 1);
    }

    public void removeBook(String title){
        int index = bookIndex.get(title);
        books.remove(index);
        bookIndex.remove(title);
    }

    public void updateBook(String title, int quantity){
        int index = bookIndex.get(title);
        books.get(index).quantity = quantity;
    }

    public void checkOutBook(String title){
        int index = bookIndex.get(title);
        books.get(index).quantity--;
    }

    public void checkInBook(String title){
        int index = bookIndex.get(title);
        books.get(index).quantity++;
    }

    public void listBooks(){
        for(Book book:books){
            System.out.println(book.title + "by" + book.author + "published by" + book.publisher + " ( " + book.quantity + " copies availabe)");
        }
    }
}


public class Main{
    public static void main(String[] args){
        Library library = new Library();

        library.addBook("The India Way", "Dr.Jaya Shankar", "Amazon", 5);
        library.addBook("Think Like a Monk", "Jay Shetty", "Flipkart", 4);

        library.listBooks();
    }
}