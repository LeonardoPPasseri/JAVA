package poo_Faculdade.Provas.P1_2024_1.Questão_2;

import java.util.ArrayList;
import java.util.List;
import poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC.MeioPesado;
import poo_Faculdade.Aula5_Herança_Polimorf.Questão_UFC.PesoPesado;

public class Utils {
    
    /*
    public static List<String> getFuncionarios(){
        Retorna uma lista de funcionarios nome#salario => "Maria#3000"
    }
    */
    public static List<Object> getLista(){
        List<Object> lista = new ArrayList<>();
        lista.add(new PesoPesado("x", 0, 0));
        lista.add(new Televisão("254"));
        lista.add(new MeioPesado("c", 0, 0));
        lista.add(new Televisão("100"));
        lista.add(new Tapete("4521"));
        return lista;
    }
    
}
