package poo_Faculdade.Aula9_Iterator_Set_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExemplos {
    public static void main(String[] args) {
        //O map é uma associação entre um objeto CHAVE e um objeto VALOR

        Map<String,String> map = new HashMap<>();
        map.put("45153404384","leonardo");
        map.put("9876543210", "joana");
        map.put("1234567890", "gabriel"); 

       // System.out.println(map.get("1234567890"));

        Iterator<String> e = map.keySet().iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }

        Iterator<String> r = map.values().iterator();
        while(r.hasNext()){
            System.out.println(r.next());
        }
        
    }
}
