class VarargsAmbiguity1 {
    static void check(String... s) { System.out.println("String Varargs"); }
    static void check(int... i) { System.out.println("Integer Varargs"); }

    public static void main(String... args) {
        check("abcd");
        check(5);
        check();
    }
}
