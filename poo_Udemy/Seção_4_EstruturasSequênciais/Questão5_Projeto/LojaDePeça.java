package poo_Udemy.Seção_4_EstruturasSequênciais.Questão5_Projeto;
import java.util.Scanner;


public class LojaDePeça {
    public static void main(String[] args) {
        int x;
        int i=0;
       
        CalculaValor[] lista = new CalculaValor[5];
        Scanner sc = new Scanner(System.in);
        do{
            if(i == 5){
              //  CalculaValor[] a1 = new CalculaValor[5];
               break;
            }
            lista[i] = new CalculaValor();
    
            System.out.print("Digite o codigo do produto: ");
            lista[i].codigo = sc.nextInt(); // ERRO! ao usar codigo como string esta usando o enter como resposta e pula a pergunta.
            System.out.print("Digite a quantidade de peça: ");
            lista[i].qtd = sc.nextInt();
            System.out.print("Digite o valor da peça:");
            lista[i].valorPorPeça = sc.nextInt();

            lista[i].calculaValor();

            System.out.println("Digite (0) para adicionar mais um produto e (1) para sair");

            x = sc.nextInt();

            i += 1;
        }while(x == 0);

        double gastoTotal = 0;
        for(int c=0;c<i;c++){
           gastoTotal += lista[c].total; 
        }
        System.out.println("O total da venda é "+ gastoTotal);
        
        sc.close();
    }
}