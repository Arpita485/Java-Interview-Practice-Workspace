import java.util.Locale;

public class VowelAndConsonant {

    public static void main(String[] args) {
        String a = "Interview";
        String s = a.toLowerCase();

        int vol = 0;
        int cons = 0;

        for (int p = 0; p < s.length(); p++) {
            char ch = s.charAt(p);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vol++;
                } else {
                    cons++;
                }
            }
        }

        System.out.println("Vowels: " + vol);
        System.out.println("Consonants: " + cons);


    }}