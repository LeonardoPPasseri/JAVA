public class FactoryWin implements Ifactory{
    public Ibotao criarBotao(){
        return new BotaoWin();
    }
    public Ijanela criarJanela(){
        return new JanelaWin();
    }
}