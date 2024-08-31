package poo_Faculdade.Aula10.WrapperClass.QuestãoSlide;

public class Utils {
    
    public static int contaPalavra(String str){
        String[] array = str.split(" ");
        return array.length;
    }
    public static boolean verificaPalavra(String str){
        str = str.toLowerCase();
        int i = str.indexOf("quando");
        if(i > 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean verificaSite(String str){
        str = str.toLowerCase();
        return str.startsWith("http"); //retorna um booleando
    }
    public static boolean verificaExtensão(String str){
        str = str.toLowerCase();
        return str.endsWith("jpg"); //retorna um booleando
    }
    public static int comparação(String a, String b){
        char[] a2 = a.toCharArray();
        char[] b2 = b.toCharArray();
        int c = 0;
        for (int i = 0; i < a2.length; i++) {
            if(a2[i] == b2[i]){ //Não da pra usar equals em array de char
                ++c;
            }
        }
        return c;
    }
    public static String mudar(String str){
        String str2 = str.replaceAll("você","nós");
        return str2;
    }


}
