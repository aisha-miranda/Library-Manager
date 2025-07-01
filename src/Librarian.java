public class Librarian extends User {
    public Librarian(int id, String name) {
        super(id, name);
    }

    public void giveBook(Book book, Student student) {
        if (book.isAvailable()) {
            student.getBorrowedBooks().add(book);
            book.setAvailable(false);
            System.out.println("Книга '" + book.getTitle() + "' выдана студенту " + student.getName());
        } else {
            System.out.println("Книга недоступна для выдачи");
        }
    }
}

