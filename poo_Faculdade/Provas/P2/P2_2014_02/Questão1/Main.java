package poo_Faculdade.Provas.P2.P2_2014_02.Questão1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "Agora, quando estou sentado ao seu lado e falo consigo, tenho medo de pensar no futuro, pois no futuro está novamente a solidão, novamente esta vida inútil e cheirando a mofo; e com o quê vou sonhar se, desperto, fui tão feliz ao seu lado? Oh, bendita seja a senhorita, minha querida, por não ter me rejeitado logo na primeira vez. Porque agora posso dizer que vivi ao menos duas noites em minha vida!";
        contaPalavras(str);
    }
    public static void contaPalavras(String str){
        str = str.replaceAll("[!,.;?]","");
        System.out.println(str);

        String[] array = str.split(" ");
        System.out.println("Quantidade de palavras: " + array.length);

        List<String> teste = new ArrayList<>();

        for (int i = 0; i < array.length-1; i++) {
            int x = 0;
            if(!(teste.contains(array[i].toLowerCase()))){
                for (int j = 0; j < array.length-1; j++) {
                    if(array[i].toLowerCase().equals(array[j].toLowerCase())){
                        x++;
                        teste.add(array[i].toLowerCase());
                    }
                }
            }
            if(x > 1){
                System.out.println("Palavra ["+array[i]+"] tem a frequencia de: " + x);
            }
        }
    }
}
