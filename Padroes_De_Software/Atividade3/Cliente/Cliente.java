package Padroes_De_Software.Atividade3.Cliente;

import Padroes_De_Software.Atividade3.Relatorios.RelatorioDRE;
import Padroes_De_Software.Atividade3.Relatorios.RelatorioFluxoCaixa;
import Padroes_De_Software.Atividade3.Relatorios.Template_RelatorioFiscal;

public class Cliente {
    public static void main(String[] args) {
        
        System.out.println("\nRelatorios Fiscais DRE:\n");
        Template_RelatorioFiscal relatorioDRE = new RelatorioDRE();
        relatorioDRE.prepararRelatorio();

        System.out.println("\n========================================");

        System.out.println("\nRelatorios Fiscais Fluxo de Caixa:\n");
        Template_RelatorioFiscal relatorioFluxoCaixa = new RelatorioFluxoCaixa();
        relatorioFluxoCaixa.prepararRelatorio();
    }
}