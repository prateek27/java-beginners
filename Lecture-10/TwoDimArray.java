public class TwoDimArray {

    static void create2DArray(){
        int[][] arr = new int[3][];

        arr[0] = new int[4];
        arr[1] = new int[40];
        arr[2] = new int[2];

        arr[0][0] =5;
        arr[0][1] = 6;
        arr[0][2] = 7;
        arr[0][3] = 8;

        arr[1][0] = 10;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[0][0]);
        //System.out.println(arr.length);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
    }


    static void createTicTacToe(){
        int[][] ticTacToe = new int[3][3];

        for(int i=0; i < 3; i++){
            for(int j=0; j<3; j++){
                ticTacToe[i][j] = i+j;
            }
        }

        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ticTacToe[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       // createTicTacToe();
        create2DArray();

    }

}
