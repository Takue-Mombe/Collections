package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList<>();
        List list= Collections.synchronizedList(new ArrayList<>());

        list1.add(1);
        list1.add(6);
        list1.add(3);

        list.add(5);
        list.add(4);
        list.add(7);


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        /*
        * This code snippet is a basic example
        * of iterating over elements in a collection
        * using the enhanced for loop
        * (also known as the "for-each" loop)
        * */
        for(Integer i:list1){
            System.out.println(i);
        }
    }
}
