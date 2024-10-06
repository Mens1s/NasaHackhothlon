package org.example.hexavision.Controllers;

import lombok.RequiredArgsConstructor;
import org.example.hexavision.Dto.LoginRequest;
import org.example.hexavision.Dto.UserAddRequest;
import org.example.hexavision.Services.Abstracts.IUserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://127.0.0.1:8081") // Allow CORS for this controller
public class UserController {
    private final IUserService userService;

    @PostMapping("/add")
    public void addUser(@Validated @RequestBody UserAddRequest userAddRequest) {
        userService.addUser(userAddRequest);
    }

    @PostMapping("/login")
    public void login(@Validated @RequestBody LoginRequest loginRequest) {
        userService.Login(loginRequest);
    }
}
