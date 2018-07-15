package state.main;

import state.model.Semaforo;

public class Main {
    public static void main(String args[]){
        Semaforo semaforo = new Semaforo();

        System.out.println(semaforo.status()); //amarelo intermitente
        semaforo.on();
        System.out.println(semaforo.status()); //vermelho
        semaforo.tick();
        System.out.println(semaforo.status()); //verde
        semaforo.panic();
        System.out.println(semaforo.status()); //vermelho panico
        semaforo.on();
        System.out.println(semaforo.status()); //vermelho
        semaforo.off();
        System.out.println(semaforo.status()); //amarelo intermitente
        semaforo.on();
        System.out.println(semaforo.status()); //vermelho
        semaforo.tick();
        System.out.println(semaforo.status()); //verde
        semaforo.tick();
        System.out.println(semaforo.status()); //amarelo
        semaforo.tick();
        System.out.println(semaforo.status()); //vermelho
    }
}
