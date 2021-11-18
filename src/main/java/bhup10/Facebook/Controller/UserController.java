package bhup10.Facebook.Controller;

import bhup10.Facebook.Entity.User;
import bhup10.Facebook.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return (List<User>) userService.getAllUser();
    }

    @GetMapping("/userById/{id}")
    public User userById(@PathVariable int id) {
        return userService.userById(id);

    }

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "Data Created";
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "Data Deleted";
    }
    @PutMapping("/updateUser/{id}")
    public User updateUser(@PathVariable int id,@RequestBody User user){
        userService.updateUser(id, user);
        return user;
    }
}
