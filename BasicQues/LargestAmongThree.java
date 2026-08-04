public class LargestAmongThree {
    public static void main(String[] args) {
        int x = 50;
        int g = 40;
        int e = 100;

        if (x > g && x > e) {
            System.out.println("Largest:" + x);
        } else if (g > e && g > x) {
            System.out.println("largest:" + g);
        } else {
            System.out.println("largest:" + e);
        }
    }
}
