package org.example.hexavision.Services.Abstracts;

import org.example.hexavision.Dto.LandAddRequest;
import org.example.hexavision.Entities.Land;

import java.util.List;

public interface ILandService {
    public Land addLand(LandAddRequest land);
    public List<Land> getLandsByUserId(Integer userId);
}
