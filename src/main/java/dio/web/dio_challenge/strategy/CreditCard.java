package dio.web.dio_challenge.strategy;

import dio.web.dio_challenge.model.Payment;
import lombok.Getter;

@Getter
public class CreditCard extends PaymentStrategy {
    private static CreditCard instance = new CreditCard();
    public static CreditCard getInstance() {
        return instance;
    }

    private CreditCard() {}

    private final Integer parcelsLimit = 10;
    private final Integer approveMinLimit = 1000;

    @Override
    public boolean process(Payment p) {
        if(p.getPrice() < approveMinLimit) return false;
        return true;
    }
}
