public class Book {
    String author;
    String bookName;


    public Book(String author, String bookName){
        this.author=author;
        this.bookName=bookName;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public String getAuthor(){
        return author;
    }
    public String getBookName(){
        return bookName;
    }

    public String toString(){
        return "The author name is "+getAuthor()+ "\nThe book name is "+getBookName();
    }


}
