abstract class Relatorio {
    //Template Method
    public final void gerarRelatorio() {
        buscarDados();
        processarDados();
        exportar(); // cada subclasse implementa do seu jeito
    }
    protected abstract void buscarDados();
    protected abstract void processarDados();
    protected abstract void exportar();
}

// Implementação concreta: Relatório PDF
class RelatorioPDF extends Relatorio {
    protected void buscarDados() {
        System.out.println("Buscando dados do banco para o PDF...");
    }
    protected void processarDados() {
        System.out.println("Processando dados para o PDF...");
    }
    protected void exportar() {
        System.out.println("Exportando relatório em PDF.");
    }
}

// Implementação concreta: Relatório CSV
class RelatorioCSV extends Relatorio {
    protected void buscarDados() {
        System.out.println("Buscando dados do banco para o CSV...");
    }
    protected void processarDados() {
        System.out.println("Processando dados para o CSV...");
    }
    protected void exportar() {
        System.out.println("Exportando relatório em CSV.");
    }
}

// Uso
public class Main {
    public static void main(String[] args) {
        Relatorio pdf = new RelatorioPDF();
        Relatorio csv = new RelatorioCSV();

        System.out.println("\n--- Gerando Relatório PDF ---");
        pdf.gerarRelatorio();

        System.out.println("\n--- Gerando Relatório CSV ---");
        csv.gerarRelatorio();
    }
}
