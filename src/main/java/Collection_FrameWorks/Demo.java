package Collection_FrameWorks;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        {
            //better to use the ArrayList as object but list as ref which is best for the future change and flexible
            List<Integer> list= new ArrayList<>();  //Dublcate are allowed and order are presevered
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(3);
            System.out.println(list);
//            list.remove(1);
//            list.remove(2);
//            list.clear();
//            list.contains(1);
//            System.out.println(list.sort(list);
        }

//        HashSet<String> set = new HashSet<>();   //Not Dublicate are allowedor or ordeer r not preserved
//
//        set.add("Java");
//        set.add("Python");
//        set.add("Java");
    }
}
