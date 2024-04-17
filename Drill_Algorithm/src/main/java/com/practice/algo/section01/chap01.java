package com.practice.algo.section01;

import java.util.Scanner;

public class chap01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수 중 최대값?");
        System.out.print("a의 값 : ");
        int a = sc.nextInt();
        System.out.print("b의 값 : ");
        int b = sc.nextInt();
        System.out.print("c의 값 : ");
        int c = sc.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("max = " + max);

        //이렇게 여러 프로세스가 순차적으로 실행되는 구조 : 순차적 구조 (concatenation)
        // if 문 == select절


        max = Max3m(3, 4, 55);
        System.out.println("max = " + max);

        int min = min4(23, 211, 2, 33);
        System.out.println("min = " + min);

        int medium = medium(111, 332, 2);
        System.out.println("medium = " + medium);

        int medium2 = medium2(1, 33, 22);
        System.out.println("medium2 = " + medium2);

        //알고리즘은 문제를 해결하기 위한 것으로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합


    }

    public static int Max3m(int a, int b, int c) { // 최대값
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static int min4(int a, int b, int c, int d) { // 최소값
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        return min;
    }

    public static int medium(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
        if (b >= a)
            if (a >= c)
                return a;
        return c;
    }

    public static int medium2(int a, int b, int c) {
        if ((a >= b && b >= c) || (c >= b && b >= a)) {
            // b가 중간 값인 경우
            return b;
        } else if ((b >= a && a >= c) || (c >= a && a >= b)) {
            // a가 중간 값인 경우
            return a;
        } else {
            // c가 중간 값인 경우
            return c;
        }
    }
}
