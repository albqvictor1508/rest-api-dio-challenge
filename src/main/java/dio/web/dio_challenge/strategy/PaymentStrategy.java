package dio.web.dio_challenge.strategy;

import dio.web.dio_challenge.model.Payment;

public abstract class PaymentStrategy {
    public abstract boolean process(Payment p);
}
