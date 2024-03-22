package poo_Udemy.Seção_10_Array_Listas.Listas.QuestãoProposta;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Programa {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de funcionarios: ");
        int N = sc.nextInt();
        int teste = 0;
        Integer id;
        List<Funcionario> lista = new ArrayList<>();
        for(int i=0; i<N; i++){
            System.out.println("Funcinario numero " + (i+1) + ": ");
            
            //Verificação de repetição de valor nas variaveis
            do {
                teste = 0;
                System.out.print("ID: ");
                id = sc.nextInt();
                for (Funcionario funcionario : lista) {
                    if(funcionario.getId() == id){
                        teste = 1;
                        if(teste >= 1){
                            System.out.println("ID já usado!");
                        }
                    }
                }
            } while (teste == 1 );

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            Funcionario func = new Funcionario(id,nome,salario);
            lista.add(func);
        }
        System.out.println("================================");
        System.out.print("Qual o ID do funcionario que receberá aumento? ");
        int idEscolhida = sc.nextInt();
        for (Funcionario funcionario : lista) {
            if (funcionario.getId() == idEscolhida) {
                System.out.println("Digite qual a porcentagem de aumento(ex:50 Caso seja um aumento de 50%) ");
                funcionario.incrementarSalario(sc.nextInt());
                System.out.println("O funcionario " + idEscolhida + " possui um salario atualizado de R$" + funcionario.getSalario());
                teste = 1;
            }
        }if(teste != 1){
            System.out.println("Não encontrado!");
        }
        System.out.println("================================");
        for(Funcionario funcionario : lista){
            System.out.println("Funcinario numero " + lista.indexOf(funcionario));
            System.out.println("ID: " + funcionario.getId());
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salario: R$" + funcionario.getSalario());
            System.out.println("--------------");
        }
        sc.close();     
    }
}
