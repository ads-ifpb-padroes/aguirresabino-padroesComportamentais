package chainOfResponsability.slots;

import java.math.BigDecimal;

public class Slot50 extends SlotChain {

    public Slot50() {
        super(new BigDecimal(0.50));
        System.out.println("Slot50");
    }

    public Slot50(SlotChain next) {
        super(next, new BigDecimal(0.50));
        System.out.println("Slot50");
    }

}
