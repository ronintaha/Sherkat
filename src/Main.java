import view.Personel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        Personel personel = new Personel(list);

        personel.inputP();
        personel.search();



    }
}
