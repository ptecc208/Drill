package run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

//        List list = new ArrayList();
        ArrayList alist = new ArrayList();
        alist.add("apple");
        alist.add(123);
        alist.add(45.45);
        alist.add(new Date());

        System.out.println(alist);
        System.out.println(alist.size());

        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
        System.out.println();

        List<String> strList = new ArrayList<>();
        strList.add("apple");
        strList.add("banana");
        strList.add("orange");
        strList.add("mango");
        strList.add("grape");

        System.out.println(strList);
        Collections.sort(strList);
        System.out.println(strList);

        strList = new LinkedList<>(strList);
        Iterator<String> sIter = ((LinkedList<String>) strList).descendingIterator();
//        while(sIter.hasNext()) {
//            System.out.print(sIter.next() + " ");
//        }

        List<String> sList = new ArrayList<>();
        while (sIter.hasNext()) {
            sList.add(sIter.next());
        }
        System.out.println(sList);
    }
}
