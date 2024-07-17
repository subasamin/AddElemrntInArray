package ss6.book;

public class Book {
    private double bookCode;
    private String bookName;
    private String author;
    private float price;

    public Book(double bookCode, String bookName, String author, float price) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public double getBookCode() {
        return bookCode;
    }

    public void setBookCode(double bookCode) {
        this.bookCode = bookCode;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
