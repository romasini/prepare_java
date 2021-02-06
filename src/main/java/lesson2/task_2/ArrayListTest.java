package lesson2.task_2;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("string1");
        arrayList.add(0, "string2");
        arrayList.add("string3");
        System.out.println(arrayList);

        System.out.println(arrayList.get(1));

        arrayList.remove("string2");
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("string1"));
        System.out.println(arrayList.isEmpty());


    }
}
