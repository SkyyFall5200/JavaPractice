public class Human {
    public String surname, name;
    public int age;
    Human(String surname, String name, int age){
        this.surname = surname;
        this.age = age;
        this.name = name;
    }
}

class Leg extends Human{
    private String shoes;
    Leg(String surname, String name, int age, String shoes){
        super(surname, name, age);
        this.shoes = shoes;
    }

    public String toString(){
        return ("Фамилия " + surname + "\nИмя " + name + "\nВозраст " + age + "\nОбувь " + shoes);
    }
}

class Hand extends Human{
    private String leftHand, rightHand;
    Hand(String surname, String name, int age, String leftHand, String rightHand){
        super(surname, name, age);
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public String toString(){
        return ("Фамилия " + surname + "\nИмя " + name + "\nВозраст " + age + "\nВ правой руке " + rightHand + "\nВ левой руке "+ leftHand);
    }
}

class Head extends Human{
    private String colourHead, colourEye;
    Head(String surname, String name, int age,String colourHead, String colourEye){
        super(surname, name, age);
        this.colourEye = colourEye;
        this.colourHead = colourHead;
    }

    public String toString() {
        return ("Фамилия " + surname + "\nИмя " + name + "\nВозраст " + age + "\nЦвет глаз " + colourEye +"\nЦвет волос " + colourHead);
    }
}

class Test{
    public static void main(String[] args){
        Head human = new Head("Цыбуля", "Адриан", 19, "Чёрный", "Голобуые");
        //Hand human1 = new Hand(""Цыбуля", "Адриан", 19, "ничего", "карандаш");
        //Leg human2 = new Leg("Цыбуля", "Адриан", 19, "Кроссы");
        System.out.println(human.toString());
        //System.out.println(human1.toString());
        //System.out.println(human2.toString());
    }
}