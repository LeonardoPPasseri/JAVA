abstract class BebidaQuente {
    // Template Method
    public final void prepararReceita() {
        ferverAgua();
        preparar();
        despejarNoCopo();
        adicionarCondimentos();
    }
    
    private void ferverAgua() {
        System.out.println("Fervendo a água...");
    }
    private void despejarNoCopo() {
        System.out.println("Despejando na xícara...");
    }
    protected abstract void preparar();
    protected abstract void adicionarCondimentos();
}

class Cafe extends BebidaQuente {
    @Override
    protected void preparar() {
        System.out.println("Passando o café no filtro...");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e leite...");
    }
}
class Main {
    public static void main(String[] args) {
        BebidaQuente cafe = new Cafe();

        System.out.println("Preparando café:");
        cafe.prepararReceita();
    }
}
