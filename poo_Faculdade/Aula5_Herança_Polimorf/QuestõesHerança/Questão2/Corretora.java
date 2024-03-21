package poo_Faculdade.Aula5_Herança_Polimorf.QuestõesHerança.Questão2;
import java.util.Scanner;
public class Corretora {
    
    public static void main(String[] args) {
        Imovel[] imoveis = new Imovel[2];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<imoveis.length;i++){
            System.out.print("Esse imovel é novo?(s/n): ");
            if(sc.next().charAt(0) == 's'){ //Usado para pegar o char digitado no Scanner
                imoveis[i] = new Novo();
            }else{
                imoveis[i] = new Velho();
            }
            System.out.print("Preço: ");
            imoveis[i].setPreço(sc.nextDouble());
            System.out.print("Endereço: ");
            sc.nextLine();
            imoveis[i].setEndereço(sc.nextLine());
        }
        Somatorio(imoveis);
        sc.close();
    }
    public static void Somatorio(Imovel imoveis[]){
        double total=0;
        for(int i = 0;i<imoveis.length;i++){
            System.out.println(imoveis[i].getPreço());
            total += imoveis[i].getPreço();
        }
        System.out.println("O Somatorio dos imoveis: " + total);
    }
}
