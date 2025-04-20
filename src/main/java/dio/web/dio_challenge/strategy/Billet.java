package dio.web.dio_challenge.strategy;

import dio.web.dio_challenge.model.Payment;

public class Billet extends PaymentStrategy {

    @Override
    public boolean process(Payment p) {
        return true;
    }
}
