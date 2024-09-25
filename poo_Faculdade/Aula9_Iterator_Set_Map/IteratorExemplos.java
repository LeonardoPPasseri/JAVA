package poo_Faculdade.Aula9_Iterator_Set_Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class IteratorExemplos {
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        lista.add("leonardo");
        lista.add("marcos");
        lista.add("jose");
        lista.add("gustavo");
        lista.add("rafael");
        lista.add("luiz");

        //Toda lista possui o metodo iterator() pois essa classe faz parte do pacote Collection.
        Iterator<String> elementos = lista.iterator();//Objeto Iterator para percorrer a lista
        while(elementos.hasNext()){
            System.out.println(elementos.next());
        }
        while(elementos.hasNext()){ //Não funciona duas vezes
            System.out.println(elementos.next());
            System.out.println("teste");
        }
        //Não pode colocar os itens da lista depois de criar o objeto Iterator. Ele não ira recebe-los;
    }
}
