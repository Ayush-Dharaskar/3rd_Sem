package Lab5;

import java.util.*;

class Book {

    String title;
    String author;
    int edition;

    Book(String t, String a, int e) {
        title = t;
        author = a;
        edition = e;
    }

    void display() {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Edition:" + edition);
    }
}

public class Q6Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title,author and edition:");

        Book[] books = new Book[6];

        for (int i = 0; i < 2; i++) {
            if (i > 0)
                sc.nextLine();

            books[i] = new Book(sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        books[0].display();

        for (int i = 0; i < 6; i++) {
            if ((books[i].title).compareTo(books[i + 1].title) > 0) {
                String temp = books[i].title;
                books[i].title = books[i + 1].title;
                books[i + 1].title = temp;
            }
        }
    }

}
