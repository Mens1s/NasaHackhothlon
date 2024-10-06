package org.example.hexavision.Services.Abstracts;

import org.example.hexavision.Dto.LoginRequest;
import org.example.hexavision.Dto.UserAddRequest;

public interface IUserService {
    public void addUser(UserAddRequest user);
    public void Login(LoginRequest loginRequest);
}
