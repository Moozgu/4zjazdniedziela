package Tasks.Book.Data;

import Tasks.Book.Model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book ("Pirates",600,120));
        bookList.add(new Book ("Anders",150,240));
        bookList.add(new Book ("Nevernding Story",680,90));
        bookList.add(new Book ("Santanders",130,68));
        bookList.add(new Book ("Zalazar",420,200));
        bookList.add(new Book ("ET",985,350));
        bookList.add(new Book ("Null",142,140));
        bookList.add(new Book ("Barbarians",324,16));

        for (Book book : bookList) {
            System.out.println(book);

        }
    }
}
