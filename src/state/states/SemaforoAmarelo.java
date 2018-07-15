package state.states;

public class SemaforoAmarelo implements SemaforoState {
    @Override
    public SemaforoState tick() {
        return new SemaforoVermelho();
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
        return "AMARELO";
    }
}
