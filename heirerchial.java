class Name {
    String userName = "Shrish";
}
class Surname extends Name {
    String surName;
    Surname(String surName) {
        this.surName = surName;
    }
    String getFullName() {
        return userName + " " + surName;
    }
}
class Ages extends Surname {
    int userAge = 19;
    Ages() {
        super("Wadgaonkar"); 
    }
    void displayUser() {
        System.out.println("Full Name: " + getFullName());
        System.out.println("Age: " + userAge);
    }
    public static void main(String[] args) {
        Ages userProfile = new Ages();
        userProfile.displayUser();
    }
}
