public class ReverseString {
    public static void main(String[] args) {
        String s = "abcd";

        String a="";

        for(int i=s.length()-1; i>=0; i-- ){
            a=  a+ s.charAt(i);
        }
        System.out.println(a);

        if(a.equals(s)){
            System.out.println("Palindorme");

        }else{
            System.out.println("No");
        }

    }
}
