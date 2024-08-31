package poo_Faculdade.Aula10.Questão;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map = Utils.retornaConversoesPalavras();
        String str = "vc vai hj tb? pq se n for me avisa.";
        System.out.println(Utils.fraseCompleta(str, map));
    }
}
