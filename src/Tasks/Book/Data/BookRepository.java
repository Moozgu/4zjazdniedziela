package Tasks.Book.Data;

import Tasks.Book.Model.Book;

import java.util.LinkedList;
import java.util.List;

public class BookRepository {
        private List<Book> bookRepository = new LinkedList<>();
        private static BookRepository repositoryInstance = null;

//        bookRepository.add(new Book ("Pirates",600,120));
//        bookRepository.add(new Book ("Anders",150,240));
//        bookRepository.add(new Book ("Nevernding Story",680,90));
//        bookRepository.add(new Book ("Santanders",130,68));
//        bookRepository.add(new Book ("Zalazar",420,200));
//        bookRepository.add(new Book ("ET",985,350));
//        bookRepository.add(new Book ("Null",142,140));
//        bookRepository.add(new Book ("Barbarians",324,16));

    private BookRepository() {
    }

    public void addBook(Book book){

    this.bookRepository.add(book);
}
    public static BookRepository getBookRepositoryInstance(){
        if(BookRepository.repositoryInstance == null){
            BookRepository.repositoryInstance = new BookRepository();

        }
        return BookRepository.repositoryInstance;
    }




}

