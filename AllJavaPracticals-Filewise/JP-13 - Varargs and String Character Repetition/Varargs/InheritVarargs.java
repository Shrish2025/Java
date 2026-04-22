class Varargs {
    // Parent method: Simple processing
    void process(String... data) {
        System.out.println("In Original process:");
        System.out.println("Parent: Printing data count -> " + data.length);
    }
}

class InheritVarargs extends Varargs {
    @Override
    void process(String... data) {
        System.out.println("In Overridden process:");
        String result = "";
        for(String subject : data){
            System.out.println(subject);
            result += subject;
        }
        System.out.println("Child (Fast): Concatenated length -> " + result.length());
    }
}

class Main {
    public static void main(String[] args) {
        Varargs p1 = new Varargs();
        Varargs p2 = new InheritVarargs();

        p1.process("Java", "OOP");
        p2.process("Java", "OOP", "DM");
    }
}
