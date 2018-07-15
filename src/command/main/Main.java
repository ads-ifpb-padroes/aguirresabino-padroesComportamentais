package command.main;

import command.Invocador;
import command.aparelhos.ArCondicionado;
import command.aparelhos.Som;
import command.aparelhos.Televisao;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String args[]){
        ArCondicionado ar = new ArCondicionado();
        Som som = new Som();
        Televisao televisao = new Televisao();

        Invocador invocador = new Invocador();

        invocador.ligarAr(ar, 50);
        invocador.ligarSom(som, LocalDateTime.now());
        invocador.ligarTv(televisao);

        invocador.desligarAr(ar);
        invocador.desligarSom(som, LocalDateTime.now());
        invocador.desligarTv(televisao);
    }
}
