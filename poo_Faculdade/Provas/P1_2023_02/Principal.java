package poo_Faculdade.Provas.P1_2023_02;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Principal {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.err.println("Digite o id:");
        String id = sc.nextLine();
        Produto inserido = new Produto(id);
        List<Object> listaObj = new ArrayList<>();
        //listaObj = Utils.getLista(); 
        if(Utils.existe(listaObj,inserido)){
            System.out.println(listaObj.get(listaObj.indexOf(inserido)));
        }
        sc.close();
    }

    public Produto[] transformaListEmArray(List<Object> k){
        List<Produto> listProd = new ArrayList<>();
        Iterator<Object> x = k.iterator();
        while(x.hasNext()){
            Object y = x.hasNext();
            if(y instanceof Produto){
                listProd.add((Produto)y);
            }
        }
        return listProd.toArray(new Produto[0]);
    }
    

}
