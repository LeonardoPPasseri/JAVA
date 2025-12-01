package Padroes_De_Software.Atividade5.Memento;
import java.util.ArrayList;
import java.util.List;

import Padroes_De_Software.Atividade5.Elementos.Elemento;

public class Mapa {
    private List<Elemento> elementos;
    private Caretaker caretaker;
    
    public Mapa(Caretaker caretaker) {
        this.elementos = new ArrayList<>();
        this.caretaker = caretaker;
        salvarEstado();
    }
    
    public void adicionarElemento(Elemento elemento) {
        elementos.add(elemento);
        salvarEstado();
    }
    
    public void removerElemento(Elemento elemento) {
        elementos.remove(elemento);
        salvarEstado();
    }
    
    public void removerElementoPorIndice(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            elementos.remove(indice);
            salvarEstado();
        }
    }
    
    private void salvarEstado() {
        MapaMemento memento = new MapaMemento(elementos);
        caretaker.adicionarMemento(memento);
    }
    
    public void restaurarEstado(MapaMemento memento) {
        this.elementos = memento.getEstadoSalvo();
    }
    
    public void exibirMapa() {
        System.out.println("\n========== ESTADO ATUAL DO MAPA ==========");
        if (elementos.isEmpty()) {
            System.out.println("(Mapa vazio)");
        } else {
            for (int i = 0; i < elementos.size(); i++) {
                System.out.println((i + 1) + ". " + elementos.get(i));
            }
        }
        System.out.println("==========================================\n");
    }
    
    public int getQuantidadeElementos() {
        return elementos.size();
    }
}
