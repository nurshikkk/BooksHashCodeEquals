public class Main {
    public static void main(String[] args) {
        Book book = new Book("Anna Karenina", "Tolstoy", new String[876], 1877);
        Book book1 = new Book("1984", "George Orwell", new String[346], 1949);
        boolean isHashCodeEquals = book.hashCode() == book1.hashCode();

        if (isHashCodeEquals) {
            System.out.println("Books are similar");
        } else if (book.equals(book1)) {
            System.out.println("Books are similar");
        } else {
            System.out.println("Books are not similar");
        }
    }
}