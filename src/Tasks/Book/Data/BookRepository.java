package Tasks.Book.Data;

import Tasks.Book.Model.Book;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BookRepository {
        private List<Book> bookRepository = new LinkedList<>();
        private static BookRepository repositoryInstance = null;



    private BookRepository() {
        this.bookRepository.add(new Book ("Pirates",600,120));
        this.bookRepository.add(new Book ("Anders",150,240));
        this.bookRepository.add(new Book ("Nevernding Story",680,90));
        this.bookRepository.add(new Book ("Santanders",130,68));
        this.bookRepository.add(new Book ("Zalazar",420,200));
        this.bookRepository.add(new Book ("ET",985,350));
        this.bookRepository.add(new Book ("Null",142,140));
        this.bookRepository.add(new Book ("Barbarians",324,16));
        this.addBook(new Book ("Name of the WInd", 800,100));  //worse method, as it requires calling another method. Then again, who adds this stuff in a constructor.
    }
    public void printRepository(){
        for (Book book : this.bookRepository) {
            System.out.println(book);
        }
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
    public void sortBooks(Comparator c){                            //worse method, easy to break things by adding a silly comparator.
        this.bookRepository.sort(c);
    }

    public void sortBooksByPages(){
        Comparator c = new Comparator(){
            @Override
            public int compare(Object o, Object o1){
                if (!(o instanceof Book)|| !(o1 instanceof Book)){
                    return -1;
                }
                return ((Book)  o).getPages() - (((Book) o1).getPages());
            }
        };
        this.bookRepository.sort(c);
    }
    public void sortBooksByPrice(){
        Comparator c = new Comparator(){
            @Override
            public int compare(Object o, Object o1){
                if (!(o instanceof Book)|| !(o1 instanceof Book)){
                    return -1;
                }
                return ((Book)  o).getPrice() - (((Book) o1).getPrice());
            }
        };
        this.bookRepository.sort(c);
    }
    public void sortBooksByTitle(){
        Comparator c = new Comparator(){
            @Override
            public int compare(Object o, Object o1){
                if (!(o instanceof Book)|| !(o1 instanceof Book)){
                    return -1;
                }
                return ((Book)  o).getTitle().compareTo (((Book) o1).getTitle());
            }
        };
        this.bookRepository.sort(c);
    }

    @Override
    public String toString() {
        return "BookRepository {" +
                "bookRepository=" + bookRepository +
                '}';
    }
}

