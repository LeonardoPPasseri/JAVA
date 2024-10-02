package LeetCode.longestCommonPrefix_Easy;

public class Solução {
   
    public static void main(String[] args) {
            String[] x = new String[] {"flower","flow","flight"};

            System.out.println(longestCommonPrefix(x));  
    }
    
    //Encontre o maior prefixo comum entre as palavras
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){//Verifica se o array é vazio
            return "0";
        }
        int tamanho = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            tamanho = Math.min(tamanho,strs[i].length());
            System.out.println("=================================");
            System.out.println("Tamanho começo: " + tamanho);
            System.out.println("=================================");
            for (int j = 0; j < tamanho; j++) {
                char c = strs[0].charAt(j);
                char d = strs[i].charAt(j);
                System.out.println("c: " + c);
                System.out.println("d: " + d);
                System.out.println("----");
                if(c != d){
                    tamanho = j;
                    System.out.println("tamanho: "+ tamanho);
                    break;
                }
                System.out.println("=========");
            }
        }
        return strs[0].substring(0,tamanho);
        //substring(0,0) retorna ""
        //o substring no caso pega (0 , 2) porem pega até o endereço "2"
    }
}
