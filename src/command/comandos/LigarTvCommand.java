package command.comandos;

import command.aparelhos.Televisao;

public class LigarTvCommand implements Comando {

    private Televisao televisao;

    public LigarTvCommand(Televisao televisao){
        this.televisao = televisao;
    }

    @Override
    public void executar() {
        televisao.ligarTv();
    }
}
