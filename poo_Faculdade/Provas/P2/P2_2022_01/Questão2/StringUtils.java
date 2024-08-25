package poo_Faculdade.Provas.P2.P2_2022_01.Questão2;

public class StringUtils {
    
    public static String processa(String str){
        str = str.toUpperCase();
        str = str.replace("A","4");
        str = str.replace("E","3");
        str = str.replace("I","1");
        str = str.replace("O","0");
        return str;
    }
    public static String inverte(String str){
        String reverseString = "";
        for (int i = str.length() - 1; i >=0 ; i--) {
            reverseString += str.charAt(i);
        }
        return reverseString;
    }
}
