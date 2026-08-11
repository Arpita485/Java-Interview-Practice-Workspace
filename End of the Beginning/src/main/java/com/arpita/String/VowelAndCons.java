package com.arpita.String;

import java.util.Locale;

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
        if (truth.length() > 0) {
            for (int i = 0; i < truth.length(); i++) {
                if (truth.charAt(i) >= 'a' && truth.charAt(i) <= 'z') {
                    if (truth.charAt(i) == 'a' || truth.charAt(i) == 'e' || truth.charAt(i) == 'i' || truth.charAt(i) == 'o' || truth.charAt(i) == 'u') {
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
