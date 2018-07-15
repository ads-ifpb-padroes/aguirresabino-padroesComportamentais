package command.aparelhos;

public class ArCondicionado {

    private boolean ligado;
    private int temperatura;

    public ArCondicionado(){
        this.ligado = false;
    }

    public void ligarAr(int temperatura){
        this.ligado = true;
        this.temperatura = temperatura;
        System.out.println("Ar ligado. Temperatura: " + temperatura);
    }

    public void desligarAr(){
        this.ligado = false;
        System.out.println("Ar desligado");
    }
}
