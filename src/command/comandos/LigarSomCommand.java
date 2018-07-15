package command.comandos;

import command.aparelhos.Som;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LigarSomCommand implements Comando {

    private Som som;
    private LocalDateTime data;

    public LigarSomCommand(Som som, LocalDateTime data){
        this.som = som;
        this.data = data;
    }

    @Override
    public void executar() {
        som.ligarSom(data);
    }
}