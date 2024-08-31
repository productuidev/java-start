package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        // i = 1, endNum = 3 (반복 횟수 정하기)
        while (i <= endNum) { // i가 endNum이 될 때까지 코드 블럭 실행
            sum = sum + i;
            System.out.println("i = " + i + ", sum = " + sum);
            i++;
        }

    }
}
