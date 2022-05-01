package data;

import java.util.ArrayList;
import java.util.List;

public class PersonellData {
    public static String nameP ;
    public static String nameS ;
    public static int id ;
    public static int age;
//    public PersonellData(){
//        this.nameP=nameP;
//        this.nameS=nameS;
//        this.id = id;
//        this.age= age;
//        List<PersonellData> list1 = new ArrayList<>();
//        list1.add(this);

//    }

    public static void sabt(){
        List<String> list1 = new ArrayList<>();
        list1.add(nameP);
        list1.add(nameS);
        list1.add(String.valueOf(id));
        list1.add(String.valueOf(age));

    }

}
