package dts.com.digitizing.controller;

import dts.com.digitizing.entity.LeaveInformation;
import dts.com.digitizing.entity.User;
import dts.com.digitizing.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/user")
public class UserController {
    private final UserService  userService;

    public UserController(UserService userService) {this.userService = userService;}

    @PostMapping("/createU")
    public void createU(@RequestBody User user) {

        userService.createU(user);
    }

    @GetMapping("/findAllU")
    public List<User> getAllU() {
        return userService.fillAllU();
    }

    @GetMapping("/findOneU/{id}")
    public User getOneLe(@PathVariable("id") String id) {
        return userService.getOneU(id);
    }

    @PutMapping("/editU{id}")
    public void editU(@PathVariable("id") String id, @RequestBody User user) {
        userService.editU(id, user);
    }

    @DeleteMapping("/deleteAllu")
    public void deleteU() {
        userService.deleteAllU();
    }

    @DeleteMapping("/deleteOneU/{id}")
    public void deleteU(@PathVariable("id") String id) {
        userService.deleteOneU(id);
    }
}
