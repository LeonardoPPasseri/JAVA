package poo_Faculdade.aula2_Logica;

public class Array {
    String nome;
    int idade;
    public static void main(String[] args) {
        Array [] x = new Array[6]; //Criar array pode ser feito sem criar atributo array a class
        x[2] = new Array(); //É preciso adicionar cada seção do array na class
        x[2].nome = "Leo";
        x[2].idade = 24;
        System.out.println(x[2].nome + " " + x[2].idade);
    }
}
