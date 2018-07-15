package observer.observadores;

import observer.forum.Topico;

public class NotificationObserver implements  Observador{
    @Override
    public void update(Topico topico) {
        System.out.println("OBSERVADOR NOTIFICATION");
        System.out.println(topico.toString());
    }
}
