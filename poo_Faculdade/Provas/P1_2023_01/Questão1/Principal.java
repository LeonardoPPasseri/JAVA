package poo_Faculdade.Provas.P1_2023_01.Questão1;
import java.util.Scanner;
import java.util.ArrayList;
public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id;
        System.out.print("Digite o ID do biscoito: ");
        id = sc.nextLine();
        Biscoito inserido = new Biscoito(id);
        ArrayList<Object> recebido = new ArrayList<>();
        //recebido = Utils2.getList();
        if(Utils.existe(recebido, inserido)){
            for(Object lista : recebido){
                if(lista instanceof Biscoito){
                    Biscoito biscoito = (Biscoito) lista;
                    if(biscoito.getId() == id){
                        System.out.println(biscoito);
                        break;
                    }
                }
            }
        }
        
       sc.close();
        
    }
    public Biscoito[] transformaListEmArray(ArrayList<Object> k){

        Biscoito[] biscoitos = new Biscoito[k.size()];
        for(Object listaObj : k){
            if(listaObj instanceof Biscoito){
                for(int c=0;c<biscoitos.length;c++){
                    biscoitos[c] = (Biscoito)listaObj;
                }
            }
        }
        return biscoitos;
    }

    public void calculaPreço(Biscoito[] biscoitos){
        int total = 0;
        for(int i=0;i<biscoitos.length;i++){
            total += biscoitos[i].getPreço();
        }
        System.out.println(total);
    }
}
