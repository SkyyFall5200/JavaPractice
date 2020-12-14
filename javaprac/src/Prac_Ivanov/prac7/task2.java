package Prac_Ivanov.prac7;

import java.util.Scanner;

class FirstAndSecName{
    public String Name;
    public String SecName;

    FirstAndSecName(String SecName, String Name){
        this.Name = Name;
        this.SecName = SecName;
    }

    @Override
    public String toString() {
        return "Фамилия " + SecName + "\nИмя "+ Name;
    }
}

class FullName extends FirstAndSecName{
    public String MidName;

    FullName(String SecName, String Name, String MidName){
        super(SecName, Name);
        this.MidName = MidName;
    }

    @Override
    public String toString() {
        return "Фамилия " + SecName + "\nИмя "+ Name + "\nОтчество " + MidName;
    }
}

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        FirstAndSecName name;
        if(words.length == 2){
            name = new FirstAndSecName(words[0], words[1]);
            System.out.println(name.toString());
        }
        else if (words.length == 3) {
            name = new FullName(words[0], words[1], words[2]);
            System.out.println(name.toString());
        } else System.out.println("Введеная строка не является ФИО!");
    }
}
