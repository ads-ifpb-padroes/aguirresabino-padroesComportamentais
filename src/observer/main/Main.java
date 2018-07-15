package observer.main;

import observer.forum.Forum;
import observer.forum.Topico;
import observer.observadores.EmailObserver;
import observer.observadores.NotificationObserver;
import observer.observadores.Observador;
import observer.observadores.SmsObserver;

public class Main {
    public static void main(String args[]){

        Observador email = new EmailObserver();
        Observador sms = new SmsObserver();
        Observador notification = new NotificationObserver();

        Topico topico1 = new Topico("Título 1", "Assunto 1");
        Topico topico2 = new Topico("Título 2", "Assunto 2");
        Topico topico3 = new Topico("Título 3", "Assunto 3");

        Forum forum = new Forum();

        forum.addObservador(email);
        forum.addObservador(sms);
        forum.addObservador(notification);

        forum.publicaTopico(topico1);

        forum.removeObservador(email);

        forum.publicaTopico(topico2);
    }
}
