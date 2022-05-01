package view;

import data.PersonellData;

import java.util.Scanner;

public class Menu1 {



    public static void personell() {


        PersonellData data1 = new PersonellData();
        System.out.println("please enter your name and your id and your age :");
        Scanner scanner1 = new Scanner(System.in);
        data1.nameP= scanner1.next();
        data1.id = scanner1.nextInt();
        data1.age = scanner1.nextInt();

        System.out.println("sabt shod");

    }
}