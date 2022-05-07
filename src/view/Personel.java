package view;

import data.PersonellData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Personel {


    List<String> list;

    public Personel(List<String> list){
        this.list=list;
    }



    public void inputP(){
        PersonellData prD = new PersonellData();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your Firstname and Lastname and your ID :");
        list.add(prD.setFirstName(scanner.next()));
        list.add(prD.setLastName(scanner.next()));
        list.add(prD.setId(scanner.next()));
        list.add(String.valueOf(this));
        System.out.println(prD.toString());

    }





    public void search(){
        Scanner scanner = new Scanner(System.in);
        PersonellData pd = new PersonellData();

        System.out.println("please enter the Firstname of person you want to find :");
        String input = scanner.next();

        for (String elm : list){
            if (elm.equals(input)){
                System.out.println("he is here");
                break;
            }else {
                System.out.println("he is not here");
                break;
            }
        }
    }
}
