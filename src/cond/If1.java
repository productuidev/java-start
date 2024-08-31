package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20;

        if(age >= 18) { // true
            System.out.println("성인입니다.");
        }

        if(age < 18) { // false
            System.out.println("미성년자입니다.");
        }
    }
}
