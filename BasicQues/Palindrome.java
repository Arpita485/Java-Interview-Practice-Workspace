public class Palindrome {

    public static void main(String[] args) {
        int a = 121;
        int s = 0;
        int o = a;

        while (a != 0) {
            int d = a % 10;
            s = (s * 10) + d;
            a = a / 10;
        }
        if (o == s) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(s);
    }

}
