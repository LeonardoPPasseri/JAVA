package poo_Faculdade.Provas.P2.P2_2023_02.Questão1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Utils2 {
    
    public static void imprimirCustos(List<Carro> lista){
        double totalA = 0;
        double totalI = 0;
        for(Carro l : lista){
            List<Acessorio> listaA = l.getLista();

            for(Acessorio lA : listaA){
                totalA += lA.calcularImposto();
                totalI += lA.getPreço();
            }
        }
        System.out.println("TOTAL IMPOSTO: " + totalI + " // TOTAL preço Acessorio: " + totalA);
    }

    public static Map<String,Carro> transformaListaEmMapa(List carros){
        Map<String,Carro> map = new HashMap();
        Iterator<Carro> e = carros.iterator();
        while(e.hasNext()){
            Carro a = e.next();
            map.put(a.getPlaca(),a);
        }
        return map;
    }
}
