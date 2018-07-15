package command.comandos;

import command.aparelhos.Televisao;

public class DesligarTvCommand implements Comando {

    private Televisao televisao;

    public DesligarTvCommand(Televisao televisao){
        this.televisao = televisao;
    }

    @Override
    public void executar() {
        televisao.desligarTv();
    }
}
