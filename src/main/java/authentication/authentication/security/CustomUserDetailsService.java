package authentication.authentication.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import authentication.authentication.modules.user.UserRepository;
import authentication.authentication.modules.user.entities.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

    User existsUser = userRepository.findByUsernameFetchRoles(username);

    if (existsUser == null) {
      throw new Error("User does not exists!");
    }

    return UserPrincipal.create(existsUser);
  }

}
