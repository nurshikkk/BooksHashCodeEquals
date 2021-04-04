import java.util.Arrays;
import java.util.Objects;

public class Book {
    private final String name;
    private final String author;
    private final String[] pages;
    private final int year;

    public Book(String name, String author, String[] pages, int year) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public void print() {
        for (String page : pages) {
            System.out.print(page);
        }
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Arrays.equals(pages, book.pages);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, author, year);
        result = 31 * result + Arrays.hashCode(pages);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + Arrays.toString(pages) +
                ", year=" + year +
                '}';
    }
}