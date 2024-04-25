package poo_Faculdade.Provas.P1_2022_1.Questão1;
import java.util.Scanner;
import java.util.ArrayList;

public class SistemaPrincipal {
    
    public static void main(String[]args){
        String id;
        ArrayList<String> plantasArq = new ArrayList<>();
        ArrayList<Planta> plantas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ID da planta: ");
        id = sc.nextLine();
        Planta inserida = new Planta(id);
       // plantasArq = LerArquivo.retornaStrings(“c:/plantas.txt”);
        plantas = Utils.retornaDados(plantasArq);

        if(Utils.existe(plantas,inserida)){
            for(Planta lista : plantas){
                if(lista.getId() == id){
                    System.out.println(lista);
                }
            }
        }else{
            System.out.println("A planta com ID "+ id + " não existe");
        }
        sc.close();
    }
}
