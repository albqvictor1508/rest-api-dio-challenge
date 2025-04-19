package dio.web.dio_challenge.strategy;

import dio.web.dio_challenge.dtos.PaymentData;
import dio.web.dio_challenge.types.PaymentEnum;

import java.util.Arrays;
import java.util.List;

public abstract class IPayment {
    private PaymentEnum paymentType;
        //paymentType = Arrays.stream(PaymentEnum.values()).filter(pt -> pt.getLabel().equalsIgnoreCase(label)).findFirst().get();
    abstract boolean process(PaymentData data);
}
