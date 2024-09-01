package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        // 코드 간략 버전
        // int[] students = new int[]{90, 80, 70, 60, 50} ; // 배열 변수 생성과 초기화
        int[] students = {90, 80, 70, 60, 50} ; // 배열 변수 생성과 초기화
        // System.out.println(students.length);

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수 : " + students[i]);
        }

    }
}
