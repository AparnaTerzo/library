import java.util.ArrayList;
import java.util.List;

class LibraryCollection {
    private List<Library> libraries;

    public LibraryCollection() {
        libraries = new ArrayList<>();
    }

    public void addLibrary(Library library) {
        libraries.add(library);
    }

    public Library searchLibrary(String libraryName) throws LibraryNotFoundException
    {
        for (Library library : libraries)
        {
            if (library.getLibraryName().equals(libraryName))
            {
                return library;
            }
        }
        throw new LibraryNotFoundException("Library not found: " + libraryName);
    }
    public void addBookToLibrary(String libraryName, Book book) throws LibraryNotFoundException {
        Library library = searchLibrary(libraryName);
        library.addBook(book);
    }
}

class LibraryNotFoundException extends Exception {
    public LibraryNotFoundException(String message) {
        super(message);
    }
}