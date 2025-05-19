package generice;

import java.util.ArrayList;
import java.util.List;

public class Typesafety {

    public static void main(String[] args) {
/*
        // This code is not type safety generics
        List list = new ArrayList();
        list.add("Hello");
        list.add(1);

 */
        // This code is type safety generics String
        List<String> list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add("1");

        // This code is type safety generics Integer
        List<Integer> list2 = new ArrayList();
        list2.add(1);
        list2.add(2);

        System.out.println(list);
        System.out.print(list2);
    }
}
