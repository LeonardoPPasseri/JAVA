package Cliente;

import Factory.FactoryMac;
import Factory.FactoryWin;
import Factory.Ifactory;
import Produtos.Ibotao;
import Produtos.Ijanela;

public class Cliente{
    public static void main(String[] args) {
        Ifactory factory;
        factory = new FactoryWin();

        //Windows
        Ibotao botao = factory.criarBotao();
        Ijanela janela = factory.criarJanela();
        System.out.println("----------");
        botao.criar();
        janela.abrir();
        System.out.println("----------");

        //MacOS
        factory = new FactoryMac();
        botao = factory.criarBotao();
        janela = factory.criarJanela();
        System.out.println("----------");
        botao.criar();
        janela.abrir();
        System.out.println("----------");
    }
}