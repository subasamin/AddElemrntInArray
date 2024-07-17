package ss6.book;

public class FictionBook extends Book {
    private String category;

    public FictionBook(double bookCode, String bookName, String author, float price, String category) {
        super(bookCode, bookName, author, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static float getAmount() {
        return 0.07F;
    }
}
