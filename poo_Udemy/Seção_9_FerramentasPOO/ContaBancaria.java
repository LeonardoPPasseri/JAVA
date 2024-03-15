package poo_Udemy.Seção_9_FerramentasPOO;
import java.util.Scanner;

public class ContaBancaria {
    private String codigo; //Modificadores private
    private String nome;
    private double saldo;
    //Get e Set 
    Scanner sc = new Scanner(System.in);
    
    public ContaBancaria(){ //Construtores
        System.out.print("Digite o codigo da conta:");
        this.codigo = sc.nextLine();
        System.out.print("Digite o nome do titular:");
        this.nome = sc.nextLine();
        System.out.println("Deseja inserir o valor inicial da conta? (y/n)");
        String teste = sc.nextLine();
        if(teste == "y"){
            System.out.print("Digite o valor inicial na conta(Pode ser 0):");
            setSaldo(sc.nextDouble()); 
        }
        
    }

    

    public void deposito(double deposito){
        setSaldo(deposito + getSaldo());
        dados();
    }
    public void saque(double saque){
        setSaldo(getSaldo() - (saque + 5) );
        dados();
    }
    public void dados(){
        System.out.println("=======================");
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Nome: "+getNome());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("=======================");
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCodigo(){
        return codigo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
