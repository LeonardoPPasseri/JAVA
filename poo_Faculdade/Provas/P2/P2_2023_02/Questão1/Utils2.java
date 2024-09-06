package poo_Faculdade.Provas.P2.P2_2023_02.Questão1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Utils2 {
    
    public static void imprimirCustos(List<Carro> lista){
        double totalA = 0;
        double totalI = 0;
        for(Carro carro : lista){
            // carro é um carro da lista
            List<Acessorio> listaA = carro.getLista();
            for(Acessorio acessorio : listaA){
                totalA += acessorio.getPreço();
                totalI += acessorio.calculaImposto();
            }
        }
        System.out.println("Total Acessorio: " + totalA + " // Total imposto: " + totalI);
    }

    public static Map<String,Carro> transformaListaEmMapa(List carros){
        Map<String,Carro> map = new HashMap<>();
        Iterator<Carro> e = carros.iterator();
        while(e.hasNext()){
            Carro carro = e.next();
            map.put(carro.getPlaca(),carro);
        }
        return map;
    } 
}
