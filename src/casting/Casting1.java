package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);
        
        doubleValue = intValue; // int -> double
        // 자동 형변환 (묵시적 형변환)
        // doubleValue = (double) intValue;
        // doubleValue = (double) 10;
        // doubleValue = 10.0.;
        System.out.println("doubleValue = " + doubleValue);
        
        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
