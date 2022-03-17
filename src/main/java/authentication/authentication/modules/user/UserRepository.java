package authentication.authentication.modules.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import authentication.authentication.modules.user.entities.User;

public interface UserRepository extends JpaRepository<User, UUID> {

  User findByUsername(String username);

}
