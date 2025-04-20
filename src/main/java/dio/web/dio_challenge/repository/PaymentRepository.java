package dio.web.dio_challenge.repository;

import dio.web.dio_challenge.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}

//cada pagamento vai ter o id do cliente, o tipo de pagamento vai ser passado como string, vou comparar com o label do meu enum e vou guardar
// no banco como string mesmo pra poupar tempo
//crio CRUD de pagamento e findById do cliente e entrego a api sepa