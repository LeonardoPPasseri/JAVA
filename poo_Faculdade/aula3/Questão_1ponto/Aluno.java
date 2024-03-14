package poo_Faculdade.aula3.Questão_1ponto;
import java.util.Scanner;
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    Scanner sc = new Scanner(System.in);

    Aluno(){ //Construtor que pede o nome do aluno no momento que é criado o objeto com a class Aluno
        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();
    }

    public void nota1(){//metodo que pede a "nota1" e usa o metodo "teste" para saber se está de acordo com a regra
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        nota1 = teste(nota1);
        System.out.println(nota1);
    }
    public void nota2(){//metodo que pede a "nota2" e usa o metodo "teste" para saber se está de acordo com a regra
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        nota2 = teste(nota2);
        System.out.println(nota2);
    }

    public void media(){ //metodo que calcula a media e printa a situação do aluno
        double media = (nota1+nota2)/2;
        if(media >= 4 && media < 6){
            System.out.println("Em recuperação");
        }else if(media < 4){
            System.out.println("Reprovado");
        }else{
            System.out.println("Aprovado!");
        }
    }

    public double teste(double nota){//metodo que recebe a nota por argumento e testa se a nota digitada esta de acordo com a regra e retorna
        if(nota < 0){
            nota = 0;
        }else if(nota > 10){
            nota = 10;
        }
        return nota;
    }
}   