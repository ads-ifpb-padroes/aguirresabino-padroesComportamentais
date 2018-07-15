package chainOfResponsability.metodos;

import java.math.BigDecimal;

public class Slot10 extends SlotChain {

    public Slot10() {
        super(new BigDecimal(0.10));
        System.out.println("Slot10");
    }

    public Slot10(SlotChain next) {
        super(next, new BigDecimal(0.10));
        System.out.println("Slot10");
    }
}
