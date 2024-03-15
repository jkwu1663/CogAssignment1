package Assignments;
// Assignment 2
public class Book extends Object{
    private int bookNo;
    private String title;
    private String author;
    private float price;

    private static int bookCount;

    static {
        bookCount = 0;
    }
    public Book() {

    }
    public Book(int bookNo, String title, String author, float price) {
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.price = price;
        if (title.length() < 4) {
            System.out.println("Title has less than 4 characters");
        }
        if (price < 1 || price > 5000) {
            System.out.println("Price is not within range 1-5000");
        }
        bookCount += 1;
    }

    @Override public String toString() {
        System.out.println("Book #: " + bookNo);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("price: " + price);
        return null;
    }

    public int getBookNo() {
        return bookNo;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public float getPrice() {
        return price;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    private static int getBookCount() {
        return bookCount;
    }
}
