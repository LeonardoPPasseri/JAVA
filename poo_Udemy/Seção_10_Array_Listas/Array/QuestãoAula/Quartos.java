package poo_Udemy.Seção_10_Array_Listas.Array.QuestãoAula;
import java.util.Scanner;
public class Quartos {
    private String nome;
    private String email;
    
    Scanner sc = new Scanner(System.in);

    public void alugar(){
        System.out.print("Digite o nome:");
        setNome(sc.nextLine());
        System.out.print("Digite o email:");
        setEmail(sc.nextLine());
    }


    //get e set

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    
}
