package poo_Faculdade.Aula7_Interface_Collection.Questão_Parte2;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<Object>();
        lista.add(new Urso());
        lista.add(new Doce());
        lista.add(new Carro());
        podeCorrer(lista);

    }

    public static void podeCorrer(ArrayList<Object> lista){
        
        for(Object l : lista){
            if(l instanceof Corredor){
                ((Corredor)l).correr();
            }
        }
    }
}
