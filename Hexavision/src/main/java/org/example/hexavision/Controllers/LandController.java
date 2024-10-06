package org.example.hexavision.Controllers;

import lombok.RequiredArgsConstructor;
import org.example.hexavision.Dto.LandAddRequest;
import org.example.hexavision.Dto.LandGetRequest;
import org.example.hexavision.Entities.Land;
import org.example.hexavision.Services.Abstracts.ILandService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/land")
@Validated
@RequiredArgsConstructor
@CrossOrigin(origins = "http://127.0.0.1:8081") // Allow CORS for this controller
public class LandController {
    private final ILandService landService;

    @PostMapping("/add")
    public void addLand(@Validated @RequestBody LandAddRequest landAddRequest) {
        landService.addLand(landAddRequest);
    }

    @PostMapping("/get")
    public List<Land> getLandsByUserId(@RequestBody LandGetRequest userId) {
        return landService.getLandsByUserId(userId.getUserId());
    }
}
