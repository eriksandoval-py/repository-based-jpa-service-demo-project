package com.eriksandoval.repositorybasedjpaservicedemoproject;

import java.time.Instant;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;

@Component // Can be disabled by commenting out this line
@AllArgsConstructor
public class DataLoader {

    private final AircraftRepository repository;

    @PostConstruct
    private void loadData() {
        repository.deleteAll();
        repository.save(new Aircraft(81L,
        "AAL608", "1451", "N754UW", "AA608", "IND-PHX", "A319", "A3",
        3600, 255, 423, 0, 3600,
        39.150284, -90.684795, 1012.8, 26.575562, 295.501994,
        true, false,
        Instant.parse("2020-11-27T21:29:35Z"), 
        Instant.parse("2020-11-27T21:29:35Z"),
        Instant.parse("2020-11-27T21:29:35Z")));
    }
    
}
