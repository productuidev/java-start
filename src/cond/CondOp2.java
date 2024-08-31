package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 15;
        // 삼항연산자
        // (조건) ? 참-표현식 : 거짓-표현식
        String status = age >= 18
                ? "성인"
                : "미성년자;";

       System.out.println("age = " + age + ", status = " + status);
    }
}