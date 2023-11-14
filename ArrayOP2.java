import java.util.Scanner;

public class ArrayOP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Delete the value at a particular index of an Array");

        System.out.print("Size of Array : ");
        int size =  sc.nextInt();
        int[] myArr = new int[size];

        System.out.print("Enter Values of Array : ");
        for (int i = 0; i < myArr.length; i++) {
            // value
            myArr[i] = sc.nextInt();
        }
        System.out.print("Elements are : ");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + ", ");
        }
        System.out.println();

        System.out.print("Enter the index to be Deleted : ");
        int rIndx = sc.nextInt();
        int newArr[] = new int[size - 1];
        for (int i = 0; i < myArr.length; i++) {
            if (i<rIndx) {
                newArr[i] = myArr[i];
            }
            else if (i == rIndx) {
                continue;
            }
            else{
                newArr[i-1] = myArr[i];
            }
        }
        // print
        System.out.println("New Elements are : ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
