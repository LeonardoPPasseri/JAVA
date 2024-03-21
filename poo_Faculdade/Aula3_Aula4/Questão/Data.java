package poo_Faculdade.Aula3_Aula4.Questão;
import java.util.Scanner;
public class Data {
    private int dia;
    private int mes;
    private int ano;

    Scanner sc = new Scanner(System.in);

    public void dia(){
        do{
            System.out.print("Digite o dia da criação do banco: ");
            setDia(sc.nextInt());
            if(dia < 1 || dia > 31){
                System.out.println("ERRO!");
            }
        }while(dia < 1 || dia > 31);
    }
    public void mes(){
        do{
            System.out.print("Digite o mes da criação do banco: ");
            setMes(sc.nextInt());
            if(mes < 1 || mes > 12){
                System.out.println("ERRO!");
            }
        }while(mes < 1 || mes > 12);
    }
    public void ano(){
        do{
            System.out.print("Digite o ano da criação do banco: ");
            setAno(sc.nextInt());
            if(ano < 1808 || ano > 2024){
                System.out.println("ERRO!");
            }
        }while(ano < 1808 || ano > 2024);
    }

    
    //======================================= get set
    
    

    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
}
