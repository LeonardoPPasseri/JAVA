package Padroes_De_Software.Atividade5.Memento;
import java.util.ArrayList;
import java.util.List;

import Padroes_De_Software.Atividade5.Elementos.Elemento;


public class MapaMemento {
    private final List<Elemento> estadoSalvo;
    
    public MapaMemento(List<Elemento> elementos) {
        this.estadoSalvo = new ArrayList<>();
        for (Elemento elemento : elementos) {
            this.estadoSalvo.add(elemento.clone());
        }
    }
    
    public List<Elemento> getEstadoSalvo() {
        List<Elemento> copia = new ArrayList<>();
        for (Elemento elemento : estadoSalvo) {
            copia.add(elemento.clone());
        }
        return copia;
    }
}
