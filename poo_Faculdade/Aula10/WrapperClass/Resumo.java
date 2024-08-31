package poo_Faculdade.Aula10.WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class Resumo {
    //Atributos primitivos são colocados em classes 
    //int -> Integer
    //double -> Double

    public static void main(String[] args) {
        List<Integer> listaI = new ArrayList();
        //List<int> listaI2 = new ArrayList<>(); "Syntax error, insert "Dimensions" to complete ReferenceType"
        listaI.add(3);
        listaI.add(4);
        System.out.println(listaI);
    }
}
