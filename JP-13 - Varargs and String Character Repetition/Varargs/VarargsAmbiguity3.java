class VarargsAmbiguity3 {
    static void count(int... nums) { }
    static void count(Integer... nums) { }

    public static void main(String... args) {
        count(1, 2, 3); 
        return;
    }
}
class VarargsAmbiguity4 {
    static void sum(int a, float... b) { }
    static void sum(float a, int... b) { }

    public static void main(String... args) {
        sum(5, 5); 
        return;
    }
}
