package poo_Faculdade.Aula11_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
    //O metodo shuffle() é da classe collections 
    //Usado para embaralhar uma lista
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Olá, mundo!");
        strings.add("A vida é bela.");
        strings.add("123 abc");
        strings.add("## $%&");
        strings.add("A+B=C");
        System.out.println(strings);
        Collections.shuffle(strings);
        System.out.println(strings);
    }
}
