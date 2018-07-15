package command.comandos;

import command.aparelhos.ArCondicionado;

public class DesligarArCommand implements Comando {

    private ArCondicionado ar;

    public DesligarArCommand(ArCondicionado ar){
        this.ar = ar;
    }

    @Override
    public void executar() {
        ar.desligarAr();
    }
}
