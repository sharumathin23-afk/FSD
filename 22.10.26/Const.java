package Day5;

public class Const {
    public static void main(String[] args) {
        Son s = new Son();
        Son s1 = new Son(10);
        s1.displayFather();
        s1.displaySon();
    }
}
class Father {
    Father() {
        System.out.println("Father Default Constructor");
    }

    Father(int a) {
        System.out.println("Father Parameterized Constructor");
    }

    void displayFather() {
        System.out.println("Father User-defined Method");
    }
}

class Son extends Father {
    Son() {
        super();
        System.out.println("Son Default Constructor");
    }

    Son(int a) {
        super(a);
        System.out.println("Son Parameterized Constructor");
    }

    void displaySon() {
        System.out.println("Son User-defined Method");
    }
}



