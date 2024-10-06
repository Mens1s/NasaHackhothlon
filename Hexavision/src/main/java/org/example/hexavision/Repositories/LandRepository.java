package org.example.hexavision.Repositories;

import org.example.hexavision.Entities.Land;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LandRepository extends JpaRepository<Land, Integer> {
    List<Land> findByUserId(Integer userId);
}
