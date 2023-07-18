package com.eriksandoval.repositorybasedjpaservicedemoproject;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // This is a JPA Entity.
@Data // Lombok annotation to generate getters, setters, toString, etc.
@NoArgsConstructor // Lombok annotation to generate a no-args constructor.
@AllArgsConstructor // Lombok annotation to generate an all-args constructor.
public class Aircraft {

    @Id // This is a JPA Entity primary key.
    @GeneratedValue // This primary key is auto-generated.
    private Long id;

    private String callsign, squawk, reg, flightno, route, type, category;

    private int altitude, heading, speed;

    @JsonProperty("vert_rate")
    private int vertRate;
    @JsonProperty("selected_altitude")
    private int selectedAltitude;
    
    private double lat, lon, barometer;

    @JsonProperty("polar_distance")
    private double polarDistance;
    @JsonProperty("polar_bearing")
    private double polarBearing;

    @JsonProperty("is_adsb")
    private boolean isADSB;
    @JsonProperty("is_on_ground")
    private boolean isOnGround;

    @JsonProperty("last_seen_time")
    private Instant lastSeenTime;
    @JsonProperty("pos_update_time")
    private Instant posUpdateTime;
    @JsonProperty("bds40_seen_time")
    private Instant bds40SeenTime;
}
