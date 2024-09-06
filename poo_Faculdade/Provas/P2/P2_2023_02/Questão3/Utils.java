package poo_Faculdade.Provas.P2.P2_2023_02.Questão3;

import java.util.Set;

public class Utils {
    
    public static void verifica(String texto)throws TextoCurtoException{
        if(texto.length() < 10){
            throw new TextoCurtoException("texto inserido com " + texto.length() + " caracteres.");
        }
    }

    public static String moderar(String texto){
        Set<String> lista = Utilidades.getPalavroes();
        for (String s : lista) {
            String censura = "";
            int a = s.length();
            for (int i = 0; i < a; i++) {
                censura += "#";
            }
            texto = texto.replaceAll(s.toLowerCase(),censura);
            texto = texto.replaceAll(s.toUpperCase(), censura);
        }
        
        return texto;
    }
}
