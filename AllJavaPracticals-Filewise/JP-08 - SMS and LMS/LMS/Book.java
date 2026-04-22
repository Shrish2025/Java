public class Book {
    public String title;
    public String barcode;
    public boolean isIssued = false;

    public Book(String year, int first, int words, int edition, int itemNum) {
        // You need to pass all necessary data to the generator
        this.barcode = generateBarcode(year, first, words, edition, itemNum);
    }

    private String generateBarcode(String year, int first, int words, int edition, int itemNum) {
        int N = words;
        if (N > 9) N = 9;
        
        // Use the actual variable names passed into the method
        return String.format("%s%d%d7%d%d", year, first, N, edition, itemNum);
    }
}