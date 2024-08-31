package poo_Faculdade.Aula10.Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Resumo {
    //Generics é o tipo <tipo>
    //Com o uso delas, não precisamos ficar usando o casting

    public static void main(String[] args) {
        List<String> str = new ArrayList<String>();
        str.add("casa");
        str.add("livro");
        str.add("navio");
        Iterator<String> elementos = str.iterator();
        while (elementos.hasNext()) {
            //String string = (String)elementos.next();
            String string = elementos.next();
            System.out.println(string);
        }
    }
}
