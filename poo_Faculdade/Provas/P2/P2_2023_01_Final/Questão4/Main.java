package poo_Faculdade.Provas.P2.P2_2023_01_Final.Questão4;

public class Main {
    public static void main(String[] args) {
        String str = "10#2";
        try{
            System.out.println("A media é: " + MeuNumero.media(str));
        }catch(NumeroNegativoException e){
            System.out.println(e.getMessage());
        }
    }
}
