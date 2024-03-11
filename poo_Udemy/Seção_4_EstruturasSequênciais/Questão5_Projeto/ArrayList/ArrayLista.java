package poo_Udemy.Seção_4_EstruturasSequênciais.Questão5_Projeto.ArrayList;

import java.util.ArrayList;

public class ArrayLista {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("foo");

        for ( String s : lista )
         System.out.println(s);

        
    }
}