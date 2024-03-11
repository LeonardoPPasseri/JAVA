package poo_Udemy.Seção_5_EstruturasCondicionais.Questão8;
import java.util.Scanner;

public class CalculaImposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imposto = 0.0;
        System.out.println("=====================================");
        System.out.println("RENDA                        IMPOSTO");
        System.out.println("de R$1000.01 a R$2000.00     Isento");
        System.out.println("de R$2000.01 a R$3000.00     8%");
        System.out.println("de R$3000.01 a R$4500.00     18%");
        System.out.println("Acima de  R$4500.00          28%");
        System.out.println("=====================================");

        System.out.println("Digite sua renda: ");
        double renda = sc.nextDouble();
        
        if(renda > 4500.0){
            imposto = 1000*0.08;
            imposto = imposto + (1500*0.18);
            imposto = imposto + ((renda-4500)*0.28);
        }else if(renda > 3000.0){
            imposto = 1000*0.08;
            imposto = imposto + ((renda-3000)*0.18);
            
        }else if(renda > 2000.0){
            imposto = (renda-2000)*0.08;
            
        }else {
            System.out.println("ISENTO");
        }
        System.out.printf("O valor a ser pago em imposto é R$%.2f%n", imposto); 

        sc.close();
    }
    

}
