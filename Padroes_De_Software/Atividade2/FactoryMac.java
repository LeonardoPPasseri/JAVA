public class FactoryMac implements Ifactory{
    public Ibotao criarBotao(){
        return new BotaoMac();
    }
    public Ijanela criarJanela(){
        return new JanelaMac();
    }
}