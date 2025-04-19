package dio.web.dio_challenge.repository;

import dio.web.dio_challenge.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
