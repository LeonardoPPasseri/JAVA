package poo_Udemy.Seção_12_Enumeração.Questão3;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Cliente cliente = new Cliente();
        System.out.println(cliente);
        Pedido novoPedido = new Pedido();

        System.out.println("**INICIANDO PEDIDOS**");
        System.out.println("Status: "+novoPedido.getStatus());
        System.out.print("Quantos produtos?");
        int qtd = sc.nextInt();
        for(int i = 0; i < qtd; i++){
            System.out.println("Item #" + (i+1));
            System.err.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            Double preçoProduto = sc.nextDouble();
            Produto produto = new Produto(nomeProduto,preçoProduto);
            System.out.print("Itens desse produto: ");
            Integer itensProduto = sc.nextInt();

            novoPedido.addPedido(new ItemPedidos(itensProduto,produto));
        }
        System.out.println("INVENTARIO");
        novoPedido.setStatus(OrdemPedido.valueOf("PROCESSANDO"));
        System.out.println("Horario do pedido: "+(novoPedido.getMomento()).format(fmt));
        System.out.println("Status do pedido: "+novoPedido.getStatus());
        System.out.println("Cliente: "+ cliente.getNome()+ " (" + cliente.getAniversario()+ ") - "+ cliente.getEmail());
        System.out.println("**PEDIDOS**");
        for (ItemPedidos p : novoPedido.getLista()) {
            System.out.println((p.getProduto()).getNome() + " ,$" + (p.getProduto()).getPreço() + " ,Quantidade: " + p.getQuantidade() + " ,Subtotal: " + p.subTotal() );
        }
        System.out.println("$"+novoPedido.total());
        sc.close();
    }
}
