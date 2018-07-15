package observer.observadores;

import observer.forum.Topico;

public class SmsObserver implements Observador {
    @Override
    public void update(Topico topico) {
        System.out.println("OBSERVADOR SMS");
        System.out.println(topico.toString());
    }
}
