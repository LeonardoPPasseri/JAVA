package poo_Faculdade.Aula9_Collection.Questão_Slide;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João da Silva", 30, "Rua A, 123", "123.456.789-00");
        Pessoa pessoa2 = new Pessoa("Maria Santos", 25, "Rua B, 456", "987.654.321-00");
        Pessoa pessoa3 = new Pessoa("Pedro Oliveira", 40, "Rua C, 789", "111.222.333-00");

        Map map = new HashMap<>();
        map.put("123.456.789-00",pessoa1);
        map.put("987.654.321-00",pessoa2);
        map.put("111.222.333-00",pessoa3);
        
        System.out.println(Pessoa.procuraMap(map,"987.654.321-00"));


        System.out.println("\n======Percorrer map==========");
        Iterator elementosKey = map.keySet().iterator(); //Percorre as chaves
        while(elementosKey.hasNext()){
            System.out.println(elementosKey.next());
        }
        Iterator elementosValor = map.values().iterator();//Percorre os valores
        while(elementosValor.hasNext()){
            System.out.println(elementosValor.next());
        }
    }   
}
