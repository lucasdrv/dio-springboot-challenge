package dio.dio.springboot.challenge;

import dio.dio.springboot.challenge.model.User;
import dio.dio.springboot.challenge.service.UserRepository;
import dio.dio.springboot.challenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("GLEYSON");
        user.setUsername("glysns");
        user.setPassword("spring-data-jpa");
        user.setRoles(null);
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
