package casting;

public class Casting4 {
    public static void main(String[] args) {
        // 자바 계산 2가지 기억
        // 1. 같은 타입끼리의 계산은 같은 타입의 결과
        // int + int = int, double + double = double
        // 2. 서로 다른 타입의 계싼은 큰 범위로 자동 형변환이 일어남
        // int + long = long + long
        // int + double = double + double

        int div1 = 3 / 2; // int / int
        System.out.println("div1 = " + div1); // div1 = 1
        
        double div2 = 3 / 2; // int / int -> double 형변환
        System.out.println("div2 = " + div2); // div2 = 1.0
        
        double div3 = 3.0 / 2; // double / int -> double / double
        System.out.println("div3 = " + div3); // div3 = 1.5
        
        double div4 = (double) 3 / 2; // double / double
        System.out.println("div4 = " + div4); // div4 = 1.5
        
        int a = 3, b = 2;
        double result = (double) a / b; // double / int -> double / double
        System.out.println("result = " + result); // result = 1.5
    }
}
