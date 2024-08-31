package poo_Faculdade.Aula9_Iterator_Set_Map.QuestãoAula;

import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        String[] twts = Twitter.getTweets();
        List<String> p = Utils.getPalavroes();

        for (int i = 0; i < twts.length; i++) {
            for (String list : p) {
                String censura = "";
                for (int j2 = 0; j2 < list.length(); j2++) { //list.length() coloca o tamanho da palavra
                    censura = censura + "#";
                }
                twts[i] = twts[i].replace(list,censura);
            }
            System.out.println(twts[i]);
        }
    }
}  