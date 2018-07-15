package state.model;

import state.states.SemaforoOff;
import state.states.SemaforoState;

public class Semaforo {

    private SemaforoState state;

    public Semaforo(){
        state = new SemaforoOff();
    }

    public void tick() {
        state = state.tick();
    }

    public void panic() {
        state = state.panic();
    }

    public void off() {
        state = state.off();
    }

    public void on() {
        state = state.on();
    }

    public String status() {
       return state.status();
    }
}
