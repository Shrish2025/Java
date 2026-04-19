class VarargsAmbiguity2{
    static void m(String s, String... var){ 
        System.out.println("A"); 
    }
    static void m(String... var){
        System.out.println("B");
    }

    public static void main(String... args){
        m("Hello", "World");
        return;
    }
}
