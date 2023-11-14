import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        System.out.println(" Q : Place the value at a particular index of an array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int n = sc.nextInt();
        // array initialise
        int[] arr = new int[n];
        System.out.print("Enter Values : ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // enter value of index
        System.out.print("index value : ");
        int idn = sc.nextInt();
        System.out.print("Value : ");
        int idnv = sc.nextInt();
        int k[] = new int[n+1];
        for (int i = 0; i < k.length; i++) {
            if (i<idn) {
                k[i] = arr[i];
            }
            else if(i == idn){
                k[i] = idnv;
            }
            else{
                k[i] = arr[i-1];
            }
        }
        System.out.print("Elements are : ");

        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + ", ");
        }
        

    }
}
