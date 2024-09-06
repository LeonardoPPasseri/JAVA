package poo_Faculdade.Aula11_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Copy {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        lista1.add("maça");
        List<String> lista2 = new ArrayList<>();
        lista2.add("pera");
        System.out.println("lista1: " + lista1);
        System.out.println("lista2: " + lista2);
        Collections.copy(lista1,lista2);
        System.out.println("=======================");
        System.out.println("lista1: " + lista1);
        System.out.println("lista2: " + lista2);
        //Copy(lista1,lista2) --> copia a lista2 na 1

    }
}
