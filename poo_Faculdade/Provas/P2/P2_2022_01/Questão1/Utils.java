package poo_Faculdade.Provas.P2.P2_2022_01.Questão1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class Utils {
    
    public static boolean existe (Collection<CorpoCeleste> x, CorpoCeleste y){
        return x.contains(y);
    }

    public static void ordena(List<CorpoCeleste> x){
        Collections.sort(x);
    }

    public Map<String, CorpoCeleste> retornaDados(Set<String> conjuntoCorpos) throws FormatoIncorretoException{
        String id;
        String nome;
        Double distancia = 0.0;
        String tipo;
        Map<String,CorpoCeleste> map = new HashMap<String,CorpoCeleste> ();
        Iterator<String> elementos = conjuntoCorpos.iterator();
        while(elementos.hasNext()){
            String elem = elementos.next();
            String[] a = elem.split("#");
            if(a.length > 4 || a.length < 4){
                throw new FormatoIncorretoException("FormatoIncorretoException: O formato da String [" + elem + "] esta incorreto");
            }
            //553-2#Proxima Centauri#4#E
            for (int i = 0; i < a.length; i++) {
                id = a[0];
                nome = a[1];
                distancia = Double.parseDouble(a[2]);
                tipo = a[3];
                if(tipo.equals("E")){
                    Estrela e = new Estrela(id);
                    e.setDistancia(distancia);
                    e.setNome(nome);
                    map.put(id,e);
                }
                if(tipo.equals("P")){
                    Planeta p = new Planeta(id);
                    p.setDistancia(distancia);
                    p.setNome(nome);
                    map.put(id,p);
                }
            }
        }
        return map;
    }

}
