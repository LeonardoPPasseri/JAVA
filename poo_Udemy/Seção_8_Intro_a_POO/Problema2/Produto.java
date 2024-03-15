package poo_Udemy.Seção_8_Intro_a_POO.Problema2;
import java.util.Scanner;
public class Produto {
    String nome;
    int qtd;
    double preço;
    public Produto(){
        System.out.println("Digite o nome do produto:");
        this.nome = sc.nextLine();
        System.out.println("Digite o valor unitario do produto: ");
        this.preço = sc.nextDouble();
        System.out.println("Digite o quantidade no estoque: ");
        this.qtd = sc.nextInt();
    }
    Scanner sc = new Scanner(System.in);

    public void addEstoque(){
        System.out.print("Quanto vc desse produto será adicionado ao estoque? ");
        int add = sc.nextInt();
        qtd = qtd + add;
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
    public String toString(){
        return ("Informação do produto: " + nome + ", R$" + preço +", " + qtd +" unidade(s), total: R$" + qtd*preço);
    }
    
}
