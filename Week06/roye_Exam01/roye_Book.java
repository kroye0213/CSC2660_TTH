package roye_Exam01;

import java.util.Scanner;

public class roye_Book {
    //variable names for our class
    public String bookName;
    public String author;
    public String publisher;
    public String copyrightDate;
    public roye_Book(){}
    //constructor for the varibles that we want to use
    public roye_Book(String bookName, String author, String publisher, String copyrightDate) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.copyrightDate = copyrightDate;
    }
//getters and setters for the variables
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCopyrightDate() {
        return copyrightDate;
    }

    public void setCopyrightDate(String copyrightDate) {
        this.copyrightDate = copyrightDate;
    }
//to string method for formatting our output
    @Override
    public String toString() {
        System.out.println(bookName + " " + author + " " + publisher + " " + copyrightDate);
        return "roye_Book [author=" + author + ", bookName=" + bookName + ", copyrightDate=" + copyrightDate
                + ", publisher=" + publisher + "]";
    }
//a class that asks for the book info and stores it for use in the output statement
    public void bookshelf(){
    Scanner dataInput = new Scanner(System.in);
            
                System.out.println("\nEnter the book name: ");
                bookName = dataInput.nextLine();
                System.out.println("\nEnter the Author: ");
                author = dataInput.nextLine();
                System.out.println("\nEnter the publisher: ");
                publisher = dataInput.nextLine();
                System.out.println("\nEnter copyright date: ");
                copyrightDate = dataInput.nextLine();
}
//main function for the program to run the classes that were created and output the result
public static void main(String[] args) {
     roye_Book book_objects = new roye_Book();
     book_objects.bookshelf();
     book_objects.toString();
}
}