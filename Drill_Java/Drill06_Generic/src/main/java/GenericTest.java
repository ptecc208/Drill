import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); // list.add(new Integer(10);
        list.add(20);
        list.add(30);

//        Integer i = (Integer) list.get(2); // 컴파일 ok -> 형변환 에러(실행 시)
        Integer i = list.get(2); // 형변환 생략 가능

        System.out.println(list);

        /*제네릭의 장점
         * 타입 안정성을 제공한다.
         * 타입 체크와 형변환을 생략할 수 있으므로 코드가 간결해진다.
         * 형변환 잘못하면 ClassCastException 발생
         */

    }
}
