package section02;

import section02.userexception.MoneyNegativeException;
import section02.userexception.NotEnoughMoneyException;
import section02.userexception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000,-30000);
        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException 발생");
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally 블럭의 내용이 동작함");
        }
    }
}
