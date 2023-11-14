import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        System.out.println("2D Array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Row : ");
        int row = sc.nextInt();
        System.out.print("ENter the Value of Col : ");
        int col = sc.nextInt();
        
        int[][] myarr = new int[row][col];
        //input
        for (int i = 0; i < row; i++) { // row
            for (int j = 0; j < col; j++) { // col
                myarr[i][j] = sc.nextInt();
            }
        }
        // print

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(myarr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
