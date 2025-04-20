package dio.web.dio_challenge.strategy;

import dio.web.dio_challenge.model.Payment;

public class Pix extends PaymentStrategy {
    @Override
    public boolean process(Payment p) {
        return true;
    }
}
