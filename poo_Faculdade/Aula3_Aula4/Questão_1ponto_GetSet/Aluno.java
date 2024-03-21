package poo_Faculdade.Aula3_Aula4.Questão_1ponto_GetSet;
import java.util.Scanner;
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    Scanner sc = new Scanner(System.in);

    Aluno(){ //Construtor que pede o nome do aluno no momento que é criado o objeto com a class Aluno
        System.out.print("Digite o nome do aluno: ");
        setNome(sc.nextLine());
    }

    public void nota1(){//metodo que pede a "nota1" e usa o metodo "teste" para saber se está de acordo com a regra
        System.out.print("Digite a primeira nota: ");
        setNota1(sc.nextDouble());
        setNota1(teste(getNota1()));
        System.out.println(getNota1());
    }
    public void nota2(){//metodo que pede a "nota2" e usa o metodo "teste" para saber se está de acordo com a regra
        System.out.print("Digite a segunda nota: ");
        setNota2(sc.nextDouble());
        setNota2(teste(getNota2()));
        System.out.println(getNota2());
    }

    public String situação(){ //metodo que calcula a media e printa a situação do aluno
        double media = media();
        if(media >= 4 && media < 6){
            return "Em recuperação";
        }else if(media < 4){
            return "Reprovado";
        }
        return "Aprovado!";
        }

    public double media(){
        
        return (getNota1()+getNota2())/2;
    }

    public double teste(double nota){//metodo que recebe a nota por argumento e testa se a nota digitada esta de acordo com a regra e retorna
        if(nota < 0){
            nota = 0;
        }else if(nota > 10){
            nota = 10;
        }
        return nota;
    }

    //===================================== get set ======================

    public void setNome(String nome){//Recebe o nome e adiciona ao atributo do objeto
        this.nome = nome;
    }
    public String getNome(){//Retorna o nome do obejeto
        return nome;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public double getNota1(){
        return nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public double getNota2(){
        return nota2;
    }
    


}   