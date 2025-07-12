public class Library {

    public class Book {
        private String title;

        public Book(String title) {
            this.title = title;
        }

        public void displayTitle() {
            System.out.println("Book Title: " + title);
        }
    }

    public void Books(String title) {
        Book book = new Book(title); 
        book.displayTitle();         
    }

    public static void main(String[] args) {
        Library library = new Library();            
        library.Books("Java Basics"); 
    }
}
