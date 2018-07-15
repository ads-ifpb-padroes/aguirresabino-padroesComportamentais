package state.states;

public class SemaforoVerde implements SemaforoState {
    @Override
    public SemaforoState tick() {
        return new SemaforoAmarelo();
    }

    @Override
    public SemaforoState panic() {
        return new SemaforoPanic();
    }

    @Override
    public SemaforoState off() {
        return new SemaforoOff();
    }

    @Override
    public SemaforoState on() {
        return this;
    }

    @Override
    public String status() {
        return "VERDE";
    }
}
