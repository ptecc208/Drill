package com.drill.practice.ex03;

public class Chicken {

    int no;
    String name;

    //생성자(constructor) : 인스턴스를 만드는 메소드
    // this : 생성될 인스턴스를 가리킴
    Chicken (int no, String name) {
        this.no = no;
        this.name = name;
    }

    String intro () {
        // String name = "몽고반"; // 주석 해제 시 name 대체
        return "안녕하세요, %d호 %s점입니다."
                .formatted(no, name);

    }

}
