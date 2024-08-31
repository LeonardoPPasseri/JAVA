package poo_Faculdade.Aula10.Questão;

import java.util.HashMap;
import java.util.Map;

public class Utils {
    
    public static Map<String,String> retornaConversoesPalavras(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("vc", "você");
        map.put("tb", "também");
        map.put("pq", "porque");
        map.put("n", "não");
        map.put("hj", "hoje");
        map.put("fds", "Fim de semana");
        return map;
    }
    public static String fraseCompleta(String str,Map<String,String> map){
        for(String mapl : map.keySet()){ //É possivel percorrer o Map usando For simplicifado
            str = str.replaceAll(mapl, map.get(mapl)); //O get() recebe uma chave e retorna o valor
        }
        return str;
    }

}
