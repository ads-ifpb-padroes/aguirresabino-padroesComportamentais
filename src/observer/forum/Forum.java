package observer.forum;

import observer.observadores.Observador;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<Topico> topicos;
    private List<Observador> observadores;

    public Forum() {
        topicos = new ArrayList<>();
        observadores = new ArrayList<>();
    }

    public List<Topico> getTopicos() {
        return topicos;
    }

    public void setTopicos(List<Topico> topicos) {
        this.topicos = topicos;
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }

    public void addObservador(Observador o){
        observadores.add(o);
    }

    public void removeObservador(Observador o ){
        observadores.remove(o);
    }

    public void publicaTopico(Topico t){
        topicos.add(t);
        notificar(t);
    }

    private void notificar(Topico t){
        for(Observador o : observadores){
            o.update(t);
        }
    }
}
