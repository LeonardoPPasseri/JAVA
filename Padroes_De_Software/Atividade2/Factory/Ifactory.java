package Factory;

import Produtos.Ibotao;
import Produtos.Ijanela;

public interface Ifactory{
    Ijanela criarJanela();
    Ibotao criarBotao();
}