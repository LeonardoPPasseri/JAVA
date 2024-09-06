package poo_Faculdade.Provas.P2.P2_2023_02.Questão3;

public class Principal {
    public static void main(String[] args) {
        String x = "A casa é minha";
        try{
           Utils.verifica(x); 
           System.out.println(Utils.moderar(x));
        }catch(TextoCurtoException e){
            System.err.println(e.getMessage());
        }
    }
}
