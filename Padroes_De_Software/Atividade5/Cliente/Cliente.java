package Padroes_De_Software.Atividade5.Cliente;

import Padroes_De_Software.Atividade5.Elementos.Construcao;
import Padroes_De_Software.Atividade5.Elementos.Obstaculo;
import Padroes_De_Software.Atividade5.Elementos.Terreno;
import Padroes_De_Software.Atividade5.Elementos.Unidade;
import Padroes_De_Software.Atividade5.Memento.Caretaker;
import Padroes_De_Software.Atividade5.Memento.Mapa;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  EDITOR DE MAPAS - JOGO DE ESTRATÉGIA");
        System.out.println("  Demonstração dos padrões Memento e Prototype");
        System.out.println("=================================================\n");
        
        // Criando o Caretaker e o Mapa
        Caretaker caretaker = new Caretaker();
        Mapa mapa = new Mapa(caretaker);
        caretaker.setMapa(mapa);
        
        System.out.println("Mapa criado com sucesso!");
        mapa.exibirMapa();
        
        // TESTE 1: Adicionando um terreno ao mapa
        System.out.println("\n--- TESTE 1: Adicionando terreno 'Planície' ---");
        Terreno terreno1 = new Terreno("Planície Verde", 5, 5, "Grama");
        mapa.adicionarElemento(terreno1);
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 2: Adicionando um obstáculo
        System.out.println("\n--- TESTE 2: Adicionando obstáculo 'Montanha' ---");
        Obstaculo obstaculo1 = new Obstaculo("Montanha Alta", 10, 8, 150);
        mapa.adicionarElemento(obstaculo1);
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 3: Adicionando uma unidade
        System.out.println("\n--- TESTE 3: Adicionando unidade 'Guerreiro' ---");
        Unidade unidade1 = new Unidade("Guerreiro", 3, 7, 100);
        mapa.adicionarElemento(unidade1);
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 4: Adicionando uma construção
        System.out.println("\n--- TESTE 4: Adicionando construção 'Quartel' ---");
        Construcao construcao1 = new Construcao("Quartel", 15, 12, 20);
        mapa.adicionarElemento(construcao1);
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 5: Adicionando mais elementos
        System.out.println("\n--- TESTE 5: Adicionando mais elementos ---");
        mapa.adicionarElemento(new Terreno("Deserto", 20, 20, "Areia"));
        mapa.adicionarElemento(new Unidade("Arqueiro", 8, 9, 80));
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 6: Testando UNDO (desfazer última ação)
        System.out.println("\n--- TESTE 6: Desfazendo última ação (adição de Arqueiro) ---");
        caretaker.undo();
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 7: Testando UNDO múltiplas vezes
        System.out.println("\n--- TESTE 7: Desfazendo mais duas ações ---");
        caretaker.undo();
        mapa.exibirMapa();
        caretaker.undo();
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 8: Testando REDO (refazer ação)
        System.out.println("\n--- TESTE 8: Refazendo uma ação ---");
        caretaker.redo();
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 9: Adicionando novo elemento após undo (limpa histórico de redo)
        System.out.println("\n--- TESTE 9: Adicionando novo elemento após undo ---");
        System.out.println("(Isto deve limpar o histórico de redo)");
        mapa.adicionarElemento(new Obstaculo("Rochedo", 25, 25, 80));
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 10: Tentando REDO após adicionar novo elemento
        System.out.println("\n--- TESTE 10: Tentando refazer (deve falhar) ---");
        caretaker.redo();
        caretaker.exibirStatus();
        
        // TESTE 11: Removendo um elemento
        System.out.println("\n--- TESTE 11: Removendo o primeiro elemento do mapa ---");
        mapa.removerElementoPorIndice(0);
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 12: Desfazendo a remoção
        System.out.println("\n--- TESTE 12: Desfazendo a remoção ---");
        caretaker.undo();
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 13: Desfazendo até o mapa ficar vazio
        System.out.println("\n--- TESTE 13: Desfazendo até o mapa ficar vazio ---");
        while (caretaker.podeDesfazer()) {
            caretaker.undo();
        }
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 14: Tentando desfazer quando não há mais ações
        System.out.println("\n--- TESTE 14: Tentando desfazer sem ações disponíveis ---");
        caretaker.undo();
        
        // TESTE 15: Refazendo todas as ações
        System.out.println("\n--- TESTE 15: Refazendo todas as ações ---");
        while (caretaker.podeRefazer()) {
            caretaker.redo();
        }
        mapa.exibirMapa();
        caretaker.exibirStatus();
        
        // TESTE 16: Demonstrando que o Prototype funciona (clonagem profunda)
        System.out.println("\n--- TESTE 16: Verificando clonagem profunda (Prototype) ---");
        System.out.println("Criando uma nova unidade e adicionando ao mapa...");
        Unidade unidadeOriginal = new Unidade("Cavaleiro", 30, 30, 150);
        mapa.adicionarElemento(unidadeOriginal);
        mapa.exibirMapa();
    }
}
