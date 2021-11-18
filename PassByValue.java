public class PassByValue {

    static void update(int x,int new_value){
        x = new_value;
    }

    static int square(int x){
        return x*x;
    }

    public static void main(String[] args) {
        int x = 10;
        update(x,20);

        x = square(x);
        System.out.println(x);
    }
}
