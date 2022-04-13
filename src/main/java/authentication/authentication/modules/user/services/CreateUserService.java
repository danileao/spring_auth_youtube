package authentication.authentication.modules.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import authentication.authentication.modules.user.UserRepository;
import authentication.authentication.modules.user.entities.User;

@Service
public class CreateUserService {

  @Autowired
  UserRepository userRepository;

  private BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  public User execute(User user) {

    User existsUser = userRepository.findByUsername(user.getUsername());

    if (existsUser != null) {
      throw new Error("User already exists!");
    }

    user.setPassword(passwordEncoder().encode(user.getPassword()));

    User createdUser = userRepository.save(user);

    return createdUser;
  }

}
