public class Arrays10 {


    static void update(int [] myArray,int idx,int val){
        myArray[idx] = val;
    }

    static void print(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //LIVE Assignment : Check if the given array is sorted in ascending order
    static boolean checkSorted(int[] arr){

        for(int i=0; i < arr.length - 1; i++ ){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,35,460,90};
        boolean sorted = checkSorted(arr);

        System.out.println(sorted);
        update(arr,2,0);
        print(arr);
    }
}
