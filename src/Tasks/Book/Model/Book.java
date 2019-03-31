package Tasks.Book.Model;

public class Book {
    private String title;
    private int pages;
    private int price;

    public Book(String title, int pages, int price) {
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book {" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}
