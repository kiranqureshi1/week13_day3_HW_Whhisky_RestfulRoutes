package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {
    public List<Whisky> findWhiskiesFromADistilleryWithSpecificAge(String name, int age);
    public List<Whisky> findWhiskyByRegion(String name, String region);
}
