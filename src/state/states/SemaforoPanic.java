package state.states;

public class SemaforoPanic implements SemaforoState {
    @Override
    public SemaforoState tick() {
        return this;
    }

    @Override
    public SemaforoState panic() {
        return this;
    }

    @Override
    public SemaforoState off() {
        return this;
    }

    @Override
    public SemaforoState on() {
        return new SemaforoVermelho();
    }

    @Override
    public String status() {
        return "VERMELHO PÂNICO";
    }
}
