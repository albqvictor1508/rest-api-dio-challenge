package dio.web.dio_challenge.repository;

import dio.web.dio_challenge.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, String> {
}
