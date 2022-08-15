public class Main {

    public static void main(String[] args) {
        Book book = new Book("Java. Complete reference", "H.Shildt");
        book.print();
        Journal journal = new Journal("Foreign Policy");
        journal.print();

        Printable[] printables = {book, journal};
        for (Printable p : printables) {
            p.print();
        }
    }

}
