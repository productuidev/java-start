package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        // 3일 때는 출력하지 않음
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
