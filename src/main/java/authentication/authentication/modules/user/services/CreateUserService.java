package authentication.authentication.modules.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import authentication.authentication.modules.user.UserRepository;
import authentication.authentication.modules.user.entities.User;

@Service
public class CreateUserService {

  @Autowired
  UserRepository userRepository;

  public User execute(User user) {

    User existsUser = userRepository.findByUsername(user.getUsername());

    if (existsUser != null) {
      throw new Error("User already exists!");
    }

    User createdUser = userRepository.save(user);

    return createdUser;
  }

}
