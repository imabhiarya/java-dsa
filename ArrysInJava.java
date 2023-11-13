import java.util.Scanner;

public class ArrysInJava {
    public static void main(String[] args) {
        // Array is the collection  of same type of data in a contigious memory 

        // Already Known Values 
        int arr[] ={2,3,4,5,6};
        // User Defined Array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int arSize = sc.nextInt();
        String arr2[] = new String[arSize];

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter Value at index " + i + " : ");
            arr2[i] = sc.next();
        }

        // print arr
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ ", ");
        }

    }
}
