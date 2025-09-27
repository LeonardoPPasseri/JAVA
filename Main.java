
// Classe legada (não pode ser alterada)
class RelatorioLegado {
    public void imprimirRelatorioVelho() {
        System.out.println("Imprimindo relatório no formato legado...");
    }
}


interface Relatorio {
    void gerarRelatorio();    
}

class RelatorioAdapter extends RelatorioLegado implements Relatorio{
    @Override
    public void gerarRelatorio() {
        imprimirRelatorioVelho();        
    }
}


public class Main {
    public static void main(String[] args) {
        Relatorio relatorio = new RelatorioAdapter();
        relatorio.gerarRelatorio();
    }
}