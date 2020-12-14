package Prac_Ivanov.prac7;

import java.util.StringTokenizer;

public class task1 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int score = 0;
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        StringTokenizer st = new StringTokenizer(text, " ");
        while(st.hasMoreTokens()) {
            score++;
            String key = st.nextToken();
            if (score == 3) {
                i = Integer.parseInt(key.trim());
            }
            if (score == 12) {
                j = Integer.parseInt(key.trim());
            }
        }
        System.out.println(i+j);
    }
}
