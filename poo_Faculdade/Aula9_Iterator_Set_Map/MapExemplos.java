package poo_Faculdade.Aula9_Iterator_Set_Map;

import java.util.HashMap;
import java.util.Map;

public class MapExemplos {
    public static void main(String[] args) {
        //O map é uma associação entre um objeto CHAVE e um objeto VALOR

        Map<String,String> x = new HashMap<>();
        x.put("45153404384","leonardo");
        x.put("9876543210", "joana");
        x.put("1234567890", "gabriel"); 

        System.out.println(x.get("1234567890"));

    }
}
