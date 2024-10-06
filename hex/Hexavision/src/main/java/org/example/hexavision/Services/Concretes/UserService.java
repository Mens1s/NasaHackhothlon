package org.example.hexavision.Services.Concretes;

import lombok.RequiredArgsConstructor;
import org.example.hexavision.Dto.LoginRequest;
import org.example.hexavision.Dto.UserAddRequest;
import org.example.hexavision.Entities.User;
import org.example.hexavision.Repositories.UserRepository;
import org.example.hexavision.Services.Abstracts.IUserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;
    @Override
    public void addUser(UserAddRequest user) {
        if(userRepository.findByEmail(user.getEmail()) != null){
            throw new RuntimeException("User already exists with email: " + user.getEmail());
        }
        User newUser = new User();
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        newUser.setUsername(user.getUsername());

        userRepository.save(newUser);

    }

    @Override
    public void Login(LoginRequest loginRequest) {
        if(userRepository.findByEmail(loginRequest.getEmail()) == null){
            throw new RuntimeException("User not found with email: " + loginRequest.getEmail());
        }
        User user = userRepository.findByEmail(loginRequest.getEmail());
        if(!user.getPassword().equals(loginRequest.getPassword())){
            throw new RuntimeException("Password is incorrect");
        }
    }


}
