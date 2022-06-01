package Set;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploSet {

    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>(){{
            add(3);
            add(88);
            add(20);
            add(44);
            add(3);
        }};

        for (Integer integer : num) {
            System.out.println(integer);
        }
        System.out.println("-------------");
        System.out.println(num);
        List<Integer> myList = new ArrayList<>(num);
        Integer first = myList.get(0);
        num.remove(first);
        System.out.println(num);
        System.out.println("-------------");
        num.add(23);
        System.out.println(num.size());
        System.out.println("-------------");
        System.out.println(num.isEmpty());

    }
}
