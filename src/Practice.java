public class Practice {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        Admin admin = new Admin(1, "Damir");
        Librarian librarian = new Librarian(2, "Petya");
        Student student = new Student(3, "Miron");
        Supplier supplier = new Supplier(4, "Mansur");

        manager.addUser(admin);
        manager.addUser(librarian);
        manager.addUser(student);
        manager.addUser(supplier);

        Book book1 = new Book("Война и мир", "Л.Н. Толстой", 1869);
        Book book2 = new Book("Қара сөздер", "Абай Кунанбаев", 1898);

        // Supplier delivers books
        supplier.deliverBook(book1, manager);
        supplier.deliverBook(book2, manager);

        System.out.println();

        // Librarian gives away books to a student
        librarian.giveBook(book1, student);
        librarian.giveBook(book2, student);
        System.out.println(student.getName() + " взял книгу: " + book1.getTitle());
        System.out.println(student.getName() + " взял книгу: " + book2.getTitle());

        System.out.println();

        // Librarian receives books from a student
        librarian.receiveBook(book1, student);
        librarian.receiveBook(book2, student);
        System.out.println(student.getName() + " вернул книгу: " + book1.getTitle());
        System.out.println(student.getName() + " вернул книгу: " + book2.getTitle());

        System.out.println();

        // Admin browses the lists of users and books
        admin.printUsers(manager);
        admin.printBooks(manager);
    }
}
