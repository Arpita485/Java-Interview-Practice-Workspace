public class SumOfArray {
    public static void main(String[] args) {

        int a[] = {9, 1, 3, 7};
        int sum = 0;

        //for loop
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);

        //for each loop
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println(sum);


    }
}
