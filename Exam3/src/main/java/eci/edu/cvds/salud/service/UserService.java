package eci.edu.cvds.salud.service;

import eci.edu.cvds.salud.model.UserModel;
import eci.edu.cvds.salud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserModel createUser(UserModel userModel){
        return userRepository.save(userModel);
    }
}
