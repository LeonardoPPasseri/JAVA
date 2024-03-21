package poo_Faculdade.Aula3_Aula4.Questão_1ponto_GetSet;

public class Programa {
    public static void main(String[] args) {
        Aluno A = new Aluno();
        A.nota1();
        A.nota2();
        System.out.println("O aluno "+A.getNome()+" possui as notas "+A.getNota1()+" e " + A.getNota2() + ", sua media é " + A.media() + " e sua situação é " + A.situação());
    }
}
