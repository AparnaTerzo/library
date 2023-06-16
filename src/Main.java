import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Author name : ");
        String author = sc.next();

        System.out.print("Enter the Book Name :");
        String bookName = sc.next();


        // 1. Add Library to collection
        LibraryCollection libraryCollection = new LibraryCollection();

        libraryCollection.addLibrary(new Library("Library1"));

        libraryCollection.addLibrary(new Library("Library2"));

        libraryCollection.addLibrary(new Library("Library3"));

        System.out.println("Enter the search library name:");
        String searchLibraryName = sc.next();
        try {
            Library searchedLibrary = libraryCollection.searchLibrary(searchLibraryName);
            System.out.println("Library found: " + searchedLibrary.getLibraryName());
        } catch (LibraryNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Enter the library name where the books needed to be added:");
        String targetLibraryName = sc.next();

        Book book1 = new Book(author, bookName);
        book1.toString();

        try {
            libraryCollection.addBookToLibrary(targetLibraryName, book1);
            System.out.println("Book added to " + targetLibraryName);
        } catch (LibraryNotFoundException e) {
            System.out.println(e.getMessage());
        }

            //display
        try {
            Library targetLibrary = libraryCollection.searchLibrary(targetLibraryName);
            targetLibrary.displayBooks();
        } catch (LibraryNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}