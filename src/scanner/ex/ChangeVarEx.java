package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10, b = 20, temp;

        temp = a; // temp = 10
        a = b; // a = 20
        b = temp; // b = 10

        System.out.println("a = " + a); // a = 20
        System.out.println("b = " + b); // b = 10
    }
}
