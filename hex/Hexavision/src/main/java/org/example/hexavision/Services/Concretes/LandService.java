package org.example.hexavision.Services.Concretes;

import lombok.RequiredArgsConstructor;
import org.example.hexavision.Dto.LandAddRequest;
import org.example.hexavision.Entities.Land;
import org.example.hexavision.Entities.User;
import org.example.hexavision.Repositories.LandRepository;
import org.example.hexavision.Repositories.UserRepository;
import org.example.hexavision.Services.Abstracts.ILandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LandService implements ILandService {

    private final LandRepository landRepository;
    private final UserRepository userRepository;

    @Override
    public Land addLand(LandAddRequest landReq) {
        // İlk olarak kullanıcıyı buluyoruz
        Optional<User> userOptional = userRepository.findById(landReq.getUserId());
        Land land = new Land();

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            land.setDescription(landReq.getDescription());
            land.setName(landReq.getName());
            land.setX1(landReq.getX1());
            land.setX2(landReq.getX2());
            land.setX3(landReq.getX3());
            land.setX4(landReq.getX4());
            land.setY1(landReq.getY1());
            land.setY2(landReq.getY2());
            land.setY3(landReq.getY3());
            land.setY4(landReq.getY4());

            land.setUser(user);

            return landRepository.save(land);
        } else {
            throw new RuntimeException("User not found with id: " + landReq.getUserId());
        }
    }

    @Override
    public List<Land> getLandsByUserId(Integer userId) {
        return landRepository.findByUserId(userId);
    }
}
