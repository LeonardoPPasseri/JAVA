package poo_Udemy.Seção_13_Herança_Polimorfismo.Resumos_Aulas.Classes_Metodos_Abstratas.Metodos_abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas formas? ");
        int qtd = sc.nextInt();
        List<Forma> lista = new ArrayList<>();
        for(int i=0;i<qtd;i++){
            System.out.println((i+1) +"# FORMA");
            System.out.print("Retangulo ou Circulo(R/C): ");
            char ch = sc.next().charAt(0);
            System.out.print("Qual a cor? PRETO/AZUL/VERMELHO: ");
            String cor = sc.next();
            if(ch == 'C'){
                System.out.print("Qual o raio do circulo: ");
                double raio = sc.nextDouble();
                lista.add(new Circulo(Cor.valueOf(cor),raio));
            }
            if(ch == 'R'){
                System.out.print("Qual a altura do retangulo: ");
                double altura = sc.nextDouble();
                System.out.print("Qual a base do retangulo: ");
                double base = sc.nextDouble();
                lista.add(new Retangulo(Cor.valueOf(cor),altura,base));
            }
            
            
        }
        System.out.println("===AREA DAS FORMAS===");
        for (Forma forma : lista) {
            System.out.println(forma.area());
        }
        sc.close();
    }
}
