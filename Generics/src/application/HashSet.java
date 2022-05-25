package application;

import java.util.*;

public class HashSet {

    public static void main(String[] args) {

        //O HashSet é o mais rapido de todos, mas ele não
        //garante a ordem
        Set<String> set = new java.util.HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}