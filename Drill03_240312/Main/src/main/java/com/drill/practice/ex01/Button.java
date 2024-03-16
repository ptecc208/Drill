package com.drill.practice.ex01;

// 이 패키지 안의 button 이란 클래스
public class Button {

    char print;
    int space;
    String mode;

    Button (char print, int space, String mode){
        this.print = print;
        this.space = space;
        this.mode = mode;
    }

    //출력하는 메서드
    void place () {
        System.out.printf(
                "표시 : %c, 공간 : %s, 모드 : %s%n",
                print, space, mode
        );

    }
}

