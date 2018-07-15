package command.comandos;

import command.aparelhos.Som;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DesligarSomCommand implements Comando {

    private Som som;
    private LocalDateTime data;

    public DesligarSomCommand(Som som, LocalDateTime data){
        this.som = som;
        this.data = data;
    }

    @Override
    public void executar() {
        this.som.desligarSom(data);
    }
}
