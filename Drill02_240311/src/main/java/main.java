public class main {

    public static void main(String[] args) {

        String str1 = "고먐미 고먐미 고고먐미 고먐미";

        int i1 = str1.indexOf('고');
        int i2 = str1.indexOf('고', 3);

        int i3 = str1.indexOf("먐미");
        int i4 = str1.lastIndexOf("고먐미");
        int i5 = str1.lastIndexOf("고먐미", 7);

        int i6 = str1.indexOf('이');

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);

        char[] yutnori = {'도', '개', '걸', '윷', '모'}; //선언

        int length = yutnori.length; // 배열 길이 반환

        // []안에 인덱스 정수를 넣어 접근
        // 0 부터 시작
        char first = yutnori[0]; //도
        char last = yutnori[yutnori.length - 1]; //모

        //배열 -> 각각이 담는 자료형의 크기만큼 저장된 주소값을 담음, 불필요한 큰 배열 선언 X

        // 이중 배열
        boolean[][] dblBoolAry = new boolean[3][3];

        int[][] dblIntAry = new int[][]{
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
        };


        int int1 = dblIntAry[0][1]; //2
        int int2 = dblIntAry[2][3]; //9
        int[] intAry = dblIntAry[1]; // [4, 5]

        //삼중 배열
        char[][][] trpChrAry = {
                {{'자', '축'}, {'인', '묘'}},
                {{'진', '사'}, {'오', '미'}},
                {{'신', '유'}, {'슬', '해'}},
        };


        char[][] dblChrAry = trpChrAry[0]; // 0번째 이중배열 꺼내기 //[자, 축], [인, 묘]
        char[] chrAry = dblChrAry[0]; //chrAry : [자, 축] //위 중 첫 번째
        char ch1 = chrAry[1]; // ch1 = '축'
        char ch2 = trpChrAry[2][0][1]; // '유'

        //배열은 주소값을 가져간다, 메모리 안의 그 주소를 바라보게 된다.

        int[] intAry1 = {1, 2, 3}; // [1, 100, 3]
        int[] intAry2 = {4, 5}; // [1, 100, 3]
        intAry2 = intAry1; // [1, 100, 3]
        intAry2[1] = 100; // [1, 100, 3]

        char[] chAry1 = {'A', 'B', 'C'}; // [A, B, 다]
        char[] chAry2 = {'a', 'b', 'c', 'd', 'e'}; // [A, B, 다]
        chAry2 = chAry1; // [A, B, 다]
        chAry1[2] = '다'; //chAry1 : [A, B, 다]

        //상수 배열의 경우
        final int[] NUMBERS = {1, 2, 3, 4, 5};
//        NUMBERS = new int[]{2, 3, 4, 5, 6};

        NUMBERS[0] = 11; // 배열의 요소를 바꾸는 건 가능

        /* var 연산자로 변수 선언 - 타입을 명시하지 않음
        대입된 값을 통해 컴파일러가 추론
        지역 변수에서만 사용 가능 -> 클래스의 필드로는 불가
        */

        var intNum = 1;
        var doubleNum = 3.14;
        var charLet = 'A';
        var StringWord = "안녕";

//        var notInit;  //초기화가 안 됨
//        var nullVar = null;
        System.out.println("------------------------------");

        boolean open = true;
        int saleFrom = 10, saleTo = 20;
        int today = 15;

//        if (open) {
//            System.out.println("영업중");
//        }
//        if (!open) {
//            System.out.println("영업종료");
//        }

        if (open) {
            System.out.println("영업중");
        } else {
            System.out.println("영업종료");
        }

        if (today >= saleFrom && today <= saleTo) {
            System.out.println("세일중");
            System.out.println("전품목 20% 할인");
        }
        System.out.println("------------------------------");

        int fingersOut = 5;

        switch (fingersOut) {

            case 2:
                System.out.println("가위");
                break;
            case 0:
                System.out.println("바위");
                break;
            case 5:
                System.out.println("보");
                break;
            default:
                System.out.println("무효");
        }
        System.out.println("------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (String s = ""; s.length() < 9; s += "*") {
            System.out.println(s);
        }
        System.out.println("------------------------------");

        String yuts = "도개걸윷모";
        char yut = '도';

        boolean isValid = false;
        for (int i = 0; i <= yuts.indexOf(yut); i++) {
            isValid = true;
            System.out.println("앞으로");
        }
        if (!isValid) System.out.println("무효");

        System.out.println("------------------------------");

        int i = 0;
        while (true) {
            int mut = i++;

            if (mut == 100) break;
            if (mut % 3 != 0) continue;

            System.out.println(mut);
        }

        System.out.println("------------------------------");

        /*
         * 메소드 -> 타 언어의 함수 function과 같은 개념
         * 자바는 모든 것이 클래스의 요소이므로 메소드라 부름
         *
         * 메소드의 의미
         * 1. 반복을 최소화 : 한 번 이상 실행될 수 있는 일련의 작업들을 묶어두는 것
         * */

        //실행 하는 건 메인 메서드 안에!

        double xx = 3, yy = 4;
        addSubtMultDiv(xx, yy);


        xx = 10; yy = 2;
        addSubtMultDiv(xx, yy);

        xx = 7; yy = 5;
        addSubtMultDiv(xx, yy);

        System.out.println("------------------------------");

        upTo5(0);
        upTo5(2);
        upTo5(4);

    }
    /*메인 메소드 외부에 선언할 것*/

    static void addSubtMultDiv (double a, double b) {
        System.out.printf("%f + %f = %f%n", a, b, a + b);
        System.out.printf("%f - %f = %f%n", a, b, a - b);
        System.out.printf("%f * %f = %f%n", a, b, a * b);
        System.out.printf("%f / %f = %f%n", a, b, a / b);
    }
        /*
        * static + 반환값의 자료형(없으면 void) + 메소드의 이름 + (매개변수 0~다수)
         { 실행할 코드 or 반환할 값(있을 시) }
        *
        *
        *
        * 매서드 오버로딩
        *  */

        // 매개 변수 (Parameter 의 개수가 다름)
        static int add(int a, int b) { return a + b;}
        static int add(int a, int b, int c) {return a +b +c;}

        // 매개 변수의 자료형이 다름
        static double add(double a, double b) {return a + b;}

        // 매개 변수의 자료형 순서가 다름 (Parameter 의 개수가 다름)
        static String add(String a, char b) {return a + b;}
        static String add(char a, String b) {return a + b;}


        // 반환 자료형이 다른 것은 오버로딩이 안 됨 - 다른 함수명 사용
//        static double add (int a , int b) { return (double) (a + b);}
//    기본적으로 하는 일이 같아야 함

    /*재귀 메소드
    * 스스로를 호출하는 메소드
    * 호출시마다 메모리에 스택이 축적 - 초과시 스택 오버 플로우 에러
    * 재귀 : 원래의 자리로 되돌아가거나 되돌아옴.
    * 길게 가면 위험함
    * */

    static void upTo5 (int start) {
        System.out.println(start);
        if (start < 5) {
            upTo5(++start);
        } else {
            System.out.println("--종료--");
        }
    }


}
