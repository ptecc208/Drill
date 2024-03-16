package com.drill.practice.ex02;


//치킨의 본사라고 생각하면 됨
public class Chicken {
    /*인스턴스가 가질 필드들
    클래스 파일의 이름은 클래스의 이름과 동일해야 함 (Public Class일 시)
      */

    int no;
    String name;

    //인스턴스가 가질 메소드 - Static을 붙이지 않음

    String intro () {
        //no와 name 앞에 this를 붙인 것과 같음
        return "안녕하세요, %d호 %s점입니다."
                .formatted(no, name);
    }

}
