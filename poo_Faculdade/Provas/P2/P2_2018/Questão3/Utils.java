package poo_Faculdade.Provas.P2.P2_2018.Questão3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {

    public static void frequecia(CarrinhoDeCompras c){
        List<String> lista2 = new ArrayList<>();
        for (Object lista : c.getLista()) {
            Livro a = (Livro)lista;
            String teste = a.getId();
            if(lista2.contains(teste)){
                lista2.add(teste);
            }else{
                if(a.getId().equals(teste)){
                    lista2.add(teste);
                } 
            }
        }
        System.out.println("123 - " + Collections.frequency(lista2,"123"));
        System.out.println("321 - " + Collections.frequency(lista2, "321"));
    }
}
