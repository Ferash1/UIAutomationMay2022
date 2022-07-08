package javaBasics.justBasics;

import java.util.ArrayList;

public class ClassP_ArrayList {
    public static void main(String[] args) {


        ArrayList<String> Countries = new ArrayList<>();
        Countries.add("England");
        Countries.add("Scotland");
        Countries.add("Canada");
        Countries.add("Australia");
        Countries.forEach((n) ->

        {
            System.out.println(n);
        });
    }
}
