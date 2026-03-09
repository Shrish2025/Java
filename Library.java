public class Library {
    public Book[] shelf = new Book[500];
    public int totalBooks = 0;

    public void addNewBooks(String year, int title, int words, int ed, int qty) {
        for (int i = 1; i <= qty; i++) {
            if (totalBooks < 500) {
                shelf[totalBooks] = new Book(year, title, words, ed, i);
                totalBooks++;
            }
        }
    }

    public void issueBook(String code, LibStudent s) {
        for (int i = 0; i < totalBooks; i++) {
            if (shelf[i].barcode.equals(code) && !shelf[i].isIssued) {
                shelf[i].isIssued = true;
                s.booksTaken++;
                System.out.println("Book Issued Successfully!");
                return;
            }
        }
        System.out.println("Book unavailable or incorrect barcode.");
    }

    public void returnBook(String code, LibStudent s) {
        for (int i = 0; i < totalBooks; i++) {
            if (shelf[i].barcode.equals(code) && shelf[i].isIssued) {
                shelf[i].isIssued = false;
                s.booksTaken--;
                s.booksReturned++;
                System.out.println("Book Returned Successfully!");
                return;
            }
        }
        System.out.println("Return failed.");
    }
}