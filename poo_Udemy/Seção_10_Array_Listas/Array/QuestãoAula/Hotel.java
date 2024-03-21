package poo_Udemy.Seção_10_Array_Listas.Array.QuestãoAula;
import java.util.Scanner;
public class Hotel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quartos[] aluguel = new Quartos[10];
        System.out.print("Digite quantos quartos serão alugados:");
        int N = sc.nextInt();

        for(int x = 0; x < aluguel.length;x++){
            aluguel[x] = new Quartos();
        }

        for(int i = 0; i < N; i++){
            System.out.print("Digite qual quarto ele escolheu(0 a 9):");
            aluguel[sc.nextInt()].alugar();
        }
        System.out.println("===============================");
        System.out.println("Quartos alugados:");
        for(int c = 0; c < aluguel.length; c++){
            if(aluguel[c].getNome() != null){
                System.out.println("Quarto: " + c + ", Nome: " + aluguel[c].getNome() + ", Email: " + aluguel[c].getEmail());
            }
        }
        sc.close();
    }
}
