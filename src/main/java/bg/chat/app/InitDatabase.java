package bg.chat.app;

import bg.chat.app.db.entities.Authorities;
import bg.chat.app.db.entities.User;
import bg.chat.app.db.repositories.AuthoritiesRepository;
import bg.chat.app.db.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class InitDatabase implements CommandLineRunner {

    @Autowired
    private AuthoritiesRepository authoritiesRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {

        String username = "javainuse";

        User user = usersRepository.save(new User(username, passwordEncoder.encode("javainuse"), true, new HashSet<>()));

        authoritiesRepository.save(new Authorities(0, user.getUsername(), "ROLE_ADMIN"));

        user = usersRepository.save(new User("employee", passwordEncoder.encode("employee"), true, new HashSet<>()));

        authoritiesRepository.save(new Authorities(0, user.getUsername(), "ROLE_USER"));
    }
}
