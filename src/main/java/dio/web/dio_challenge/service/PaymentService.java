package dio.web.dio_challenge.service;

import dio.web.dio_challenge.model.Payment;
import dio.web.dio_challenge.repository.ClientRepository;
import dio.web.dio_challenge.repository.PaymentRepository;
import dio.web.dio_challenge.strategy.CreditCard;
import dio.web.dio_challenge.strategy.PaymentStrategy;

import dio.web.dio_challenge.types.PaymentEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepo;
    @Autowired
    private ClientRepository clientRepo;

    public Payment createPayment(Payment p) {
        if(!clientRepo.existsById(p.getClient().getCpf())) return null;
        return paymentRepo.save(p);
    }

    public Payment findPaymentById(Long id) {
        return paymentRepo.findById(id).orElse(null);
    }

    public void deletePaymentById(Long id) {
         if(!paymentRepo.existsById(id)) return;
    }

    public Payment realizePayment(Long id) {
        Payment p = paymentRepo.findById(id).orElseThrow(() -> new RuntimeException("user not finded"));
        boolean result = setPaymentStrategy(p);
        p.setPayed(true);
        return p;
    }

    private PaymentStrategy setPaymentStrategy(Payment payment) {
        String label = payment.getPaymentType();
        String paymentType = Arrays.stream(PaymentEnum.values()).filter(p -> p.getLabel().equalsIgnoreCase(label)).findFirst().get().toString();
    }
}
