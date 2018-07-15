package state.states;

public interface SemaforoState {

    SemaforoState tick();
    SemaforoState panic();
    SemaforoState off();
    SemaforoState on();
    String status();

}
