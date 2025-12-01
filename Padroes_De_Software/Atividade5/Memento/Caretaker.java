package Padroes_De_Software.Atividade5.Memento;

import java.util.Stack;


public class Caretaker {
    private Stack<MapaMemento> historicoUndo;
    private Stack<MapaMemento> historicoRedo;
    private Mapa mapa;
    private MapaMemento estadoAtual;
    
    public Caretaker() {
        this.historicoUndo = new Stack<>();
        this.historicoRedo = new Stack<>();
    }
    
    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }
    
    public void adicionarMemento(MapaMemento memento) {
        if (estadoAtual != null) {
            historicoUndo.push(estadoAtual);
        }
        estadoAtual = memento;
        historicoRedo.clear();
    }
    
    public void undo() {
        if (!podeDesfazer()) {
            System.out.println("Não há ações para desfazer!");
            return;
        }
        
        historicoRedo.push(estadoAtual);
        estadoAtual = historicoUndo.pop();
        mapa.restaurarEstado(estadoAtual);
        System.out.println("Ação desfeita!");
    }
    
    public void redo() {
        if (!podeRefazer()) {
            System.out.println("Não há ações para refazer!");
            return;
        }
        
        historicoUndo.push(estadoAtual);
        estadoAtual = historicoRedo.pop();
        mapa.restaurarEstado(estadoAtual);
        System.out.println("Ação refeita!");
    }
    
    public boolean podeDesfazer() {
        return !historicoUndo.isEmpty();
    }
    
    public boolean podeRefazer() {
        return !historicoRedo.isEmpty();
    }
    
    public void exibirStatus() {
        System.out.println("Status do histórico:");
        System.out.println("Ações disponíveis para desfazer: " + historicoUndo.size());
        System.out.println("Ações disponíveis para refazer: " + historicoRedo.size());
    }
}
