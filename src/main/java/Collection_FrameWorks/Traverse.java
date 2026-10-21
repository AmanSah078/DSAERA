package Collection_Frameworks;

import java.util.*;

public class Traverse {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // 🔹 1. For-each (Best for DSA)
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("----- Iterator -----");

        // 🔹 2. Iterator (safe removal use)
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("----- Reverse -----");

        // 🔹 3. Reverse traversal
        ListIterator<String> litr = list.listIterator(list.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        System.out.println("----- Lambda -----");

        // 🔹 4. Java 8
        list.forEach(e -> System.out.println(e));

        // ================= SORTING =================
        TreeSet<String> st = new TreeSet<>(list);
        System.out.println("Sorted: " + st);
    }
}