package poo_Faculdade.Aula1_Object.Questão4;

public class TestaCasa {
    public static void main(String[]args){
        Casa a = new Casa();
        Casa b = new Casa();
        a.cor = "Branca";
        a.numero = 181;

        b.cor = "preta";
        b.numero = 273;

        System.out.println("A casa de número " + a.numero + " tem cor " + a.cor);
        System.out.println("A casa de número " + b.numero + " tem cor " + b.cor);
    }
}
//