package com.practice.algo.section01;
import java.util.Scanner;
public class chap01_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구하시오");
        System.out.print("n의 값 : ");
        int command = sc.nextInt();



        /* for 문 이용
        int sum = 0;
        for(int i = 0; i <= command; i++){
            sum += i;
        } */


        /* while 문 이용
        int i = 1;
        while (i <= command){
            sum += i;
            i++;
        }
        System.out.println(sum);

        */
        /* 사전 판단 반복문인 While 문과 for문은 처음에 제어식을 평가한 결과가 0이면 루프 본문은 한번도
        실행되지 않는다. do while은 한번은 실행해야한다.
        * */



    }
}
