package dio.dio.springboot.challenge.service;

import dio.dio.springboot.challenge.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Integer> {

}
