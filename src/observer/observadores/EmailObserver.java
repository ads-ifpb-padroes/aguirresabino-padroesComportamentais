package observer.observadores;

import observer.forum.Topico;

public class EmailObserver implements Observador {
    @Override
    public void update(Topico topico) {
        System.out.println("OBSERVADOR EMAIL");
        System.out.println(topico.toString());
    }
}
