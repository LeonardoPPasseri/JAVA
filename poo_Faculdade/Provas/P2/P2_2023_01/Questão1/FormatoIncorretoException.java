package poo_Faculdade.Provas.P2.P2_2023_01.Questão1;

public class FormatoIncorretoException extends Exception {
    private String msg;
    public FormatoIncorretoException(String msg){
        super(msg);
    }
}
