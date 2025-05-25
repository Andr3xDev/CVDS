package eci.edu.cvds.salud.controller;

import eci.edu.cvds.salud.model.UserModel;
import eci.edu.cvds.salud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserModel> createUser(@RequestBody UserModel userModel) {
        UserModel createdUser = userService.createUser(userModel);
        return ResponseEntity.ok(createdUser);
    }
}
