package run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        /*
        * LinkedList
        * 이중 연결 리스트 -> 이전 요소도 링크하여 이전 요소로 쉽게 접근
        * */
        List<String> linked = new LinkedList<>();

        linked.add("apple");
        linked.add("banana");
        linked.add("orange");
        linked.add("mango");
        linked.add("grape");

        for (int i = 0; i < linked.size(); i++) {
            System.out.print(linked.get(i) + " ");
        }
        System.out.println();

        linked.remove(1);
        for (String s : linked) {
            System.out.print(s + " ");
        }

        linked.set(0, "strawberry");

        System.out.println(linked);
        System.out.println(linked.isEmpty());
        linked.clear();
        System.out.println(linked.isEmpty());
    }
}
