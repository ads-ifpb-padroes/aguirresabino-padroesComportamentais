package command.aparelhos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Som {

    public void ligarSom(LocalDateTime data){
        System.out.println("Ligar o som em: "+ data.toString());
    }

    public void desligarSom(LocalDateTime data){
        System.out.println("Desligar o som em: "+ data.toString());
    }
}
