package dio.web.dio_challenge.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Column(name = "full_name", length = 255, nullable = false)
    private String fullName;

    @CPF
    @Id
    @Column(unique = true, nullable = false)
    private String cpf;
}
