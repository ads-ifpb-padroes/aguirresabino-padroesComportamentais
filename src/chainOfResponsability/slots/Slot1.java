package chainOfResponsability.slots;

import java.math.BigDecimal;

public class Slot1 extends SlotChain {

    public Slot1() {
        super(new BigDecimal(1.0));
        System.out.println("Slot1");
    }

    public Slot1(SlotChain next) {
        super(next, new BigDecimal(1.0));
        System.out.println("Slot1");
    }
}