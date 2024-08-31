package poo_Faculdade.Aula9_Iterator_Set_Map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExemplos {
    
    public static void main(String[] args) {
        System.out.println("\n--------------------HashSet-----------------------");
        Set<Object> set = new HashSet<>();
        set.add("leonardo");
        set.add("marcos");
        set.add("jose");
        set.add("gustavo");
        set.add("rafael");
        set.add("luiz");
        System.out.println(set);
        //Não garante a ordem porém é o mais RAPIDO
        //Em listas que a ordem não importa, o HashSet é o mais indicado

        System.out.println("\n--------------------TreeSet-----------------------");
        Set<Object> treeSet = new TreeSet<>();
        treeSet.add("leonardo");
        treeSet.add("marcos");
        treeSet.add("jose");
        treeSet.add("gustavo");
        treeSet.add("rafael");
        treeSet.add("luiz");
        System.out.println(treeSet);
        //Ordem alfabetica

        System.out.println("\n--------------------LinkedHashSet-----------------------");
        Set<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("leonardo");
        linkedHashSet.add("marcos");
        linkedHashSet.add("jose");
        linkedHashSet.add("gustavo");
        linkedHashSet.add("rafael");
        linkedHashSet.add("luiz");
        System.out.println(linkedHashSet);
        //Ordem de chegada

        System.out.println("\n----------------------Implements---------------------");
        set.removeIf(x -> ((String) x).charAt(0) == 'l');
        //' -> ' significa "tal que"
        System.out.println(set);

    }
}
