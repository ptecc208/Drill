package section01.exception;

public class Application1 {
    public static void main(String[] args) throws Exception {
        /*예외 처리
        * 자바 프로그램 작성 시 자바 문법에 맞지 않는 경우 코드를 컴파일하려고 할 때 컴파일 에러를 발생시킴
        * -> 문법상의 오류이다. syntax error
        * 오류와 에러
        * 오류 : 실행중인 프로그램이 종료되는 것.
        * 미리 예측하여 처리하는 것이 불가능하며, 오류에 대한 처리는 할 수 없다.
        *
        * 예외
        * 발생할 수 있는 상황을 미리 예측, 처리할 수 있는 미약한 오류
        *
        * 예외
        * 1. throws로 위임
        * 2. try - catch 구문으로 처리
        * */

        ExceptionTest et = new ExceptionTest();

        et.checkEnoughMoney(1000, 5000);
        et.checkEnoughMoney(50000, 10000); // 예외 발생 구문 이하 구문은 동작하지 않고 종료된다.
    }
}
