package jp.ac.uryukyu.ie.e175702;

import java.util.*;
import java.util.Random;

public class TypeList {
    List<String> typelist = new ArrayList<String>() {
        {
            add("ao");
            add("kai");
            add("ika");
        }
    };

    int num;
    String qus;

    public void getTypelist() {
        num = typelist.size();
    }

    public void question(int num) {
        Random rnd = new Random();
        int ran = rnd.nextInt(num - 1);
        qus = typelist.get(ran);

    }
}

