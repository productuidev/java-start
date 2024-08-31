package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;

        // do-while문은 최초 한번은 실행한다.
        do {
            System.out.println("현재 숫자는 : " + i);
            i++;
        } while (i < 3);

//        while(i < 3) {
//            System.out.println("현재 숫자는 : " + i);
//            i++;
//        }
    }
}
