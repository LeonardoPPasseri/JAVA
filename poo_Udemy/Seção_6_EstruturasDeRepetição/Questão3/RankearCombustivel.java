package poo_Udemy.Seção_6_EstruturasDeRepetição.Questão3;
import java.util.Scanner;
public class RankearCombustivel {
    String combustivel;
    int clientes = 0;
    public static void main(String[] args) {
        int codigo;
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Codigo       Combustivel ");
        System.out.println(" 1            Alcool     ");
        System.out.println(" 2            Gasolina   ");
        System.out.println(" 3            Disel      ");
        System.out.println(" 0            Sair       ");
        System.out.println("=========================");
        int length = 3;
        RankearCombustivel [] lista = new RankearCombustivel[length];
        lista[0] = new RankearCombustivel();
        lista[1] = new RankearCombustivel();
        lista[2] = new RankearCombustivel();
        lista[0].combustivel = "alcool";
        lista[1].combustivel = "Gasolina";
        lista[2].combustivel = "Disel";
        

        for(int i = 0; i<1;){
            System.out.println("Digite o codigo do combustivel usado");
            codigo = sc.nextInt();
            if(codigo > 3 || codigo < 0){
                System.out.println("Codigo invalido confirme o codigo na tabela");
                codigo = sc.nextInt();
            }
            if(codigo == 0){
                break;
            }else if(codigo == 1){
                lista[0].clientes += 1;
            }else if(codigo == 2){
                lista[1].clientes +=1;
            }else{
                lista[2].clientes +=1;
            }
        }
        for(int c=0;c<length;c++){
            System.out.println(lista[c].combustivel + ": " + lista[c].clientes);
        }
    }
}
