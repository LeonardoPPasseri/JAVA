package Padroes_De_Software.Atividade3.Relatorios;

public class RelatorioFluxoCaixa extends Template_RelatorioFiscal{

    @Override
    protected void capturarDados() {
        System.out.println("Importar entradas (recebimentos de clientes, empréstimos, aportes de capital);" +
                        "\n" +
                        "Importar saídas (pagamentos de fornecedores, salários, impostos, empréstimos);" + 
                        "\n" +
                        "Pegar dados de extratos bancários e do ERP.");
    }
    protected void classificacao() {
        System.out.println("Alocar lançamentos conforme categorias: Operacional/Investimento/Financiamento.");
    }
    protected void calculos() {
        System.out.println("Saldo Operacional = Saldo Inicial + Entradas - Saidas;\nSaldo Final = Saldo Operacional + Financiamente + Investimentos.");
    }
    protected void gerarRelatorio() {
        System.out.println("Gerar relatório em excel.");
    }

    
}
