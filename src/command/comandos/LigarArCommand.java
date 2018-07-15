package command.comandos;

import command.aparelhos.ArCondicionado;

public class LigarArCommand implements Comando {
    private int temperatura;
    private ArCondicionado ar;

    public LigarArCommand(ArCondicionado ar, int temperatura){
        this.ar = ar;
        this.temperatura = temperatura;
    }


    @Override
    public void executar() {
        ar.ligarAr(this.temperatura);
    }
}
