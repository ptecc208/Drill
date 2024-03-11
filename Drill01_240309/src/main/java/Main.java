import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * 조건식의 다양한 예
        * 90 <= x && x <= 100 //정수 x가 90이상 100이하
        * x < 0 || x > 100 // 0보다 작거나 100보다 클 때
        * x%3==0 && x%2!=0 // 3의 배수이지만, 2의 배수는 아닐 때
        * ch == 'y' || ch == 'Y' // 문자 ch가 y 또는 Y일 때
        * 'A' <= ch && ch <= 'Z' // 문자 ch가 대문자일 때
        * 'a' <= ch && ch <= 'z' // 문자 ch가 소문자일 때
        * '0' <= ch && ch <= '9' // 문자 ch가 숫자일 때
        * str.equals("yes") // 문자열 str의 내용이 "yes"일 때 (대문자)
        * str.equalsIgnoreCase"yes" //문자열 str의 내용이 "yes"일 때 (대소문자 구분 X)
        * */

        System.out.println("------------학점 보여주기------------");

        int score =  0;
        char grade = ' ', opt = 0;

        System.out.println("점수를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if(score >= 90) {
            grade = 'A';
            if (score >= 98) {
            opt = '+';
        } else if (score < 95) {
                opt = '-';
            }

        } else if (score >= 80) {
            grade = 'B';
            if (score >= 86) {
                opt = '+';
            } else if (score < 86) {
                opt = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
         if (score >= 76) {
                opt = '+';
            }
            if (score < 76) {
             opt = '-';
        }
         }   else {
            grade = 'D';
        }
        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);

        System.out.println("------------------------");


        // 양수인지 음수인지
//        if (num >= 0 ) {
//            if (num !=0) {
//                sign = '+';
//            } else {
//                sign = '-';
//            }
//        }



        int number = 3;

        if(number == 1){
            System.out.println("if 블록입니다.");
        } else if (number == 3) {
            System.out.println("else if 블록입니다.");
        } else {
            System.out.println("else 블록입니다.");
        }

        System.out.println("------------------------");

        int[] array01 = {1, 2, 3, 4, 5};

        for (int i = 0; i < array01.length; i++) {
            System.out.println("i = " + array01[i]);
        }

        System.out.println("------------------------");

        int[] array02 = {11, 22, 33};
        int j = 0;

        while (j < array02.length) {
            System.out.println("j = " + array02[j]);
            j++;
        }

        System.out.println("------------------------");

        String str = "ABCDE";
        char ch = str.charAt(4);
        String str2 = str.substring(1, 4);
        String str3 = str.substring(3);
        String str4 = str.substring(1, str.length());

        System.out.println(ch);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("------------------------");


        }
    }
