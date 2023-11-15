import java.util.*;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Arya");
        list.addFirst("Shekhar");
        System.out.println(list);
        list.addLast("Abhishek");
        System.out.println(list);
        list.add("Graduate");
        System.out.println(list);
        System.out.println("Size of Linked List is : " + list.size());

        // Loop on Linked List for access the value or  traverse the value
        for (int i = 0; i < list.size(); i++) {
           // for searching of value.

            // if (list.get(i)== "Abhishek") {
            //     System.out.println("index no is : " + i);
            //     return;
            // }

            System.out.println(list.get(i));
        }

        list.removeFirst();
        
        System.out.println(list);
        // list.removeLast();
        list.clear();
        System.out.println(list);
    }
}
    