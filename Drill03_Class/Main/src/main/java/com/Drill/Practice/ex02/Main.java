package com.drill.practice.ex02;

public class Main {
    public static void main(String[] args) {
    //chicken.java에서 정의한 클래스를 메인에서 인스턴스로 사용

        Chicken store1 = new Chicken();
        store1.no = 3;
        store1.name = "판교";

        Chicken store2 = new Chicken();
        store2.no = 20;
        store2.name = "강남";

        //인스턴스의 필드들에 접근
        int store1No = store1.no;
        String store2Name = store2.name;

        //인스턴스의 메소드 호출
        String store1Intro = store1.intro();
        String store2Intro = store2.intro();


    }
}
