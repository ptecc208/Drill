package com.drill.practice.ex01;

public class Main {

    /*이 메인 메서드에 button이란 클래스를 사용
    자바에서 객체와 인스턴스는 같은 것
    아래의 버튼 하나, 하나가 인스턴스이다.
     */
    public static void main(String[] args) {
        Button button1 = new Button('1', 1, "Dark");
        Button buttonPlus = new Button('+', 3, "Dark");
        Button buttonClear = new Button('C', 2, "Dark");

        button1.place();
        buttonPlus.place();
        buttonClear.place();

    }
}
