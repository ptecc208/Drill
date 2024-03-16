package com.drill.practice.ex03;

public class Chicken {

    int no;
    String name;
    ChickenMenu[] menus;

    //생성자(constructor) : 인스턴스를 만드는 메소드
    // this : 생성될 인스턴스를 가리킴
    Chicken (int no, String name) {
        this.no = no;
        this.name = name;
        this.menus = menus;
    }

    ChickenMenu orderMenu (String name) {
        for (ChickenMenu menu : menus) {
            if (menu.name.equals(name)) {
                return menu;
            }
        }
    }
    return null;

}
