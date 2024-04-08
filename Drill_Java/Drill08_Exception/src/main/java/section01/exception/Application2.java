package section01.exception;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(1000, 200);
            System.out.println("상품 구입 가능");
        } catch (Exception e) {
            System.out.println("상품 구입 불가");
        }
    }
}
