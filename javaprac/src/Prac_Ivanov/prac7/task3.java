package Prac_Ivanov.prac7;

import java.util.*;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> number = new ArrayList<String>(Arrays.asList(scanner.nextLine().replace("+7", "7").replace(" ", "").replace("-", "").replace("(", "").replace(")", "").split("")));

        if (number.size() == 11) {
            if (!number.get(0).equals("8") && !number.get(0).equals("7")) {
                System.out.println("Неверный формат номера");
            } else if (number.get(0).equals("8")) {
                number.remove("8");
                System.out.println(FormatPhone(number));
            } else {
                number.remove("7");
                System.out.println(FormatPhone(number));
            }
        } else if (number.size() == 10) {
            System.out.println(FormatPhone(number));
        } else System.out.println("Неверный введеный номер!");
    }

    public static String FormatPhone(List<String> number) {
        String Number = "+7 (";

        int i = 0, count = 0;
        while (i < number.size()) {
            for (int k = 0; k < 2; k++) {
                for (int j = 0; j < 3; j++) {
                    Number += number.get(i);
                    count++;
                    i++;
                    if (count == 3) {
                        if (k == 0) Number += ") ";
                        else Number += "-";
                        count = 0;
                    }
                }
            }

            count = 0;
            for (int k = 0; k < 2; k++) {
                for (int j = 0; j < 2; j++) {

                    Number += number.get(i);
                    count++;
                    i++;
                    if (count == 2) {
                        if (k != 1) Number += "-";
                        count = 0;
                    }
                }
            }
            return Number;
        }

        return Number;
    }
}
