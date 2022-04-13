package authentication.authentication.modules.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import authentication.authentication.modules.user.dto.CreateUserRoleDTO;
import authentication.authentication.modules.user.entities.User;
import authentication.authentication.modules.user.services.CreateRoleUserService;
import authentication.authentication.modules.user.services.CreateUserService;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  CreateUserService createUserService;

  @Autowired
  CreateRoleUserService createRoleUserService;

  @PostMapping("/create")
  public User create(@RequestBody User user) {
    return createUserService.execute(user);
  }

  @PostMapping("/role")
  public User role(@RequestBody CreateUserRoleDTO createUserRoleDTO) {
    return createRoleUserService.execute(createUserRoleDTO);
  }

}
