package poo_Udemy.Seção_13_Enumeração.Questão1;
import java.text.ParseException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Programa {
    
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o departamento do funcionario: ");
        String departamento =sc.nextLine();
        System.out.println("**Digite os dados do trabalhador** ");
        System.out.print("NOME: ");
        String nome = sc.nextLine();
        System.out.print("NIVEL: ");
        Nivel nivel = Nivel.valueOf(sc.nextLine());
        System.out.print("Salario Base: ");
        double salario = sc.nextDouble();

        System.out.print("Quantos contratos esse trabalhador possui? ");
        int num = sc.nextInt();
        Trabalhador novoTrabalhador = new Trabalhador(nome, salario, nivel, new Departamento(departamento));
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for(int i =0;i<num;i++){
            System.out.println("ENTRE COM O CONTRATO #" + (i+1));
            sc.nextLine();
            System.out.print("DATA (DD/MM/YYYY): ");
            LocalDate data = LocalDate.parse(sc.nextLine(),fmt01);
            System.out.print("VALOR POR HORA: ");
            double valorHora = sc.nextDouble();
            System.out.print("DURAÇÃO(horas): ");
            int horas = sc.nextInt();
            ContratoHora novoContrato = new ContratoHora(data, valorHora, horas);
            novoTrabalhador.adicionarContrato(novoContrato);
        }
        sc.nextLine();
        System.out.print("ENTRE COM MES E ANO PARA SABER A RENDA (MM/YYYY): ");
        String data_renda = sc.nextLine();
        int mes = Integer.parseInt(data_renda.substring(0, 2));
        int ano = Integer.parseInt(data_renda.substring(3));
        System.out.println("Nome: " + novoTrabalhador.getNome());
        System.out.println("Departamento: " + novoTrabalhador.getDepartamento().getNome());
        System.out.println("Renda de " + data_renda + ":" + novoTrabalhador.renda(ano, mes) );

        sc.close();
    }
}
