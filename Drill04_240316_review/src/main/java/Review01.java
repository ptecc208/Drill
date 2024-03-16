import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class Review01 {

    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.print("문자열을 입력하시오");
//
//        String str = br.readLine();
//
//        System.out.println(str + "가 입력되었습니다.");

        //System.in -> standard input 에 연결. -> 키보드


//         int num = Integer.parseInt(str);
//         double num = Double.parseDouble(str);

//    public static void main(String[] args) throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamreader(System.in));
//                String str = br.readLine();

//        연산자 : opeartor / 피연산자 : operand
//     new : 객체 생성

        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        int result = num % 2;

        switch (result) {
            case 0 :
                System.out.println("짝수입니다");
                break;
            case 1 :
                System.out.println("홀수입니다.");
                break;
            default :
                break;
        }*/
        //break 사용하지 않으면 break 없는 케이스부터 쭉 실행된다.
        /* 논리 연산자 = logical operator
        %% : 모두 참이어야 함, 한쪽이라도 거짓이면 false
        || : 둘 중 하나라도 참이면 true
        */

        /*
         * for (초기화식 ; 다시 반복할지 확인하는 식 ; 변화를 주기 위한 식
         *       초기화  ; 조건이 false가 될 때 까지 ;        증감식       )
         * for (int i = 10; i >= 1; i--) -> 역순이 됨 */

        //숫자의 시작과 끝까지 범위 내에서 숫자의 배수의 합을 구하라

//        int num1 = 24, num2 = 15, num3 = 8;
//        int sum = 0;
//
//        for (int i = num2; i <= num1; i++) {
//            sum += i; // sum = sum + i
//            System.out.print(num2 + (num1 - i) + " ");
//        }
//        System.out.println();
//
//        System.out.println(sum);
        //구구단

//        for (int dan = 2; dan <= 9; dan++){
//            for (int i = 1; i <= 9; i++)
//            System.out.println(dan + " * " + i + " = " + dan * i );
//        }

//        System.out.print("1~10 사이의 정수를 입력하시오");
//        String num = br.readLine();
//        int A = Integer.parseInt(num);
//        int count = 1;
//
//        for (int i = 1; i <= A; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//                count++;
//            }
//            System.out.println();

//        int A = Integer.parseInt(num);
//
//        for (int i = 0; i <= A; i++) {
//            for (int j = 0; j < (i-1) ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i <= A; i++) {
//            for (int j = (A-i); j >= 1; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 한 개를 입력하세요");
//        int num = sc.nextInt();
//
//        if (num < 1) {
//            System.out.println("1 이상의 숫자를 입력해주세요");
//        } else {
//            for (int i = 1; i <= num; i++) {
//                System.out.print(i + " ");
//            }
//        }

        /*위 문제와 모든 것이 동일하나,
        1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요. */

//        Scanner sc = new Scanner(System.in);


//        System.out.print("정수 한 개를 입력하세요");
//        int num = sc.nextInt();
//
//        while (true) {
//            if (num < 1) {
//                System.out.println("1 이상의 숫자를 입력해주세요");
//                num = sc.nextInt();
//            } else {
//                for (int i = 1; i <= num; i++) {
//                    System.out.print(i + " ");
//                }
//            }
//            break;
//        }

//        //열번 찍어 안넘어가는 나무 없다
//        int hit = 0;
//        while (hit < 10) {
//            hit++;
//            System.out.println("나무를" + hit + "번 찍었습니다.");
//            if (hit == 10) {
//                System.out.println("나무를 쓰러뜨렸습니다.");
//                break;
//            }
//        }

        /* 무한 루프 = while 문으로 구현 가능 -> 자주 사용 -> 횟수가 정해지지 않았을 때
        while (true) {
        수행할 문장 1
        수행할 문장 2....
        }
        조건 자체가 true이므로 항상 참이 된다. -> 무한 루프
        하지만 강제로 while 문을 빠져 나가야할 때도 있다. -> 강제로 멈춰야할 때 : break;
        밑은 커피 자판기를 예로 든다. 남은 커피가 다 떨어지면 판매 중지하여라.*/

//        int coffee = 10;
//        int money = 300;
//
//        while (money > 0) {
//            System.out.println("커피를 내려줍니다");
//            coffee--;
//            System.out.println("남은 커피의 양은 " + coffee + "입니다.");
//            if (coffee == 0) {
//                System.out.println("커피가 매진됐으므로 판매를 중지");
//                break;
//            }
//        }

        // 1부터 10까지의 수 중 홀수만을 출력해보자 while을 이용하여.
//        int a = 0;
//        while (a < 10) {
//            a++;
//            if (a % 2 == 0) {
//                continue;
//            }
//            System.out.print(a + " ");
//        }

        //배열 //
        int[] score = new int[5]; // int 타입의 값 5개가 저장될 빈 공간 생성
//        score[0] = 10; // 각 빈 공간에 값을 초기화
//        score[0] = 20; // 각 빈 공간에 값을 초기화
//        score[0] = 30; // 각 빈 공간에 값을 초기화
//        score[0] = 40; // 각 빈 공간에 값을 초기화
//        score[0] = 50; // 각 빈 공간에 값을 초기화

        //for 문으로 배열을 순차적으로 순회에 값을 넣어주는 방법도 있다.
        for (int k = 0; k < score.length; k++) {
            score[k] = k + 10;
        }
        for (int k = 0; k < score.length; k++) {
            System.out.print(score[k] + " ");
        }
        System.out.println();

        //처음부터 선언 + 초기화를 한번에 진행
        int[] score2 = {10, 20, 30, 40, 50};

        //String 형 배열 선언 & 초기화
        String[] name = new String[3];
        name[0] = "wi";
        name[1] = "kim";
        name[2] = "park";
        for (int j = 0; j < name.length; j++) {
            System.out.print(name[j] + " ");
        }
        System.out.println();


        // 내가 만든 배열의 상태를 보기 위해 콘솔에 배열 내용물을 출력
        /* System.out.println(score); // 이거는 배열이라는 방의 주소를 불러옴
        따라서 for 문을 이용해서 배열 각 원소들을 순회하여 출력하도록 하드코딩하거나
        자바에서 제공해주는 Arrays.toString() 메소드를 이용해서 배열을 문자열 형식으로 만들어 출력
         */

        int[] iArr = {100, 95, 80, 70, 60};

        for (int i = 0; i < iArr.length; i++) {
            System.out.print(iArr[i] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr));

    }
}
