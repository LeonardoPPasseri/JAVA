package Factory;

import Produtos.BotaoWin;
import Produtos.Ibotao;
import Produtos.Ijanela;
import Produtos.JanelaWin;

public class FactoryWin implements Ifactory{
    public Ibotao criarBotao(){
        return new BotaoWin();
    }
    public Ijanela criarJanela(){
        return new JanelaWin();
    }
}