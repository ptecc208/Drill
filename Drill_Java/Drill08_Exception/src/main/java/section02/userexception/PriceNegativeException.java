package section02.userexception;

public class PriceNegativeException extends NegativeException {

    /*사용자 정의 예외클래스를 만들기 위해선 Exception 클래스를 상속 받으면 된다.
     * 경우에 따라서는 더 상위 타입인 Throwable 클래스나 하위 타입의 클래스를 상속 받기도 한다.
     * */
    public PriceNegativeException(String message) {
        super(message);
    }
}
