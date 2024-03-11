package poo_Udemy.Seção_5_EstruturasCondicionais.Questão5_Projeto;
import java.util.Scanner;
public class ListaDeCompras {
    public static void main(String[] args) {
        int x;
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("============TABELA DE PREÇO==============");
        System.out.println("Codigo       Especificação         Preço");
        System.out.println("01            X-Tudo              R$6.90");
        System.out.println("02            X-Salada            R$5.50");
        System.out.println("03            X-bacon             R$7.90");
        System.out.println("04            Refrigerante        R$8.90");
        System.out.println("05            CachorroQuente      R$4.50");
        System.out.println("=========================================");
        
        do{
            Escolha pedido = new Escolha();
            total = total + pedido.escolha();
           
            System.out.println("continuar(0) se não (1)");
            x = sc.nextInt();
        }while(x == 0);
        
        System.out.println("O total a ser pago é R$" + total);
        sc.close();
    }   
}