package prac2;

import java.util.Scanner;

class Shape{
    int a;
    String name;
    Shape(int b, String k){
        this.a = b;
        this.name = k;
    }
    void test(){
        System.out.println("Это "+ name + ". Углов у фигуры " + a);
    }
}

class Dog{
    int age,ageHuman;
    String nameDog;
    Dog(int kk,String bb){
        this.age = kk;
        this.nameDog = bb;
        this.ageHuman = age * 7;
    }
    String ToString(){
        return ("Кличка собаки "+nameDog+". Возраст: "+ age+". 'Человеческий' возраст: "+ageHuman);
    }
}

class nursery {
    public Dog[] dogss = new Dog[3];
    int count = 2;

    nursery() {
        dogss[0] = new Dog(2,"Петька");
        dogss[1] = new Dog(4,"Боня");
    }

    void AddDog(int kk, String bb) {
        dogss[count++] = new Dog(kk, bb);
    }

    void DogsPrint() {
        for (int i = 0; i < 3; i++)
            System.out.println(dogss[i].ToString());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Напишите сколько углов у фигуры и саму фигуру: ");
        Scanner sc = new Scanner(System.in);
        Shape shapes = new Shape(sc.nextInt(),sc.nextLine());
        shapes.test();
        Dog dog = new Dog(5,"Балу");
        System.out.println(dog.ToString());
        nursery doggs=new nursery();
        System.out.println("Напишите возраст собаки и кличку: ");
        Scanner in = new Scanner(System.in);
        doggs.AddDog(in.nextInt(),in.nextLine());
        doggs.DogsPrint();
    }
}
