package poo_Faculdade.Aula10.WrapperClass.QuestãoSlide;

public class Main {
    public static void main(String[] args) {
        String str = "Http: Para ser um campeão, você tem que acreditar em si mesmo quando ninguém mais acredita.jpg";
        String str2 = "amarelo";
        String str3 = "marmelo";
        System.out.println(Utils.verificaPalavra(str));
        System.out.println(Utils.comparação(str2, str3));
        System.out.println(Utils.contaPalavra(str));
        System.out.println(Utils.mudar(str));
        System.out.println(Utils.verificaExtensão(str));
        System.out.println(Utils.verificaSite(str));
        System.out.println();
        System.out.println(str2.substring(2,5)); 
        //O s é minusculo
        //Pega o 2,3 e 4, exclui o 5

    }
}
