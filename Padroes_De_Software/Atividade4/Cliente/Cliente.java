package Padroes_De_Software.Atividade4.Cliente;

import Padroes_De_Software.Atividade4.Composite.InterfaceTarefa;
import Padroes_De_Software.Atividade4.Composite.ListaTarefas;
import Padroes_De_Software.Atividade4.Composite.Tarefa;

public class Cliente {
    public static void main(String[] args) {

        // Nível 1 (raiz)
        ListaTarefas projeto = new ListaTarefas("Projeto X");

        // Nível 2
        ListaTarefas fase1 = new ListaTarefas("Fase 1");
        ListaTarefas fase2 = new ListaTarefas("Fase 2");
        projeto.add(fase1);
        projeto.add(fase2);

        // Nível 3
        ListaTarefas modulo1 = new ListaTarefas("Módulo 1");
        ListaTarefas modulo2 = new ListaTarefas("Módulo 2");
        fase1.add(modulo1);
        fase1.add(modulo2);
        InterfaceTarefa t5 = new Tarefa("Documentar API");
        InterfaceTarefa t6 = new Tarefa("Treinar equipe");
        InterfaceTarefa t7 = new Tarefa("Deploy inicial");
        fase2.add(t5);
        fase2.add(t6);
        fase2.add(t7);

        // Nível 4 (tarefas simples)
        InterfaceTarefa t1 = new Tarefa("Analisar requisitos");
        InterfaceTarefa t2 = new Tarefa("Modelar banco de dados");
        InterfaceTarefa t3 = new Tarefa("Implementar login");
        InterfaceTarefa t4 = new Tarefa("Criar testes de integração");
        modulo1.add(t1);
        modulo1.add(t2);
        modulo2.add(t3);
        modulo2.add(t4);

        // CONSULTAR ESTADO INICIAL
        System.out.println("\n--- Estado Inicial ---");
        projeto.consultar();

        // CONCLUIR ALGUMAS TAREFAS
        System.out.println("\n--- Concluir algumas tarefas ---");
        t1.concluir();
        t2.concluir();
        System.out.println("--- Estado do Módulo 1 ---");
        modulo1.consultar();

        // CONCLUIR TODAS AS TAREFAS DO MÓDULO 2
        System.out.println("\n--- Concluir Módulo 2 ---");
        modulo2.concluir();
        System.out.println("--- Estado do Módulo 2 ---");
        modulo2.consultar();

        // CONSULTAR PROJETO COMPLETO (ainda não concluído pois faltam tarefas da fase 2)
        System.out.println("\n--- Estado do Projeto após algumas conclusões ---");
        projeto.consultar();

        // CONCLUIR TODA A FASE 2
        System.out.println("\n--- Concluir Fase 2 ---");
        fase2.concluir();
        System.out.println("--- Estado da Fase 2 ---");
        fase2.consultar();

        // CONSULTAR PROJETO NOVAMENTE
        System.out.println("\n--- Estado Final do Projeto ---");
        projeto.consultar();

        // DESFAZER UMA TAREFA
        System.out.println("\n--- Cancelar conclusão de uma tarefa (Deploy inicial) ---");
        t7.cancelar();
        System.out.println("--- Estado do Projeto após cancelamento ---");
        projeto.consultar();
    }
}
