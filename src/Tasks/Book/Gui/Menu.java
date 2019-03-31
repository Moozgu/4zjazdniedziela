package Tasks.Book.Gui;

import Tasks.Book.Data.BookRepository;
import Tasks.Book.Model.Book;

import java.util.Scanner;

public class Menu {



    public static void Library(){
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while(input!=6){
            displayMenu();
            input = Integer.parseInt(scanner.nextLine());
            switch(input){
                case 1:
                    BookRepository.getBookRepositoryInstance().addBook(Menu.getDataFromUser());
                    break;
                case 2:
                    BookRepository.getBookRepositoryInstance().printRepository();
                    break;
                case 3:
                    BookRepository.getBookRepositoryInstance().sortBooksByTitle();
                    break;
                case 4:
                    BookRepository.getBookRepositoryInstance().sortBooksByPrice();
                    break;
                case 5:
                    BookRepository.getBookRepositoryInstance().sortBooksByPages();
                    break;
                case 6:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Incorrect input detected");
                    break;
            }
        }

    }
    public static void displayMenu(){
        System.out.println("Welcome to the Library");
        System.out.println("1. Add a book");
        System.out.println("2. Display books");
        System.out.println("3. Sort by title");
        System.out.println("4. Sort by price");
        System.out.println("5. Sort by amount of pages");
        System.out.println("6. Exit");
    }
    public static Book getDataFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book's tile");
        String title = scanner.nextLine();
        System.out.println("Enter book's price");
        int price = 0;
        boolean flag = true;
        while (flag) {
            try {
                price = Integer.parseInt(scanner.nextLine());
                flag=false;
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("Wrong input, try a number instead!");
            }
        }
        System.out.println("Enter book's pages amount");
        int pages = 0;
        flag=true;
        while(flag) {
            try {
                pages = Integer.parseInt(scanner.nextLine());
                flag=false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input, try a number instead!");
            }
        }
        return new Book(title,pages,price);
    }
}
