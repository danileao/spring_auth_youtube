package authentication.authentication.modules.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import authentication.authentication.modules.user.entities.User;
import authentication.authentication.modules.user.services.CreateUserService;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  CreateUserService createUserService;

  @PostMapping("/create")
  public User create(@RequestBody User user) {
    return createUserService.execute(user);
  }

}
