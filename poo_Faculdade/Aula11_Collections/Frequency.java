package poo_Faculdade.Aula11_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Olá, mundo!");
        strings.add("A vida é bela.");
        strings.add("Olá, mundo!");
        strings.add("123 abc");
        strings.add("Olá, mundo!");
        strings.add("## $%&");
        strings.add("Olá, mundo!");
        strings.add("A+B=C");
        System.out.println(Collections.frequency(strings,"Olá, mundo!"));
        //retorna um int
    }
}
