class ThisVarargs {
    // Varargs constructor
    ThisVarargs(String... tags) {
        System.out.println("Tags assigned: " + tags.length);
        for (String t : tags) {
            System.out.println(" - " + t);
        }
    }

    // Default constructor using constructor chaining (this)
    ThisVarargs() {
        this("General", "Unassigned"); 
    }

    public static void main(String[] args) {
        System.out.println("--- Creating object 1 (Default) ---");
        new ThisVarargs(); // Calls the ThisVarargs() constructor, which chains to ThisVarargs(String...)

        System.out.println("\n--- Creating object 2 (Specific) ---");
        new ThisVarargs("Java", "OOP", "Varargs"); // Calls ThisVarargs(String...) directly

        System.out.println("\n--- Creating object 3 (Empty) ---");
        new ThisVarargs(new String[0]); // Explicitly passing an empty array
    }
}
