package application;

import java.util.Set;

public class LinkedHashSet {

    public static void main(String[] args) {

        //O HashSet tem velocidade intermediaria
        //e garante a ordem que foi inserido
        Set<String> set = new java.util.LinkedHashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        set.removeIf(x -> x.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p);
        }
    }
}
