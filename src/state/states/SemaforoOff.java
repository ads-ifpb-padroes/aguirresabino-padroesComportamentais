package state.states;

public class SemaforoOff implements SemaforoState {
    @Override
    public SemaforoState tick() {
        return this;
    }

    @Override
    public SemaforoState panic() {
        return new SemaforoPanic();
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
        return "AMARELO INTERMITENTE";
    }
}
