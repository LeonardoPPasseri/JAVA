package Factory;

import Produtos.BotaoMac;
import Produtos.Ibotao;
import Produtos.Ijanela;
import Produtos.JanelaMac;

public class FactoryMac implements Ifactory{
    public Ibotao criarBotao(){
        return new BotaoMac();
    }
    public Ijanela criarJanela(){
        return new JanelaMac();
    }
}