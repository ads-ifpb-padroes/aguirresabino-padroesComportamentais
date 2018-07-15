package command;

import command.aparelhos.ArCondicionado;
import command.aparelhos.Som;
import command.aparelhos.Televisao;
import command.comandos.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Invocador {

    public void ligarAr(ArCondicionado ar, int temp){
        LigarArCommand ligarArCommand = new LigarArCommand(ar, temp);
        ligarArCommand.executar();
    }

    public void desligarAr(ArCondicionado ar){
        DesligarArCommand desligarArCommand = new DesligarArCommand(ar);
        desligarArCommand.executar();
    }

    public void ligarSom(Som som, LocalDateTime data){
        LigarSomCommand ligarSomCommand = new LigarSomCommand(som, data);
        ligarSomCommand.executar();
    }

    public void desligarSom(Som som, LocalDateTime data){
        DesligarSomCommand desligarSomCommand = new DesligarSomCommand(som, data);
        desligarSomCommand.executar();
    }

    public void ligarTv(Televisao televisao){
        LigarTvCommand ligarTvCommand = new LigarTvCommand(televisao);
        ligarTvCommand.executar();
    }

    public void desligarTv(Televisao televisao){
        DesligarTvCommand desligarTvCommand = new DesligarTvCommand(televisao);
        desligarTvCommand.executar();
    }
}
