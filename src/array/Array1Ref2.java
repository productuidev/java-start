package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; // int형 배열 변수 선언
        students = new int[5]; // int형 변수 5개 배열 생성

        System.out.println(students.length);

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 배열 리팩토링
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + "의 점수 : " + students[i]);
        }

    }
}
