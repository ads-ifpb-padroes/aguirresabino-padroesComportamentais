package chainOfResponsability.slots;

import java.math.BigDecimal;

public abstract class SlotChain {

    //proximo slot
    protected SlotChain next;
    //representa o valor que o slot deve receber
    protected final BigDecimal coin;
    protected BigDecimal count;

    public SlotChain(SlotChain next, BigDecimal coin){
        this.count = BigDecimal.ZERO;
        this.coin = coin;
        this.next = next;
    }

    public SlotChain(BigDecimal coin){
        this.count = BigDecimal.ZERO;
        this.coin = coin;
        this.next = null;
    }


    public void setNext(SlotChain next) {
        if(next == null) this.next = next;
        else this.next.setNext(next);
    }

    public boolean insertCoin(BigDecimal coin){
        boolean response = true;
        if(validCoin(coin)) {
            this.count = this.count.add(coin);
        }
        else if(next != null) next.insertCoin(coin);
        else {
            response = false;
            throw new RuntimeException("Não existe um slot que receba esta moeda.");
        }

        return response;
    }

    public boolean validCoin(BigDecimal coin){
        if (this.coin.equals(coin)) return true;
        return false;
    }

    public boolean retirarProduto(BigDecimal value){
        boolean response = true;
        if(this.count.compareTo(value) >= 0){
            this.count = this.count.subtract(value);
        }
        else if(this.count.compareTo(value) == -1 && this.next != null){
            this.next.retirarProduto(value.subtract(this.count));
        }
        else {
            response = false;
            throw new RuntimeException("Você depositou um valor insuficiente para retirar este produto.");
        }

        return response;
    }
}