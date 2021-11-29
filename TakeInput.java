import java.util.Scanner;

public class TakeInput {

    static int[][] create2DArray(){
        Scanner sc = new Scanner(System.in);
        int rows,cols;

        rows = sc.nextInt();
        cols = sc.nextInt();
        //Create a 2D Array
        int[][] arr = new int[rows][cols];

        for(int i=0; i < rows; i++){
            //cols
            for(int j=0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    static int[][] create2DArrayWithVariableCols(){
        Scanner sc = new Scanner(System.in);
        int rows;
        rows = sc.nextInt();
        int[][] arr = new int[rows][];

        for(int i=0; i < rows; i++){
            //Cols in each row
            int cols_in_current_row = sc.nextInt();
            arr[i] = new int[cols_in_current_row];

        }
        //Input
        return arr;
    }


    static void print(int[][] arr){
        //rows
        for(int i=0; i < arr.length; i++){
            //col
            for(int j=0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //LIVE Assignment
    static void printArrayInWaveOrder(int[][] arr){

        int cols = arr[0].length;
        int rows = arr.length;

        for(int c=0; c<cols; c++){
            //row from top to bottom
            if(c%2==0) {
                for (int r = 0; r < rows; r++) {
                    System.out.print(arr[r][c] + " ");
                }
            }
            else{
                //bottom to top
                for(int r= rows-1; r>=0; r--){
                    System.out.print(arr[r][c] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = create2DArray();
        print(arr);
        printArrayInWaveOrder(arr);


    }
}
