package Collection_FrameWorks;

import java.util.*;

public class ArrayListtt101 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Spring");
        list.add("SQL");

        System.out.println(list.size());

        System.out.println(list.contains("Spring"));//contains means check inside the list Spring is availabel or not

        list.remove("SQL");

        System.out.println(list);
    }
    //commont method?
    //add
    //get
    //remove
    //size
    //contains
    //Problem to shifting between the elements dude
    //required whole logic if i want to insert between the elements
    //Better for searching
}
