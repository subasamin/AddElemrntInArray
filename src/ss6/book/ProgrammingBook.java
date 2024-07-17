package ss6.book;

public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook(double bookCode, String bookName, String author, float price, String language, String framework) {
        super(bookCode, bookName, author, price);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public static float getAmount() {
        return 0.05F;
    }
}
