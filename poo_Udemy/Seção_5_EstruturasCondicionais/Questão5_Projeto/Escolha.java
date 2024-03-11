package poo_Udemy.Seção_5_EstruturasCondicionais.Questão5_Projeto;
import java.util.Scanner;

public class Escolha {

    public double escolha() {
        int codigo;
        double valor=0;
        int qtd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do produto(1-5):");
        codigo = sc.nextInt();
        System.out.println("Digite a quantidade");
        qtd = sc.nextInt();
        switch (codigo) {
            case 1:
                valor = 6.9;
                break;
            case 2:
                valor = 5.5;
                break;
            case 3:
                valor = 7.9;
                break;
            case 4:
                valor = 8.9;
                break;
            case 5:
                valor = 9.5;
                break;
            default:
                break;
        }
        sc.close();
        return valor*qtd;
    } 
}
