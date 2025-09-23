package Padroes_De_Software.Atividade3.Relatorios;

public class RelatorioDRE extends Template_RelatorioFiscal{

    protected void capturarDados() {
        System.out.println("Pegar do ERP/contabilidade: vendas, devoluções, impostos, custos, despesas.");
    }
    protected void classificacao() {
        System.out.println("Alocar lançamentos conforme plano de contas.");
    }
    protected void calculos() {
        System.out.println("Receita Líquida = Receita Bruta - Deduções/Impostos\n"+ 
                        "Lucro Bruto = Receita Líquida - Custos\n" + 
                        "Resultado Operacional (EBIT) = Lucro Bruto - Despesas Operacionais\n" + 
                        "LAIR = EBIT ± Outras Receitas/Despesas\n" + 
                        "Lucro Líquido = LAIR - Impostos");
    }
    protected void gerarRelatorio() {
        System.out.println("Gerar relatório em PDF");
    }
    
}
