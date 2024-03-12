package poo_Udemy.Seção_8_Intro_a_POO.Problema2;
import java.util.Scanner;
public class Produto {
    String nome;
    int qtd;
    double preço;

    Scanner sc = new Scanner(System.in);

    public void addEstoque(){
        System.out.print("Quanto vc desse produto será adicionado ao estoque? ");
        int add = sc.nextInt();
        qtd += add;
    }
    public void removerEstoque(){
        System.out.print("Quanto vc desse produto será removido do estoque? ");
        int rem = sc.nextInt();
        if(qtd < rem){
            qtd = 0;
        }else{
            qtd = qtd - rem;
        }
    }
    public void info(){
        double valor = qtd*preço;
        System.out.println("Informação do produto: " + nome + ", R$" + preço +", " + qtd +" unidade(s), total: R$" + valor);
    }
    
}
