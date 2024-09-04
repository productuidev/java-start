package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // double형 매개변수에 int형 인수를 전달 (자동형변환)
    }

    public static void printNumber(double n) {
        System.out.println("숫자 :" + n); // 숫자 : 100.0
    }
}
