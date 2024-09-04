package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String msg = "Hello, world!";

        printMsg("Hello, world!", 3);
        printMsg("Java", 5);
        printMsg("Hi", 7);
    }

    public static void printMsg(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}
