package Padroes_De_Software.Game.jogo;

import java.util.Scanner;

public class InputHandler {

    private static Scanner sc = new Scanner(System.in);
    private static int alvo;

    protected static int readInt(int qtdAlvos) {
        //Retornar um inteiro lido do teclado, tratando exceções
        do{
            try {
                alvo = sc.nextInt();
                if(alvo < 1 || alvo > qtdAlvos){
                    System.out.println("Entrada inválida. Por favor, insira um número entre [1 - " + qtdAlvos + "]:");
                }else{
                    return alvo;
                }
            }catch(Exception e){
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                sc.next();
            }
        }while(true);
       
    }
}