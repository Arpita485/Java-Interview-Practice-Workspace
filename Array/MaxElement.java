public class MaxElement {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 34;
        arr[1] = 8;
        arr[2] = 72;
        arr[3] = 13;
        arr[4] = 1;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];

            }
        }
        System.out.println(max);


    }
}
