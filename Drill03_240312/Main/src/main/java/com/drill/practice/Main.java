package com.drill.practice;

public class Main {
    public static void main(String[] args) {

        // 만약 클래스가 존재하지 않는다면? 아래와 같이 체계적이지 않음.
        // 01 버튼
        char btn01Print = '1';
        int btn01Space = 1;
        String btn01Mode = "Dark";

        placeButton(btn01Print, btn01Space, btn01Mode);

        // 더하기 버튼
        char btnPlusPrint = '+';
        int btnPlusSpace = 3;
        String btnPlusMode = "Dark";

        placeButton(btnPlusPrint, btnPlusSpace, btnPlusMode);

        // 클리어 버튼
        char btnClearPrint = 'C';
        int btnClearSpace = 2;
        String btnClearMode = "Dark";

        placeButton(btnClearPrint, btnClearSpace, btnClearMode);

    }


    static void placeButton(char print, int space, String mode) {
        System.out.printf(
                "표시 : %c, 공간 : %s, 모드 : %s%n",
                print, space, mode
        );
    }





}


