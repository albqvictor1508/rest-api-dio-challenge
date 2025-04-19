package dio.web.dio_challenge.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.validator.constraints.br.CPF;

@Entity
public class PaymentData {
    @Id
    @CPF
    @Column(nullable = false, unique = true)
    private String cpf;
    @Column(name = "user_name", nullable = false)
    private String clientName;
    private
}
