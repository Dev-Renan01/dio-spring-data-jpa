package dio.spring_data_jpa;

import dio.spring_data_jpa.model.User;
import dio.spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setName("Suany Souza");
        user1.setUserName("SuanyDev");
        user1.setPassword("1436");
        repository.save(user1);

        User user2 = new User();
        user2.setName("Renan");
        user2.setUserName("RDev");
        user2.setPassword("1241456");
        repository.save(user2);

        User user3 = new User();
        user3.setName("Regis");
        user3.setUserName("RegisDev");
        user3.setPassword("123455436");
        repository.save(user3);

        User user4 = new User();
        user4.setName("Irani");
        user4.setUserName("Iranilda");
        user4.setPassword("12345654");
        repository.save(user4);

        for(User u : repository.findAll()){
            System.out.println(u);
        }

    }

}
