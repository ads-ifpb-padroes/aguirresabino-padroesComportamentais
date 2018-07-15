package chainOfResponsability.main;

import chainOfResponsability.slots.*;
import chainOfResponsability.model.Maquina;
import chainOfResponsability.model.Produto;

import java.math.BigDecimal;
import java.util.Locale;

public class Main {

    public static void main(String args[]){
        Maquina maquina = new Maquina(new Slot1(new Slot10(new Slot50())));

        maquina.insertCoin(new BigDecimal(0.50));
        maquina.insertCoin(new BigDecimal(0.50));
        maquina.insertCoin(new BigDecimal(0.50));
        maquina.insertCoin(new BigDecimal(1.0));
        //maquina.insertCoin(new BigDecimal(1.50));


        String resultado = String.format(Locale.getDefault(), "%.2f", maquina.getAmount());
        System.out.println("Total na máquina: " + resultado);
        System.out.println(maquina.getAmount());

        maquina.retirarProduto(Produto.CHOCOLATE.getValue());
        resultado = String.format(Locale.getDefault(), "%.2f", maquina.getAmount());
        System.out.println("Total na máquina depois de pagar: " + resultado);
        System.out.println(maquina.getAmount());
    }
}