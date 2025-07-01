public class Supplier extends User {
    public Supplier(int id, String name) {
        super(id, name);
    }

    public void deliverBook(Book book, LibraryManager manager) {
        manager.addBook(book);
        System.out.println("Книга '" + book.getTitle() + "' добавлена в библиотеку");
    }
}

