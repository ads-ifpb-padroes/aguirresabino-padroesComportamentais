package chainOfResponsability.model;

import java.math.BigDecimal;

public enum Produto {
    REFRIGERANTE(3.5), CHOCOLATE(1.0), SALGADINHO(2.0);

    private final BigDecimal coin;
    Produto(double coin){
        this.coin = new BigDecimal(coin);
    }

    public BigDecimal getValue(){
        return coin;
    }
}
