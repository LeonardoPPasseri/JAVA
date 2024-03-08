package poo_Faculdade.aula1_Object.Questão1;

public class Gato {
    boolean vivo;
    String cor;
    int idade;
    String nome;
    public static void miando(){
        System.out.println("Gato miando");
    } 
    public void info(){
        if(vivo == true){
            System.out.println(nome + " de " + idade + " anos possui a(s) cor(es) " + cor);
            miando();
        }
        else{
            System.out.println(nome + " faleceu :( ");
        }
    }
}
