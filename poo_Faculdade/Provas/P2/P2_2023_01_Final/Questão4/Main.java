package poo_Faculdade.Provas.P2.P2_2023_01_Final.Questão4;

public class Main {
    public static void main(String[] args) {
        String str = "14#2#81#90#9#10";
        try{
            System.out.println("A media é: " + MeuNumero.media(str));
        }catch(NumeroNegativoException e){
            System.out.println(e.getMessage());
        }
    }
}
