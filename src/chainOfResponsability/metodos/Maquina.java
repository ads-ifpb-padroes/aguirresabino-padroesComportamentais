package chainOfResponsability.metodos;

import java.math.BigDecimal;

public class Maquina {

    private SlotChain slot;
    private BigDecimal amount;

    public Maquina(SlotChain slot){
        this.slot = slot;
        this.amount = BigDecimal.ZERO;
    }

    public SlotChain getSlot() {
        return slot;
    }

    public void setSlot(SlotChain slot) {
        this.slot = slot;
    }

    public BigDecimal getAmount(){
        return this.amount;
    }

    public void insertCoin(BigDecimal coin){
        if(slot.insertCoin(coin)) this.amount = amount.add(coin);
    }

    public void retirarProduto(BigDecimal value){
        if(slot.retirarProduto(value))
            this.amount = this.amount.subtract(value);
    }
}
