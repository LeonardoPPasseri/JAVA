package Padroes_De_Software.Atividade3.Relatorios;

public abstract class Template_RelatorioFiscal {
    public final void prepararRelatorio(){
        capturarDados();
        classificacao();
        calculos();
        gerarRelatorio();
        distribuirRelatorio();
    }
    protected abstract void capturarDados();
    protected abstract void classificacao();
    protected abstract void calculos();
    protected abstract void gerarRelatorio();

    private void distribuirRelatorio() {
        System.out.println("Relatório enviado para diretoria.");
    }
}
