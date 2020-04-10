package bg.chat.app.db.repositories;

import bg.chat.app.db.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, String> {
}
