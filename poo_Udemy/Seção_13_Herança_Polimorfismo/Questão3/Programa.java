package poo_Udemy.Seção_13_Herança_Polimorfismo.Questão3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos contribuintes: ");
        int qtd = sc.nextInt();
        List<Contribuinte> lista = new ArrayList<>();
        for(int i=0;i<qtd;i++){
            System.out.println((i+1) +"# Contribuinte");
            System.out.print("Pessoa Fisica ou Juridica (F/J): ");
            char ch = sc.next().charAt(0);
            System.out.print("Qual o nome: ");
            String nomeContr = sc.next();
            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();
            if(ch == 'F'){
                System.out.print("Qual o gasto com saude: ");
                double gastoSaude = sc.nextDouble();
                lista.add(new PessoaFisica(nomeContr,renda,gastoSaude));
            }
            if(ch == 'J'){
                System.out.print("Quantos funcionarios: ");
                int func = sc.nextInt();
                lista.add(new PessoaJuridica(nomeContr,renda,func));
            }
        }
        System.out.println("===Imposto dos Contribuintes===");
        double total = 0.0;
        for (Contribuinte c : lista) {
            total += c.imposto();
            System.out.println(c.getNome() + " $" + String.format("%.2f", c.imposto()));
        }
        
        System.out.println("\nImposto Total: "+String.format("%.2f", total));
        sc.close();
    }
}
