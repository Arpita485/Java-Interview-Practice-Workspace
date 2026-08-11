package com.arpita.String;

public class VowelAndCons {
    public static void main(String[] err) {
        int res[] = vowelandCon();

        System.out.println("vowel : " + res[0]);
        System.out.println("consonant : " + res[1]);

    }

    private static int[] vowelandCon() {
        int vow = 0;
        int cons = 0;
        String truth = "Nothing is permanent";
        String t = truth.toLowerCase();
        if (t.length() > 0) {
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) >= 'a' && t.charAt(i) <= 'z') {
                    if (t.charAt(i) == 'a' || t.charAt(i) == 'e' || t.charAt(i) == 'i' || t.charAt(i) == 'o' || t.charAt(i) == 'u') {
                        vow++;

                    } else {
                        cons++;
                    }
                }
            }
        }
        return new int[]{vow, cons};
    }

}
