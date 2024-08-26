package poo_Faculdade.Aula8.SistemaOrientadoAObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========INICIANDO=========");
        System.out.println();
        System.out.println("===================================================");
        System.out.println("1 - Lista dos Imoveis");
        System.out.println("2 - Adicionar imovel");
        System.out.println("3 - Remover Imovel");
        System.out.println("4 - Procurar Imovel pelo ID");
        System.out.println("5 - Valor de todos os imoveis a venda");
        System.out.println("6 - Valor medio de todos os imoveis para alugar");
        System.out.println("7 - Rever tabela");
        System.out.println("0 - Sair");
        System.out.println("===================================================");
        System.out.println();
        int teste = 0;
        
        List<Imovel> lista = new ArrayList<>();
        int id = 0;
        Imovel a = new Imovel();
        do{
            System.out.print("Item: ");
            teste = sc.nextInt();
            switch (teste) {
                case 1:
                    if(lista.isEmpty()){
                        System.out.println("lista vazia");
                    }else{
                        System.out.println("====Lista dos imoveis====");
                        for(Imovel l : lista){
                            System.out.println("----");
                            System.out.println(l);
                        }
                    }
                    break;
                case 2:
                    //System.out.print("Qual tipo de imovel(apto ou casa): ");
                    //sc.nextLine();
                    //String tipo = sc.nextLine();
                    //if(tipo.equals("apto")){
                        lista.add(new Apto("João Silva", "Rua das Flores, 123, São Paulo", "Venda", 150000.00, 1, "5º", "10"));
                        lista.add(new Apto("Maria Santos", "Avenida Brasil, 555, Rio de Janeiro", "Aluguel", 2000.00, 2, "2º", "20"));
                    //}if(tipo.equals("casa")){
                        System.out.println("foi");
                        lista.add(new Casa(true, "Pedro Rodrigues", "Rua dos Pássaros, 456, Belo Horizonte", "Venda", 500000.00, 3));
                        lista.add(new Casa(false, "Ana Oliveira", "Avenida das Palmeiras, 789, Salvador", "Aluguel", 8000.00, 4));
                    //}
                    break;
                case 3:
                    System.out.print("ID do imovel a ser removido: ");
                    id = sc.nextInt();
                    a = new Imovel(id);
                    int local = lista.indexOf(a);
                    lista.remove(local);
                    System.out.println("Removido!");
                    break;
                case 4:
                    System.out.print("ID do imovel a ser procurado: ");
                    id = sc.nextInt();
                    a = new Imovel(id);
                    //local = lista.indexOf(a);
                    for (Imovel l : lista) {
                        if(l.equals(a)){
                            System.out.println(l);
                        }
                    }
                    break;
                case 5:
                    double totalV = 0.0;
                    a = new Imovel("Venda");
                    for (Imovel l : lista) {
                        if (l.equals(a)) {
                            totalV += l.getValor();
                        }
                    }
                    System.out.println("R$" + totalV);
                    break;
                case 6:
                    double totalA = 0.0;
                    int c = 0;
                    for (Imovel l : lista) {
                        if (l.getStatus().equals("Aluguel")) {
                            totalA += l.getValor();
                            c += 1;
                        }
                    }
                    System.out.println("R$" + totalA/c);

                    break;
                case 7:
                    System.out.println("===================================================");
                    System.out.println("1 - Lista dos Imoveis");
                    System.out.println("2 - Adicionar imovel");
                    System.out.println("3 - Remover Imovel");
                    System.out.println("4 - Procurar Imovel pelo ID");
                    System.out.println("5 - Valor de todos os imoveis a venda");
                    System.out.println("6 - Valor medio de todos os imoveis para alugar");
                    System.out.println("7 - Rever tabela");
                    System.out.println("0 - Sair");
                    System.out.println("===================================================");
                    break;
                case 0:

                    break;

                default:
                    break;
            }
        }while(teste != 0);
        sc.close();
    }
    
}
