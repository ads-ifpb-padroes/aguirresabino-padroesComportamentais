package state.states;

public class SemaforoVermelho implements SemaforoState {
    @Override
    public SemaforoState tick() {
        return new SemaforoVerde();
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
        return "VERMELHO";
    }
}
