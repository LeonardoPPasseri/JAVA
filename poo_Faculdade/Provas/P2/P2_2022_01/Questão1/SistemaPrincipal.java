package poo_Faculdade.Provas.P2.P2_2022_01.Questão1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ID do CorpoCeleste: ");
        String id = sc.nextLine();
        //Lista criada para teste
        Set<String> conjuntoCorpos = new HashSet<String>();
        conjuntoCorpos.add("553-2#Proxima Centauri#645#E");
        conjuntoCorpos.add("123-4#Sirius#4322#P");
        conjuntoCorpos.add("789-0#Alpha Centauri A#9433#E");
        conjuntoCorpos.add("987-6#Betelgeuse#854#P");
        conjuntoCorpos.add("456-7#Rigel#15#E");
        conjuntoCorpos.add("321-0#Polaris#1435#P");
        conjuntoCorpos.add("654-3##Vega#6143#E");
        conjuntoCorpos.add("012-3#Arcturus#143#P");
        conjuntoCorpos.add("234-5#Deneb#312#E");
        conjuntoCorpos.add("876-5#Altair#4123#P");
        //==================================
        //Não entendi como usar o metodo ordena se não temos um List<CorpoCeleste>
        //Utils.ordena(map.values());
        //Utils.ordena(conjuntoCorpos);

        Map<String,CorpoCeleste> map = new HashMap<>();
        Utils a = new Utils();
        //O metodo não é static, portanto precisa criar um objeto para usar... 
        try{
            map = a.retornaDados(conjuntoCorpos);
        }catch(FormatoIncorretoException e){
            System.out.println(e.getMessage());
        }
        

        if(Utils.existe(map.values(), map.get(id))){
            System.out.println(map.get(id));
        }else{
            System.out.println("A estrela com ID ("+ id +") não existe");
        }
        
        Iterator<CorpoCeleste> elementos = (map.values()).iterator();
        while(elementos.hasNext()){
           System.out.println(elementos.next());
        }
    }
}
