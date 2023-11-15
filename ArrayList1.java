import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        System.out.println("ArrayList is the Resizable array and in array size can't be modefied ");
        //  Integer | Float | Boolean | String
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> nameOfMovie = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(9);
        System.out.println(list);
        // Get Element
        int fElm = list.get(0);
        System.out.println(fElm);
        // add element in between
        list.add(1, 5);
        System.out.println(list);

        // set Element
        list.set(0, 3);
        System.out.println(list);
        // remove element
        list.remove(1);
        System.out.println(list);
        // size of arraylist
        int size = list.size();
        System.out.println(size);

        // loop on ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");

        }
        System.out.println();
        // Sorting
        Collections.sort(list);
        System.out.println("Sorted list is : " + list);
    }
}
