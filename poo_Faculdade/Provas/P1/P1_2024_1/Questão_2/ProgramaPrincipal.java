package poo_Faculdade.Provas.P1.P1_2024_1.Questão_2;

import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {
    
    public static void main(String[] args) {
        List<Object> x = Utils.getLista();
        List<Object> y = filtrarLigaveis(x);
        for (Object produto : y) {
            System.out.println(produto);
        }
        
    }
    public static List<Object> filtrarLigaveis(List<Object> objetos){
        List<Object> y = new ArrayList<>();
        for (Object o : objetos) {
            if(o instanceof Ligavel){
                y.add(o);
            }
        }
        return y;
    }
}
