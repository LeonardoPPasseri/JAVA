package poo_Faculdade.Provas.P2.P2_2022_01.Questão2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String str = sc.nextLine();
        str = StringUtils.processa(str);
        str = StringUtils.inverte(str);
        System.out.println(str);
    }
}