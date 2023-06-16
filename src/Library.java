import java.util.ArrayList;

public class Library {
    String libraryName;
    public ArrayList<Book> books;

    public Library(String libraryName){
        this.libraryName=libraryName;
        this.books =  new ArrayList<Book>();
    }
    public String getLibraryName() {
        return libraryName;
    }
    public String toLibrary(){
        return "Library : " +libraryName;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks() {
        if (books.isEmpty())
        {
            System.out.println("The library is empty!");

        }
        else
        {
            System.out.println("Books in " + libraryName + ":");
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }


}
