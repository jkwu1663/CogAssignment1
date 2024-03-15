package Assignments;
import java.util.Scanner;
public class BookDetails {
    public static void main (String[] args) {
        Book myBook = new Book(1,"Johns hat", "John",400);
        Scanner sc = new Scanner(System.in);
        Book[] bookArr = new Book[3];
        int bookNum;
        String title;
        String author;
        float price;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter book#, title, author and price for book# " + String.valueOf(i+1));
            System.out.println("Enter book#");
            bookNum = sc.nextInt();
            System.out.println("Enter title name: ");
            title = sc.next();
            System.out.println("Enter author name: ");
            author = sc.next();
            System.out.println("Enter price: ");
            price = sc.nextFloat();
//            bookArr[i].setBookNo(bookNum);
//            bookArr[i].setTitle(title);
//            bookArr[i].setAuthor(author);
//            bookArr[i].setPrice(price);
            bookArr[i] = new Book(i, title, author, price);
        }

        System.out.println("Search book by book number, enter a number");
        int bookNumSearch = sc.nextInt();
        boolean bookFound = false;
        for (Book currBook: bookArr) {
            if (currBook.getBookNo() == bookNumSearch) {
                System.out.println("Book number " + bookNumSearch + " details");
                currBook.toString();
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("Book number does not exist");
        }

        EngineeringBook engBook = new EngineeringBook();
        System.out.println("Testing Engineering Book");
        System.out.println("Enter book#, title, author and price for engineering book");
        System.out.println("Enter book#");
        bookNum = sc.nextInt();
        System.out.println("Enter title name: ");
        title = sc.next();
        System.out.println("Enter author name: ");
        author = sc.next();
        System.out.println("Enter price: ");
        price = sc.nextFloat();
        System.out.println("Enter Category: ");
        String category = sc.next();
        engBook.setBookNo(bookNum);
        engBook.setTitle(title);
        engBook.setAuthor(author);
        engBook.setPrice(price);
        engBook.setCategory(category);
        engBook.toString();
        System.out.println("Category: " + engBook.getCategory());
    }
}
