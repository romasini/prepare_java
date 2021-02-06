package lesson2.task_1;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> testList = new LinkedList<>();

        testList.add("string1");
        testList.add("string2");

        System.out.println(testList);

        testList.remove("string2");
        System.out.println(testList);

        testList.add(1, "string3");
        System.out.println(testList);

        testList.add(1, "string4");
        System.out.println(testList);

        System.out.println(testList.get(1));
        System.out.println(testList.getFirst());
        System.out.println(testList.getLast());

        testList.removeLast();
        System.out.println(testList);

        testList.removeFirst();
        System.out.println(testList);

        System.out.println(testList.size());

        testList.addLast("stringLast");
        testList.addFirst("stringFirst");
        System.out.println(testList);

        System.out.println(testList.isEmpty());

        System.out.println(testList.contains("string4"));

    }
}
