package Tasks.Book;

import Tasks.Book.Data.BookRepository;
import Tasks.Book.Model.Book;

import static Tasks.Book.Data.BookRepository.getBookRepositoryInstance;

public class Main {


    public static void main(String[] args) {
        BookRepository bookRepository = BookRepository.getBookRepositoryInstance();
        bookRepository.printRepository();
        bookRepository.addBook(new Book("ABC",10,10));
        BookRepository bookRepository1 = BookRepository.getBookRepositoryInstance();
        bookRepository1.printRepository();

    }
}
